package variaveis;

public class TipoString {

	public static void main(String[] args) {
		//String � um tipo de Refer�ncia - Toda referencia come�a com a letra maiuscula
		String email = "Sekine_Goyahotmail.Com";
		System.out.println("Original: "+ email);
		System.out.println("Minusculo: "+ email.toLowerCase());
		System.out.println("Maiuscula: "+ email.toUpperCase());
		System.out.println("Qtde Caracteres: " + email.length());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("Exibir do 3� ao 5�: " + email.substring(2,5));
		System.out.println("Exibir do 5� at� o fim: " + email.substring(4));
		System.out.println("Primeira metade: " +email.substring(0, email.length()/2));
		System.out.println("Segunda metade: " +email.substring(email.length()/2));
		System.out.println("Nome do usu�rio: " +email.substring(0, email.indexOf("@")));
		System.out.println("Comparando primitivos: " + (8==9));
		System.out.println("Comparando Strings " + email.equals("Sekine_Goya@hotmail.Com"));
		
		
		//s e k i n e _ g o y a @ hotmail.com
		//0 1 2 3 4 5 6 7 8 9 10 11
		
			
		
	}
	
	
	
}


