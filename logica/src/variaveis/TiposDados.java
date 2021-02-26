package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
	
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		double altura =	Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		double imc = peso / (altura * altura);
		
		
		System.out.println("Nome..: " + nome);
		System.out.println("idade.: " + idade + " anos.");
		System.out.println("Altura: " + altura);
		System.out.println("IMC...: " + imc);
		
		//Pe�am o peso
		//Criar uma variavel chamada IMC (fazer o calculo)
		//Exibir o imc
		
		
		/*
		 * Alfanum�rico : � um dado que voc� n�o utiliza em opera��es
		 * aritm�ticas.
		 * CEP:00010-009 => 00010-009
		 * (em um contexto em que ele n�o esteja entre os dados mais criticos)
		 * String representa um dado alfanumerico no Java
		 * 
		 * Num�rico: � o dado que pode ser utilizado em opera��es 
		 * aritm�ticas e/ou for um dado critico para pesquisa.
		 * CEP: 00010-009 => 1
		 * (em um contexto dos Correios, onde ele � um dado critico)
		 * Dois tipos:
		 * -inteiro que em Java � int ex> 9
		 * -real que em Java � double ex> 9,5
		 * 
		 * 
		 */
		
		
	
		
	}
	
	
	
}
