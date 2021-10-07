package BuscaEmLarguraFranca;

import java.util.ArrayList;

public class BuscaEmLargura {

	private Cidade cidadeInicial;
	private Cidade cidadeFinal;
	private ArrayList<Cidade> nosAtuais = new ArrayList<Cidade>();
	private ArrayList<Cidade> cidadesVisitadas = new ArrayList<Cidade>();

	public BuscaEmLargura(Cidade cidadeInicial, Cidade cidadeFinal) {
		super();
		this.cidadeInicial = cidadeInicial;
		this.cidadeFinal = cidadeFinal;
		nosAtuais.add(cidadeInicial);
	}

	public Cidade getCidadeInicial() {
		return cidadeInicial;
	}

	public void setCidadeInicial(Cidade cidadeInicial) {
		this.cidadeInicial = cidadeInicial;
	}

	public Cidade getCidadeFinal() {
		return cidadeFinal;
	}

	public void setCidadeFinal(Cidade cidadeFinal) {
		this.cidadeFinal = cidadeFinal;
	}

	public void principal(int rodagem) {
		if(!cidadesVisitadas.contains(nosAtuais.get(0))) {
			if(nosAtuais.get(0).getNome() == this.cidadeFinal.getNome()) {
				System.out.println("\nCidade Atual: " + nosAtuais.get(0).getNome() + "| Chegou na cidade objetivo");
			}else{
				System.out.println("\nRodagem Atual:" + rodagem);
				
				System.out.print("\nCidade Atual: " + nosAtuais.get(0).getNome() + "| Nao eh a cidade objetivo");
				System.out.print("\nCidades ja visitadas: ");
				for(int i=0; i< cidadesVisitadas.size();i++) {
					System.out.print(cidadesVisitadas.get(i).getNome() + " | ");
				}
				nosAtuais.addAll(nosAtuais.get(0).getConexoes());// PODE ESTAR ERRADO
				cidadesVisitadas.add(nosAtuais.get(0));
				
				System.out.print("\nNos a serem visitados: ");
				for(int i=1; i< nosAtuais.size();i++) {
					System.out.print(nosAtuais.get(i).getNome() + " | ");
				}

				System.out.println("\n");
				
				nosAtuais.remove(0);
				this.principal(rodagem+1);
			}
		}else {
			System.out.println(nosAtuais.get(0).getNome() + " ja foi visitada");
			nosAtuais.remove(0);
			this.principal(rodagem);
		}
		
	}

	}
