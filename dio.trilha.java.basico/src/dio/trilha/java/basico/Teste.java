package dio.trilha.java.basico;

public class Teste {

	public static void main(String[] args) {
		
		//Teste aula 3
		//Casting -> pega um tipo mais abrangente 
		// e converte para um mais especifico
		
		short numeroCurto = 1;
		int numeroNormal  = numeroCurto;
		
		//Exemplo de casnting
		short numeroCurto2 = (short) numeroNormal;
		
		System.out.println(numeroNormal);

	}

}
