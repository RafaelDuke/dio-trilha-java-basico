package dio.trilha.java.basico;

public class OperadorTernario {

	public static void main(String[] args) {
		
		int a, b;
		
		a = 5;
		b = 6;
		String resultado;
		
		
		System.out.println("Verdadeiro ou falso");
		System.out.println("Int a = 5");
		System.out.println("Int b = 6");
		
		
		
		System.out.println("A == B ?");
		System.out.println("");
		
		if(a == b) {
		     	System.out.println("Verdadeiro");	
		}else {
				System.out.println("Falso");
		}
		
		//Uma maneira mais abreviada 
		System.out.println();
		System.out.println(resultado = a ==b ? "verdadeiro": "falso");
		
	}

}
