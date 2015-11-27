package gerenciadores;

import models.Dica;
import models.DicaDisciplina;
import models.Tema;
import models.dao.GenericDAO;

public class GerenciaMetaDica {
	private Dica dica;
	
	public GerenciaMetaDica(){
		
	}
	public void criaDica(Dica dica, String username, Tema tema){
		tema.addDica(dica);
		dica.setUser(username);
		dica.setTema(tema);
		this.dica = dica;	
	}
	public void setRazao(DicaDisciplina dica, String razao){
		this.dica = (DicaDisciplina) this.dica ; 
		dica.setRazao(razao);
		this.dica = dica;
		 
	}
	public void salvaDica(GenericDAO dao){
		dao.persist(dica);
	}
}
