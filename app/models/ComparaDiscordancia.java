package models;

import models.Dica;

public class ComparaDiscordancia implements Compara{

	@Override
	public int comparador(Dica tip1, Dica tip2) {
		if (tip1.getDiscordancias()>tip2.getDiscordancias()) {
			return -1;
		} else if (tip1.getDiscordancias()<tip2.getDiscordancias()) {
			return 1;
		} else {
			return 0;
		}
	}

}
