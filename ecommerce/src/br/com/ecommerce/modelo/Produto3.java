package br.com.ecommerce.modelo;

public class Produto3 {

	private int id;
	private String nome;
	private String email;
	private String fone;
	
	public String getUsuario() {
		if (email.contains("@")) {
			return email.substring(0,email.indexOf("@"));
			
		}
		return email;
	}
	
	public String getAll() {
		return "Produto3 [id=" + id + ", nome=" + nome + ", email=" + email + ", fone=" + fone + "]";
	}

	public void setAll(int id, String nome, String email, String fone) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}
	
	public Produto3() {
		super();
	}
	public Produto3(int id, String nome, String email, String fone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	
	
	
	
	
	
	
	
	
	
}
