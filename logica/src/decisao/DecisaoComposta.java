package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
	
		String disciplina = JOptionPane.showInputDialog ("Digite a Disciplina").toUpperCase();
		Float Nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota1"));
		Float Nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota2"));
		Float Media = (Nota1+Nota2)/2;
		if (Media>=6) {
			System.out.println("Parab�ns voc� est� aprovado na disciplina: " + disciplina);
		}else if (Media<4) {
			System.out.println("Infelizmente voc� foi reprovado!!!");
	    }else if (Media<6 && Media>=4) {
	    	System.out.println("Voc� ainda tem chance no exame");
	    }
	
		System.out.println("Sua m�dia foi: " + Media);
		
		
		
		
		
		
		
		
		
	}

}
