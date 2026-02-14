
public class Pruebas {

	# Create project structure and files for the SOAP to-do service and client

	import os, textwrap, json, zipfile, pathlib

	base_dir = "/mnt/data/soap-todo"
	service_dir = os.path.join(base_dir, "service")
	client_dir = os.path.join(base_dir, "client")

	# Create directories
	paths = [
	    service_dir,
	    os.path.join(service_dir, "src/main/java/com/example/todo"),
	    os.path.join(service_dir, "src/main/resources"),
	    os.path.join(service_dir, "src/main/webapp/WEB-INF"),
	    os.path.join(service_dir, "src/main/webapp"),
	    client_dir,
	    os.path.join(client_dir, "src/main/java/com/example/todo/client"),
	    os.path.join(client_dir, "stubs") # placeholder for generated sources
	]
	for p in paths:
	    os.makedirs(p, exist_ok=True)

	# Service pom.xml (WAR for a Java EE container like GlassFish/Payara)
	service_pom = """\
	<project xmlns="http://maven.apache.org/POM/4.0.0"
	         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	  <modelVersion>4.0.0</modelVersion>
	  <groupId>com.example</groupId>
	  <artifactId>task-service</artifactId>
	  <version>1.0.0</version>
	  <packaging>war</packaging>

	  <properties>
	    <maven.compiler.source>1.8</maven.compiler.source>
	    <maven.compiler.target>1.8</maven.compiler.target>
	    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	  </properties>

	  <dependencies>
	    <!-- In a Java EE container (GlassFish/Payara), these are provided by the server -->
	    <dependency>
	      <groupId>javax.xml.ws</groupId>
	      <artifactId>jaxws-api</artifactId>
	      <version>2.3.1</version>
	      <scope>provided</scope>
	    </dependency>
	    <dependency>
	      <groupId>javax.xml.bind</groupId>
	      <artifactId>jaxb-api</artifactId>
	      <version>2.3.1</version>
	      <scope>provided</scope>
	    </dependency>
	  </dependencies>

	  <build>
	    <plugins>
	      <plugin>
	        <groupId>org.apache.maven.plugins</groupId>
	        <artifactId>maven-war-plugin</artifactId>
	        <version>3.3.2</version>
	        <configuration>
	          <failOnMissingWebXml>false</failOnMissingWebXml>
	        </configuration>
	      </plugin>
	    </plugins>
	  </build>
	</project>
	"""

	# Web.xml and sun-jaxws.xml to expose the endpoint cleanly in Metro-based containers
	web_xml = """\
	<?xml version="1.0" encoding="UTF-8"?>
	<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
	         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
	         version="3.1">
	  <servlet>
	    <servlet-name>TaskService</servlet-name>
	    <servlet-class>com.sun.xml.ws.transport.http.servlet.WSServlet</servlet-class>
	    <load-on-startup>1</load-on-startup>
	  </servlet>

	  <servlet-mapping>
	    <servlet-name>TaskService</servlet-name>
	    <url-pattern>/TaskService</url-pattern>
	  </servlet-mapping>
	</web-app>
	"""

	sun_jaxws = """\
	<?xml version="1.0" encoding="UTF-8"?>
	<endpoints
	    xmlns="http://java.sun.com/xml/ns/jax-ws/ri/runtime"
	    version="2.0">
	  <endpoint
	      name="TaskService"
	      implementation="com.example.todo.TaskService"
	      url-pattern="/TaskService"/>
	</endpoints>
	"""

	# Task and TaskService classes
	task_java = """\
	package com.example.todo;

	import java.io.Serializable;
	import javax.xml.bind.annotation.XmlAccessType;
	import javax.xml.bind.annotation.XmlAccessorType;
	import javax.xml.bind.annotation.XmlType;

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "Task")
	public class Task implements Serializable {
	    private static final long serialVersionUID = 1L;

	    private int id;
	    private String descripcion;

	    public Task() {}

	    public Task(int id, String descripcion) {
	        this.id = id;
	        this.descripcion = descripcion;
	    }

	    public int getId() { return id; }
	    public void setId(int id) { this.id = id; }

	    public String getDescripcion() { return descripcion; }
	    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

	    @Override
	    public String toString() {
	        return "Task{id=" + id + ", descripcion='" + descripcion + "'}";
	    }
	}
	"""

