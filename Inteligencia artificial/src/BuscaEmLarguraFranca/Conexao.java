package BuscaEmLarguraFranca;

public class Conexao {
	private Cidade c1;
	private Cidade c2;
	private float dist;
	
	public Conexao (Cidade c1, Cidade c2, float dist) {
		this.c1 = c1;
		this.c2 = c2;
		this.dist = dist;
	}

	public Cidade getC1() {
		return c1;
	}

	public Cidade getC2() {
		return c2;
	}

	public float getDist() {
		return dist;
	}
	
}