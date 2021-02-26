package br.com.concessionaria.modelo;

public class Carro {

	private float valor;
	private String cor;
	private boolean status;
	private short velocidadeAtual;
	private String modelo;
	
	
	public String retornarResumo() {
		String strstatus = "LIGADO";
		if (status==false); {
			strstatus="DESLIGADO";
			
		}
		
		return "Modelo: " + modelo + "\nStatus: "+strstatus + "\nVelocidade: " + velocidadeAtual;
		
		
	}
	
	
	public void brecar(short velocidade) {
		if (status==true) {
			velocidadeAtual = (short) (velocidadeAtual-velocidade);
			
		}
	}
	
	
    public void acelerar(short velocidade) {
		if (status==true)
			velocidade = (short) (velocidadeAtual + velocidade);
	}
	
	
	
	
	public String retornarCor() {
		return cor;
	}
	
	
public void preencherValor(float param) {
	valor = param;
	
}
	
	//Sintaxe para os métodos
	//<modificador><tipo do retorno><nome do metodo (<tipo do param> <nome do param>){
	
	public void preencherCor(String param) {
		cor = param.toLowerCase();
			
	}
	
	
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
