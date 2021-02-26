package decisao;

import javax.swing.JOptionPane;

public class DecisãoEncadeada {

	public static void main(String[] args) {
	
		/*
		 * Capturar a qtde de faltas
		 * Para que ele esteja aprovado ou de exame, ele também precisa que
		 * a quantidade de faltas seja menor que 20
		 */
		
		 
		
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite as faltas"));
		String disciplina = JOptionPane.showInputDialog ("Digite a Disciplina").toUpperCase();
		if (faltas>=20) {
			System.out.println("Você está reprovado por faltas");
		}else {
		
		Float Nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota1"));
		Float Nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota2"));
		Float Media = (Nota1+Nota2)/2;
		if (Media>=6 && faltas<20) {
			System.out.println("Parabéns você está aprovado na disciplina: " + disciplina);
		}else if (Media<4 || faltas<20) {
			System.out.println("Infelizmente você foi reprovado!!!");
	    }else {
	    	System.out.println("Você ainda tem chance no exame");
		}

		System.out.println("Sua Média foi: " + Media);
		}
		
		
		
		
		
		
		
		
	}

}
