package dio.trilha.java.basico;

public class OperadorRelacional6 {

	public static void main(String[] args) {
	
		int n1= 1;
		int n2= 2;
						
		System.out.println("Numero 1 é: "+n1);
		System.out.println("Numero 2 é: "+n2);
		
		System.out.println("");
		System.out.println("Numero 1 é maior que 2?");
		
		if(n1 > n2) {
			System.out.println("Numero 1 é maior que 2");
		}else if(n1 < n2){
			System.out.println("Não, numero 1 é menor que 2");
		}else {
			System.out.println("Numero 1 é igual ao 2");
		}
			
		//Utilizando o Booleano
		System.out.println("");
		
		boolean simNao = n1 > n2;
		System.out.println("Numero 1 é maior que 2? " +  simNao);

	}

}