	service_java = """\
	package com.example.todo;

	import javax.jws.WebMethod;
	import javax.jws.WebService;
	import javax.jws.HandlerChain;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.concurrent.atomic.AtomicInteger;

	@WebService(name = "TaskService", serviceName = "TaskService", portName = "TaskServicePort", targetNamespace = "http://todo.example.com/")
	@HandlerChain(file = "handler-chain.xml")
	public class TaskService {

	    private static final List<Task> tasks = Collections.synchronizedList(new ArrayList<>());
	    private static final AtomicInteger seq = new AtomicInteger(1);

	    @WebMethod
	    public Task crearTarea(String descripcion) {
	        Task t = new Task(seq.getAndIncrement(), descripcion);
	        tasks.add(t);
	        return t;
	    }

	    @WebMethod
	    public List<Task> listarTareas() {
	        return new ArrayList<>(tasks);
	    }

	    @WebMethod
	    public boolean borrarTarea(int id) {
	        return tasks.removeIf(t -> t.getId() == id);
	    }
	}
	"""

	# Logging SOAP Handler
	handler_chain_xml = """\
	<?xml version="1.0" encoding="UTF-8"?>
	<handler-chains xmlns="http://java.sun.com/xml/ns/javaee">
	  <handler-chain>
	    <handler>
	      <handler-class>com.example.todo.LoggingHandler</handler-class>
	    </handler>
	  </handler-chain>
	</handler-chains>
	"""

	logging_handler_java = """\
	package com.example.todo;

	import javax.xml.namespace.QName;
	import javax.xml.ws.handler.MessageContext;
	import javax.xml.ws.handler.soap.SOAPHandler;
	import javax.xml.ws.handler.soap.SOAPMessageContext;
	import javax.xml.soap.SOAPMessage;
	import java.util.Set;

	public class LoggingHandler implements SOAPHandler<SOAPMessageContext> {

	    @Override
	    public boolean handleMessage(SOAPMessageContext context) {
	        Boolean outbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
	        log(context, outbound != null && outbound);
	        return true;
	        }

	    @Override
	    public boolean handleFault(SOAPMessageContext context) {
	        log(context, false);
	        return true;
	    }

	    private void log(SOAPMessageContext context, boolean outbound) {
	        try {
	            SOAPMessage msg = context.getMessage();
	            System.out.println(\"===== SOAP \" + (outbound ? \"OUTBOUND\" : \"INBOUND\") + \" =====\");
	            msg.writeTo(System.out);
	            System.out.println(\"\\n===============================\\n\");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void close(MessageContext context) {}

	    @Override
	    public Set<QName> getHeaders() { return null; }
	}
	"""

	# Place files
	with open(os.path.join(service_dir, "pom.xml"), "w", encoding="utf-8") as f:
	    f.write(service_pom)
	with open(os.path.join(service_dir, "src/main/webapp/WEB-INF/web.xml"), "w", encoding="utf-8") as f:
	    f.write(web_xml)
	with open(os.path.join(service_dir, "src/main/webapp/WEB-INF/sun-jaxws.xml"), "w", encoding="utf-8") as f:
	    f.write(sun_jaxws)
	with open(os.path.join(service_dir, "src/main/java/com/example/todo/Task.java"), "w", encoding="utf-8") as f:
	    f.write(task_java)
	with open(os.path.join(service_dir, "src/main/java/com/example/todo/TaskService.java"), "w", encoding="utf-8") as f:
	    f.write(service_java)
	with open(os.path.join(service_dir, "src/main/resources/handler-chain.xml"), "w", encoding="utf-8") as f:
	    f.write(handler_chain_xml)
	with open(os.path.join(service_dir, "src/main/java/com/example/todo/LoggingHandler.java"), "w", encoding="utf-8") as f:
	    f.write(logging_handler_java)

	# Client pom.xml
	client_pom = """\
	<project xmlns="http://maven.apache.org/POM/4.0.0"
	         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	  <modelVersion>4.0.0</modelVersion>
	  <groupId>com.example</groupId>
	  <artifactId>task-client</artifactId>
	  <version>1.0.0</version>
	  <packaging>jar</packaging>

	  <properties>
	    <maven.compiler.source>1.8</maven.compiler.source>
	    <maven.compiler.target>1.8</maven.compiler.target>
	    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	  </properties>

	  <dependencies>
	    <!-- Use JAX-WS RI for Java 8+, scope compile to run the client out of container -->
	    <dependency>
	      <groupId>com.sun.xml.ws</groupId>
	      <artifactId>jaxws-rt</artifactId>
	      <version>2.3.5</version>
	    </dependency>
	  </dependencies>
	</project>
	"""

	with open(os.path.join(client_dir, "pom.xml"), "w", encoding="utf-8") as f:
	    f.write(client_pom)

