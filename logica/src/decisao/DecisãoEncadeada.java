package decisao;

import javax.swing.JOptionPane;

public class Decis�oEncadeada {

	public static void main(String[] args) {
	
		/*
		 * Capturar a qtde de faltas
		 * Para que ele esteja aprovado ou de exame, ele tamb�m precisa que
		 * a quantidade de faltas seja menor que 20
		 */
		
		 
		
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite as faltas"));
		String disciplina = JOptionPane.showInputDialog ("Digite a Disciplina").toUpperCase();
		if (faltas>=20) {
			System.out.println("Voc� est� reprovado por faltas");
		}else {
		
		Float Nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota1"));
		Float Nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota2"));
		Float Media = (Nota1+Nota2)/2;
		if (Media>=6 && faltas<20) {
			System.out.println("Parab�ns voc� est� aprovado na disciplina: " + disciplina);
		}else if (Media<4 || faltas<20) {
			System.out.println("Infelizmente voc� foi reprovado!!!");
	    }else {
	    	System.out.println("Voc� ainda tem chance no exame");
		}

		System.out.println("Sua M�dia foi: " + Media);
		}
		
		
		
		
		
		
		
		
	}

}
