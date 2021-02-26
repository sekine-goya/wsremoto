package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples2 {

	public static void main(String[] args) {
		
		String disciplina = JOptionPane.showInputDialog ("Digite a Disciplina").toUpperCase();
		Float Nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota1"));
		Float Nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota2"));
		Float Media = (Nota1+Nota2)/2;
		if (Media>=6) {
			System.out.println("Parabéns você está aprovado na disciplina: " + disciplina);
		}
		
		if (Media<4) {
			System.out.println("Infelizmente você foi reprovado!!!");
	}
	
		System.out.println("Sua média foi: " + Media);

		/*
		 * Capturem:
		 * - nome de uma disciplina
		 * - duas notas
		 * - calcular a media
		 * - exibir a media
		 * - exibir a mensagem "Parabéns" somente se a media for maior ou igual a 6
		 */
		
		
		
		
		

	}

}
