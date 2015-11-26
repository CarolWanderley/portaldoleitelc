package models;

import models.Dica;

public class ComparaRecente implements Compara{

	@Override
	public int comparador(Dica tip1, Dica tip2) {
		return tip2.getDataPublicacao().compareTo(tip1.getDataPublicacao());
		}

}