	# Client main code with placeholders that rely on wsimport-generated stubs
	client_main = """\
	package com.example.todo.client;

	import java.net.URL;
	import javax.xml.namespace.QName;

	// NOTE: After running wsimport, replace these imports with the generated ones (package 'client')
	// and remove the dummy interfaces below.

	public class ClientMain {

	    public static void main(String[] args) throws Exception {
	        if (args.length == 0) {
	            System.out.println("Uso: java -jar task-client.jar <URL_WSDL>");
	            System.out.println("Ejemplo: java -jar task-client.jar http://localhost:8080/task-service/TaskService?wsdl");
	            return;
	        }
	        String wsdlUrl = args[0];

	        // QName must match the WSDL's service and port names
	        QName SERVICE_QNAME = new QName("http://todo.example.com/", "TaskService");
	        QName PORT_QNAME = new QName("http://todo.example.com/", "TaskServicePort");

	        // Using javax.xml.ws.Service dynamic proxy to avoid compile-time stubs dependency
	        javax.xml.ws.Service svc = javax.xml.ws.Service.create(new URL(wsdlUrl), SERVICE_QNAME);
	        TaskService port = svc.getPort(PORT_QNAME, TaskService.class);

	        System.out.println("== Crear tareas ==");
	        Task t1 = port.crearTarea("Comprar pan");
	        Task t2 = port.crearTarea("Enviar informe");

	        System.out.println("Creada: " + t1.getId() + " - " + t1.getDescripcion());
	        System.out.println("Creada: " + t2.getId() + " - " + t2.getDescripcion());

	        System.out.println("\\n== Listar ==");
	        for (Task t : port.listarTareas()) {
	            System.out.println(t.getId() + ": " + t.getDescripcion());
	        }

	        System.out.println("\\n== Borrar ==");
	        boolean deleted = port.borrarTarea(t1.getId());
	        System.out.println("Borrado id " + t1.getId() + ": " + deleted);

	        System.out.println("\\n== Listar final ==");
	        for (Task t : port.listarTareas()) {
	            System.out.println(t.getId() + ": " + t.getDescripcion());
	        }

	        System.out.println("\\nListo.");
	    }

	    // --- Dummy interfaces to compile before wsimport (dynamic proxy) ---
	    // For static stubs: run wsimport and use generated classes instead of these.
	    public static interface TaskService {
	        Task crearTarea(String descripcion);
	        java.util.List<Task> listarTareas();
	        boolean borrarTarea(int id);
	    }
	    public static class Task {
	        private int id;
	        private String descripcion;
	        public Task() {}
	        public int getId() { return id; }
	        public void setId(int id) { this.id = id; }
	        public String getDescripcion() { return descripcion; }
	        public void setDescripcion(String d) { this.descripcion = d; }
	    }
	}
	"""

	with open(os.path.join(client_dir, "src/main/java/com/example/todo/client/ClientMain.java"), "w", encoding="utf-8") as f:
	    f.write(client_main)

	# Sample SOAP requests for SoapUI/Postman
	soap_create = """\
	<!-- crearTarea request -->
	<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:todo="http://todo.example.com/">
	   <soapenv:Header/>
	   <soapenv:Body>
	      <todo:crearTarea>
	         <descripcion>Probar servicio</descripcion>
	      </todo:crearTarea>
	   </soapenv:Body>
	</soapenv:Envelope>
	"""

	soap_list = """\
	<!-- listarTareas request -->
	<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:todo="http://todo.example.com/">
	   <soapenv:Header/>
	   <soapenv:Body>
	      <todo:listarTareas/>
	   </soapenv:Body>
	</soapenv:Envelope>
	"""

	with open(os.path.join(base_dir, "soap-create.xml"), "w", encoding="utf-8") as f:
	    f.write(soap_create)
	with open(os.path.join(base_dir, "soap-list.xml"), "w", encoding="utf-8") as f:
	    f.write(soap_list)

	# README
	readme = """\
	# Mi primer servicio web SOAP: Gestor de tareas

	Este ZIP contiene:
	- `service/` (WAR JAX-WS para GlassFish/Payara)  
	- `client/` (cliente Java, dinámico por `Service` o con stubs)  
	- `soap-create.xml`, `soap-list.xml` (peticiones ejemplo)  

	## Requisitos
	- JDK 8+
	- Maven 3+
	- Servidor Java EE con JAX-WS (GlassFish/Payara/WebLogic)

	## 1) Construir y desplegar el servicio
	```bash
	cd service
	mvn clean package
	# Despliega el WAR resultante (target/task-service.war) en tu servidor
	# URL esperada del WSDL (ajústala a tu contexto/puerto):
	http://localhost:8080/task-service/TaskService?wsdl
	
	
}


