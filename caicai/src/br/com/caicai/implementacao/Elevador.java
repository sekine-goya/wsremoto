package br.com.caicai.implementacao;

public class Elevador {

	
	private String nome;
	private short andarMaximo;
	private short andarMinimo;
	private short andarAtual;
	private byte capacidadeMaxima;
	private byte qtdePessoas; 
	
	
	public String exibirResumo() {
		return
				"Nome: " + nome + "\n" +
				"Andar Atual: " + andarAtual + "\n" +
				"Qtde Pessoas: " + qtdePessoas + "\n";
		
	}
	
	
	public void subir (byte andar) {
		if ((andarAtual+andar)<=andarMaximo) {
			andarAtual+=andar;
		}
	}
	
	public String entrar(byte qtde) {
		if ((qtdePessoas+qtde)<=capacidadeMaxima) {
			qtdePessoas+=qtde;
			return "Entrada realizada";
		}
		return "Entrada não realizada";
	}
	
	
	public String sair(byte qtde) {
		if (qtdePessoas>=qtde) {
			qtdePessoas-=qtde;
		return "Saida realizada";
		}
		return "Saida não realizada";
		
	}
	
	
	public void descer() {
		if (andarAtual>andarMinimo) {
			andarAtual--;
		}
	}
	
	public void subir() {
		if (andarAtual<andarMaximo) {
			andarAtual++;
		}
		
	}
	
	public void preencherNome(String param) {
		nome = param.toLowerCase();
	}
		
		public String retornarNome() {
			return nome;
		}

	
		public void configurar(short maximo, short minimo, byte capacidade) {
			andarMaximo=maximo;
			andarMinimo=minimo;
			capacidadeMaxima=capacidade;
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
