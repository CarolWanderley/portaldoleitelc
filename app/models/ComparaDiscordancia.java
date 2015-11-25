package models;

public class ComparaDiscordancia implements Compara {

	@Override
	public int comparador(Dica atual, Dica outra) {
		if (atual.getDiscordancias()>outra.getDiscordancias()) {
			return 1;
		} else if (atual.getDiscordancias()<outra.getDiscordancias()) {
			return -1;
		} else {
			return 0;
		}
	}

}
