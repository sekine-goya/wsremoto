package br.com.ecommerce.principal;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
	
		Produto p = new Produto();
		p.setDescricao(JOptionPane.showInputDialog("Descricao").toUpperCase());
		p.setQtde(Integer.parseInt(JOptionPane.showInputDialog("Qtde")));
		p.setValorCompra(Float.parseFloat(JOptionPane.showInputDialog("V Compra")));
		p.setValorVenda(Float.parseFloat(JOptionPane.showInputDialog("V Venda")));
		p.setId(Integer.parseInt(JOptionPane.showInputDialog("ID")));
		
		System.out.println(p.getResumo());
		
		System.out.println("Desconto: " + p.getDesconto());
		p.ajustarValores(50);
		System.out.println("\nValores Ajustados\n");
		System.out.println(p.getResumo());
		System.out.println("Total Compra: " + p.getTotalCompra());
		System.out.println("Situacao do estoque: " + p.verificarEstoque());
		
		
		
		

	}

}
