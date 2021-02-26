package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeadaDesafio2 {

	public static void main(String[] args) {
		
		String Produto = JOptionPane.showInputDialog("Nome do Produto: ").toUpperCase();
		String Gênero = JOptionPane.showInputDialog("Gênero do Produto: ").toUpperCase();
		int Quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
		float Valor = Float.parseFloat(JOptionPane.showInputDialog("Valor: "));
		float taxa =0;
		if (Gênero.equals("ALIMENTICIO")) {
			if (Quantidade>100) {
				taxa = (float) 0.04;
			}else if (Quantidade<50) {
				taxa = (float) 0.05;
			}else {
				taxa = (float) 0.045;
			}
		}else if (Gênero.equals("ELETRONICO")) {
			if (Quantidade>100) {
				taxa = (float) 0.06;
			}else if (Quantidade<50) {
				taxa = (float) 0.07;
			}else {
				taxa = (float) 0.065;
			}
		}else {
			System.out.println("Categoria inválida.");
		}
		
		System.out.println("Valor com imposto: " + (Valor + Valor * taxa));
				
	
	}
	
		
		
		
		/*
		 * Capturar:
		 * nome do produto
		 * genero do produto (alimenticio, eletronico...)
		 * qtde
		 * valor unitario
		 * você deverá calcular o imposto sobre o valor unitário
		 * se for alimenticio, o imposto será de 5%
		 * se for eletronico, o imposto f de 7%
		 * se a qtde for maior que 100, o imposto será menor em 1%
		 * se a qtde estiver entre 50 e 100 o imposto será menor em 0,5%
		 * se a qtde for menor que 50 o imposto será integral
		 */
		
		
		
		

	}

