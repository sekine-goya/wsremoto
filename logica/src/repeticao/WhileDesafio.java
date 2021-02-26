package repeticao;

import javax.swing.JOptionPane;

public class WhileDesafio {

	public static void main(String[] args) {
		
		
		String Nome = JOptionPane.showInputDialog("Nome: ").toLowerCase();
		int Idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: ").toUpperCase());
		while (Nome.contains(" ")==false || Nome.length()<5 || Nome.length()>15) {
			Nome = JOptionPane.showInputDialog(" Digite o nome novamente").toLowerCase();
		}
		
		while(Idade<18 || Idade>=70) {
			Idade = Integer.parseInt(JOptionPane.showInputDialog("Idade novamente"));
			
		}
		System.out.println("Nome: " + Nome);
		System.out.println("Idade: " + Idade);
		
		
		
		
		
		/*
		 * Capturar nome e idade
		 * Requisitos para o final exibir o nome e a idade
		 * - nome deve possuir no minimo 5 caracteres
		 * - nome deve possuir no maximo 15 caracteres
		 * - nome deve possuir um "espaço"
		 * - idade deve estar entre 18 e 70 anos
		 */

	}

}
