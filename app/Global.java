import java.util.ArrayList;
import java.util.List;

import models.Dica;
import models.DicaAssunto;
import models.DicaConselho;
import models.DicaDisciplina;
import models.DicaMaterial;
import models.Disciplina;
import models.Tema;
import models.User;
import models.dao.GenericDAOImpl;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;

@Transactional
public class Global extends GlobalSettings {

	private static GenericDAOImpl dao = new GenericDAOImpl();
	private List<Disciplina> disciplinas = new ArrayList<>();
	private List<User> usuarios = new ArrayList<>();
	private List<Dica> dicas = new ArrayList<>();
	
	private Disciplina si1; 
	private Disciplina oac; 
	private Disciplina log; 
	
	private User carol;
	private User luiza;
	private User dands;
	private User nat;
	private User paulo;
	private User mari;
	private User aline;
	private User italo;
	private User dre;
	private User luiz;

	@Override
	public void onStart(Application app) {
		Logger.info("Aplicação inicializada...");

		JPA.withTransaction(new play.libs.F.Callback0() {
			@Override
			public void invoke() throws Throwable {
				if(dao.findAllByClassName(Disciplina.class.getName()).size() == 0){
					criaDisciplinaTemas();
				}
				if(dao.findAllByClassName(User.class.getName()).size() == 0){
					criaUsuarios();
				}
				if(dao.findAllByClassName(Dica.class.getName()).size() == 0){
					criaDicas();
				}
				dao.flush();
			}
		});
	}
	
	@Override
	public void onStop(Application app){
	    JPA.withTransaction(new play.libs.F.Callback0() {
	    @Override
	    public void invoke() throws Throwable {
	        Logger.info("Aplicação finalizando...");
	        disciplinas = dao.findAllByClassName("Disciplina");
	        usuarios = dao.findAllByClassName("User");
	        dicas = dao.findAllByClassName("Dica");
	        
	        for (Disciplina disciplina: disciplinas) {
	        dao.removeById(Disciplina.class, disciplina.getId());
	       }
	        for (User u: usuarios) {
		        dao.removeById(User.class, u.getId());
		       } 
	        for (Dica d: dicas) {
		        dao.removeById(User.class, d.getId());
		       } 
	    }}); 
	}
	
