package models;

public class ComparaRecente implements Compara {

	@Override
	public int comparador(Dica atual, Dica outra) {
		return atual.getDataPublicacao().compareTo(outra.getDataPublicacao());
	}

}
