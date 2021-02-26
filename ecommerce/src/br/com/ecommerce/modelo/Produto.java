package br.com.ecommerce.modelo;
/*
 * Design Pattern - Compilado com as melhores práticas para OO
 * DTO (Data Transfer Object)
 * Recomendações: 
 * 1º TODOS os atributos devem ser privados
 * 2º CADA atributo deve possuir um método para input e outro método para output
 * 3º Toda classe JavaBeans deve possuir no mínimo dois construtores: 
 * - construtor vazio e 
 * - um construtor com todos os atributos de parâmetro (cheio) 
 * 
 * Atalho input e output em massa - Source => Generate Getters and Satters 
 * 
 * 
 */


public class Produto {

	private int id;
	private String descricao;
	private float valorCompra;
	private float valorVenda;
	private int qtde;
	
	public Produto(int i, String d, float vc, float vv, int q) {
		id=i;
		descricao=d;
		valorCompra=vc;
		valorVenda=vv;
		qtde=q;
	}
	
	public Produto() {
		
	
	}
	
	public void ajustarValores(float porc) {
		valorCompra = valorCompra + valorCompra * (porc/100);
		valorVenda = valorVenda + valorVenda * (porc/100);
		
	}
	
	
	public String verificarEstoque() {
		if (qtde<5) {
			return "Estoque Baixo";
		}else if(qtde>10) {
			return "Estoque Alto";
		}else {
			return "Estoque Médio";
		}
	}
	
	public void setAll(int id, String d, float vc, float vv, int q) {
		this.id=id;
		descricao=d;
		valorCompra=vc;
		valorVenda=vv;
		qtde=q;
		
	}
	
	public String getResumo() {
		return
				"Descriçao...: " + descricao + "\n" +
				"Valor Venda.: " + valorVenda + "\n" +
				"Qtde........: " + qtde;
		
	}
	
	public float getDesconto() {
		return valorVenda * (float) 0.9;
			
	}
	
	// Criar metodo dentro do parenteses somente se precisar descobrir algum valor/informação, aqui o usuário informa. exemplo abaixo.
	//public float geTotalCompra(float frete) { (foi solicitado adicionar frente e não está na variavel)
	// return valorCompra * qtde + frete; } (Parametro ou argumento)
	
	
	public float getTotalCompra() {	
			return valorCompra * qtde;
					}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public float getValorCompra() {
		return valorCompra;
	}


	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}


	public float getValorVenda() {
		return valorVenda;
	}


	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}


	public int getQtde() {
		return qtde;
	}


	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
			
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
