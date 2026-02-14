public interface Oper {
	
    int aplicar(int a, int b);
    
}

public enum Op implements Oper {
	
    SUMA { public int aplicar(int a, int b) { return a + b; } },
    RESTA{ public int aplicar(int a, int b) { return a - b; } }
    
}





