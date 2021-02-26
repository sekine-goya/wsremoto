package repeticao;

import javax.swing.JOptionPane;

public class DoExemplo {

	public static void main(String[] args) {
		String resposta=" ";
		float salario=0;
		do {
			salario = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
			System.out.println("FGTS: " + (salario*0.08));
			resposta = JOptionPane.showInputDialog("Digite S para continuar").toUpperCase();
		}while(resposta.equals("S"));
		
		}
		
		

	}

