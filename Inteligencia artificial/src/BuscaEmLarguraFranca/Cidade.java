package BuscaEmLarguraFranca;

import java.util.ArrayList;

public class Cidade {
	private String nome;
	private ArrayList<Cidade> conexoes;
	
	public Cidade(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Cidade> getConexoes() {
		return conexoes;
	}
	public void setConexoes(ArrayList<Cidade> conexoes) {
		this.conexoes = conexoes;
	}
	
	
}