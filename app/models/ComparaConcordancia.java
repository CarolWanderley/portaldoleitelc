package models;

import models.Dica;

public class ComparaConcordancia implements Compara{

	@Override
	public int comparador(Dica atual, Dica outra) {
		if (atual.getConcordancias() > outra.getConcordancias()) {
			return -1;
		} else if (atual.getConcordancias() < outra.getConcordancias()) {
			return 1;
		} else {
			return 0;
		}
	}
}
