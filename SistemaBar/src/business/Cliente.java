package business;

public class Cliente {
	private String nome;
	private String cpf;
	private int idade;
	private char genero;
	private String numsocio;

	public Cliente(String nome, String cpf, int idade, char genero) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.genero = genero;
		this.numsocio = null;
	}

	public Cliente(String nome, String cpf, int idade, char genero, String numsocio) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.genero = genero;
		this.numsocio = numsocio;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getIdade() {
		return idade;
	}

	public char getGenero() {
		return genero;
	}

	public String getSocio() {

		return numsocio;

	}

}
