package br.com.caicai.modelo;

import javax.swing.JOptionPane;

import br.com.caicai.implementacao.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		Elevador elevador = new Elevador();
		elevador.configurar(
				Short.parseShort(JOptionPane.showInputDialog("Andar Max")), 
				Short.parseShort(JOptionPane.showInputDialog("Andar Min")),
				Byte.parseByte(JOptionPane.showInputDialog("Capacidade"))
				);
				System.out.println(elevador.exibirResumo());
				elevador.subir((byte) 100);
				elevador.entrar((byte) 5);
				elevador.subir();
				elevador.sair((byte) 2);
				elevador.descer();
				System.out.println(elevador.exibirResumo());
				
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
