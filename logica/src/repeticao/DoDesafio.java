package repeticao;

import javax.swing.JOptionPane;

public class DoDesafio {

	public static void main(String[] args) {
		
		String resposta =" ";
		int Jogador1 = 0;
		int Jogador2 = 0;
		Jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador1: "));
		do {
		Jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador2: "));
		
	}while(Jogador1!=Jogador2);
	
		System.out.println("Parab�ns");
		
		
		/*
		 * Jogador 1 vai digitar um n�mero
		 * Jogador 2 vai ter que advinhar o numero
		 * 
		 * O jogador 2 s� pode receber a mensagem de "parab�ns" quando ele acertar
		 *
		 * Miss�o 2 :
		 * Acrescentar dicas para o jogador 2 (numero maior ou menor)
		 * 
		 * Miss�o 3 :
		 * Acrescentar na mensagem de parab�ns a quantidade de tentativas
		 * Dica: criar uma variavel para contar
		 * 
		 *
		 */
		
		

	}

}
