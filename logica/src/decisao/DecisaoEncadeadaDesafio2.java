package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeadaDesafio2 {

	public static void main(String[] args) {
		
		String Produto = JOptionPane.showInputDialog("Nome do Produto: ").toUpperCase();
		String G�nero = JOptionPane.showInputDialog("G�nero do Produto: ").toUpperCase();
		int Quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
		float Valor = Float.parseFloat(JOptionPane.showInputDialog("Valor: "));
		float taxa =0;
		if (G�nero.equals("ALIMENTICIO")) {
			if (Quantidade>100) {
				taxa = (float) 0.04;
			}else if (Quantidade<50) {
				taxa = (float) 0.05;
			}else {
				taxa = (float) 0.045;
			}
		}else if (G�nero.equals("ELETRONICO")) {
			if (Quantidade>100) {
				taxa = (float) 0.06;
			}else if (Quantidade<50) {
				taxa = (float) 0.07;
			}else {
				taxa = (float) 0.065;
			}
		}else {
			System.out.println("Categoria inv�lida.");
		}
		
		System.out.println("Valor com imposto: " + (Valor + Valor * taxa));
				
	
	}
	
		
		
		
		/*
		 * Capturar:
		 * nome do produto
		 * genero do produto (alimenticio, eletronico...)
		 * qtde
		 * valor unitario
		 * voc� dever� calcular o imposto sobre o valor unit�rio
		 * se for alimenticio, o imposto ser� de 5%
		 * se for eletronico, o imposto f de 7%
		 * se a qtde for maior que 100, o imposto ser� menor em 1%
		 * se a qtde estiver entre 50 e 100 o imposto ser� menor em 0,5%
		 * se a qtde for menor que 50 o imposto ser� integral
		 */
		
		
		
		

	}

