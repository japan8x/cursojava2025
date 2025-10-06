package es.cursojava.proyectos.ejercicios;

//import grupotres.trebejos.Pelicula;

public class Pelicula {
	
	private String pelicula;
	private int duración; // lo pongo como int por que especifica en minutos!!!!
	private String clasificaion; // string para no tener que estar añadiedo un + cadavez q queremos mostrar
	private double precio; // double para poder ganar centimillos...
	private int id; // único para cada película.

	/**
	 * @param pelicula     string
	 * @param duración     int
	 * @param clasificaion string
	 * @param precio       double
	 * @param id           int
	 */
	public Pelicula(String pelicula, int duración, String clasificaion, double precio, int id) {
		super();
		this.pelicula = pelicula;
		this.duración = duración;
		this.clasificaion = clasificaion;
		this.precio = precio;
		this.id = id;
	}
	
	public Pelicula(String titulo)

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public int getDuración() {
		return duración;
	}

	public void setDuración(int duración) {
		this.duración = duración;
	}

	public String getClasificaion() {
		return clasificaion;
	}

	public void setClasificaion(String clasificaion) {
		this.clasificaion = clasificaion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// METODOS
	public void mostrarPelicula(Pelicula peli) {
		System.out.println("Pelicula:\t" + pelicula + "\nClasificación:\t" + clasificaion + "\nDuración:\t"
				+ this.duración + "\nPrecio:\t" + this.precio + "\nIdentificador:\t" + this.id);
	}

}
