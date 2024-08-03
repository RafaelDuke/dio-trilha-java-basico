package dio.trilha.java.basico;

public class OperadorRepeticao3 {

	public static void main(String[] args) {
		
	    
	    
	    System.out.println("Incremento");
	    
	    int numero = 5;
	    numero = numero +1;
	    
	    System.out.println("Incremento / numero = numero +1;");
	    System.out.println(numero);
	    System.out.println();
	    
	    System.out.println("Incremento / numero++");
	    System.out.println(numero++);
	    System.out.println();
	    
	    int numero1 = 5;
        numero1 = numero1 -1;
	    
	    System.out.println("Decremento / numero = numero -1;");
	    System.out.println(numero1);
	    System.out.println();
	    
	    System.out.println("Decremento / numero--");
	    System.out.println(numero1--);
	    System.out.println();
	    
	    System.out.println("Valores Booleanos");
	    boolean variavel = true;
	    System.out.println("boolean variavel = true;");
	    System.out.println();
	    
	    System.out.println("Invertendo o Valor");
	    System.out.println(!variavel);
	    System.out.println();
	    System.out.println("Invertendo o Valor");
	    System.out.println(variavel);
	    
	    
	    System.out.println();
	    
	    
	    
	    System.out.println("Repeticao com for");
	    int a = 0;
		for (int i = 0; a <= 10; i++ ) {
			
			System.out.println(a);
			
			a = a + 1; 
			
		}
	
	}

}
