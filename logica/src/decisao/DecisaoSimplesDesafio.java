package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {

	public static void main(String[] args) {

		String Nome = JOptionPane.showInputDialog("Nome: ").toUpperCase();
		Short Idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua idade: "));
		if (Idade<16) {
			System.out.println("Você não pode votar");
		}
		if (Idade>=18 && Idade<=70) {
			System.out.println("Seu voto é obrigatório");
		}

		if (Idade==16 || Idade==17 || Idade>70) {
			System.out.println("Seu voto é facultativo");
		}

		/*
		 * Capturar:
		 * nome e idade de uma pessoa
		 * avaliar a idade para exibir uma das mensagens abaixo:
		 * 
		 * pessoas com 16, 17 ou maior que 70 => 0 seu voto é facultativo
		 * pessoas entre 18 e 70 anos => seu voto é obrigatório
		 * pessoas com menos de 16 anos => você não pode votar
		 */

	}

}
