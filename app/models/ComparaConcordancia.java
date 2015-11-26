package models;

import models.Dica;

public class ComparaConcordancia implements Compara{

	@Override
	public int comparador(Dica tip1, Dica tip2) {
		if (tip1.getConcordancias()>tip2.getConcordancias()) {
			return -1;
		} else if (tip1.getConcordancias()<tip2.getConcordancias()) {
			return 1;
		} else {
			return 0;
		}
	}
}