	private void criaDisciplinaTemas(){
		si1 = new Disciplina("Sistemas de Informação 1");
		si1.addTema(new Tema("Análise x Design", si1));
		si1.addTema(new Tema("Orientação a objetos", si1));
		si1.addTema(new Tema("GRASP", si1));
		si1.addTema(new Tema("GoF", si1));
		si1.addTema(new Tema("Arquitetura", si1));
		si1.addTema(new Tema("Play", si1));
		si1.addTema(new Tema("JavaScript", si1));
		si1.addTema(new Tema("HTML / CSS / Bootstrap", si1));
		si1.addTema(new Tema("Heroku", si1));
		si1.addTema(new Tema("Labs", si1));
		si1.addTema(new Tema("Minitestes", si1));
		si1.addTema(new Tema("Projeto", si1));
		dao.persist(si1);

		
		oac = new Disciplina("Organização e Arquitetura de Computadores");
		oac.addTema(new Tema("Organização Básica de Computadores", oac));
		oac.addTema(new Tema("Circuitos Combinacionais", oac));
		oac.addTema(new Tema("Circuitos Sequenciais", oac));
		oac.addTema(new Tema("Organização e Arquitetura Básicas de Computadores", oac));
		oac.addTema(new Tema("Arquitetura do Conjunto de Instruções", oac));
		dao.persist(oac);

		
		log = new Disciplina("Lógica Matemática");
		log.addTema(new Tema("Lógica Proposicional", log));
		log.addTema(new Tema("Semântica LP", log));
		log.addTema(new Tema("Dedução LP", log));
		log.addTema(new Tema("Formas Normais e SAT solvers", log));
		log.addTema(new Tema("Lógica de Predicados", log));
		dao.persist(log);
	
	}
	private void criaUsuarios(){
		carol = new User("ca@bol.com","misan123","carolw");
		carol.setNome("Ana Caroline Wanderley");
		dao.persist(carol);

		luiza = new User("lu@bol.com","fem123","luizac");
		luiza.setNome("Luiza Carvalho");
		dao.persist(luiza);


		dands = new User("da@bol.com","het123","dands");
		dands.setNome("Dandara Maria");
		dao.persist(dands);


		nat = new User("nat@bol.com","gos123","natg");
		nat.setNome("Natália Gomes");
		dao.persist(nat);


		aline = new User("tro@bol.com","sap123","alinet");
		aline.setNome("Aline Trovão");
		dao.persist(aline);


		mari = new User("ma@bol.com","fom123","maril");
		mari.setNome("Mariane Linhares");
		dao.persist(mari);


		paulo = new User("vini@bol.com","ro123","vinip");
		paulo.setNome("Paulo Vinicius");
		dao.persist(paulo);


		italo = new User("italindo@bol.com","vibes123","italob");
		italo.setNome("Ítalo Batista");
		dao.persist(italo);
	

		dre = new User("dre@bol.com","fecha123","andren");
		dre.setNome("André Andrade");
		dao.persist(dre);
		

		luiz = new User("luiz@bol.com","sam123","luizf");
		luiz.setNome("Luiz Fonseca");
		dao.persist(luiz);
	
	}
	private void criaDicas(){
		
	// Criacao de dicas completa
		
		DicaConselho dicaoac1 = new DicaConselho();
		dicaoac1.setTema(oac.getTemaByNome("Organização Básica de Computadores"));
		dicaoac1.setUser("dands");
		dicaoac1.setConselho("Lembrem-se de sempre checar o site da disciplina para ver se existem atividades que valem ponto!");
		
		DicaMaterial dicaoac2 = new DicaMaterial();
		dicaoac2.setTema(oac.getTemaByNome("Circuitos Sequenciais"));
		dicaoac2.setUser("luizf");
		dicaoac2.setUrl("http://www.dsc.ufcg.edu.br/~joseana/OAC_NA07.pdf");

		DicaMaterial dicasi1 = new DicaMaterial();
		dicasi1.setTema(si1.getTemaByNome("HTML / CSS / Bootstrap"));
		dicasi1.setUser("luizac");
		dicasi1.setUrl("https://www.codecademy.com/courses/web-beginner-en-yjvdd/0/1");
		
		DicaAssunto dicasi2 = new DicaAssunto();
		dicasi2.setTema(si1.getTemaByNome("Orientação a objetos"));
		dicasi2.setUser("carolw");
		dicasi2.setAssunto("A disciplina de Programação 2 é extremamente importante para pagar SI1 bem.");
		
		DicaConselho dicalog = new DicaConselho();
		dicalog.setTema(log.getTemaByNome("Dedução LP"));
		dicalog.setUser("vinip");
		dicalog.setConselho("Sempre é bom revisar esse assunto, cai muito na prova!");
		
		DicaDisciplina dicalog1 = new DicaDisciplina("Matemática Discreta","Sempre é bom revisar esse assunto, cai muito na prova!");
		dicalog1.setTema(log.getTemaByNome("Dedução LP"));
		dicalog1.setUser("vinip");
		
		dao.persist(dicaoac1);
		dao.persist(dicaoac2);
		dao.persist(dicasi1);
		dao.persist(dicasi2);
		dao.persist(dicalog);
		dao.persist(dicalog1);
		
		adicionarConDis(dicaoac1, dicaoac2, dicasi1, dicasi2, dicalog);
		
	}
	private void adicionarConDis(Dica oac1, Dica oac2, Dica si1,Dica si2,Dica log){

		// votos em oac1
		oac1.addUsuarioQueVotou(luiza.getLogin());
		oac1.incrementaConcordancias();
		
		oac1.addUsuarioQueVotou(italo.getLogin());
		oac1.incrementaConcordancias();
		
		oac1.addUsuarioQueVotou(mari.getLogin());
		oac1.incrementaConcordancias();
		
		// votos em oac2
		oac2.addUsuarioQueVotou(carol.getLogin());
		oac2.incrementaConcordancias();
		
		oac2.addUsuarioQueVotou(dre.getLogin());
		oac2.incrementaConcordancias();
		
		oac2.addUsuarioQueVotou(dands.getLogin());
		oac2.incrementaDiscordancias();
		oac2.addUserCommentary(dands.getNome(), "discordancia");
		
		// votos em si1
		si1.addUsuarioQueVotou(luiz.getLogin());
		si1.incrementaConcordancias();
		
		si1.addUsuarioQueVotou(dre.getLogin());
		si1.incrementaConcordancias();
		
		si1.addUsuarioQueVotou(aline.getLogin());
		si1.incrementaConcordancias();
		
		si1.addUsuarioQueVotou(carol.getLogin());
		si1.incrementaConcordancias();

		// votos em si2
		si2.addUsuarioQueVotou(luiz.getLogin());
		si2.incrementaConcordancias();
		
		si2.addUsuarioQueVotou(aline.getLogin());
		si2.incrementaConcordancias();		

		// votos em log	
		log.addUsuarioQueVotou(mari.getLogin());
		log.incrementaConcordancias();
		
		log.addUsuarioQueVotou(dands.getLogin());
		log.incrementaDiscordancias();
		log.addUserCommentary(dands.getNome(), "discordancia");
		
		log.addUsuarioQueVotou(nat.getLogin());
		log.incrementaDiscordancias();
		log.addUserCommentary(nat.getNome(), "discordancia");
		
		dao.merge(oac1);
		dao.merge(oac2);
		dao.merge(si1);
		dao.merge(si2);
		dao.merge(log);
	}
}
