package gerenciadores;



import models.Dica;
import models.Tema;
import models.dao.GenericDAOImpl;

public class GerenciaDica {
	
	private Dica dica;
	
	
	public void setDica(Dica dica){
		this.dica = dica;
	}
	
	public void salvarDica(Tema tema, String userName , GenericDAOImpl dao){		
		tema.addDica(dica);
		dica.setTema(tema);
		dica.setUser(userName);
		dao.persist(dica);
		
	}
}