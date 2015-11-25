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


public class Global extends GlobalSettings {

	private static GenericDAOImpl dao = new GenericDAOImpl();
	private List<Disciplina> disciplinas = new ArrayList<>();
	private List<User> usuarios = new ArrayList<>();
	private List<Dica> dicas = new ArrayList<>();
	
	private Disciplina si1; 
	private Disciplina oac; 
	private Disciplina log; 
	
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
//				if(dao.findAllByClassName(Dica.class.getName()).size() == 0){
//					criaDicas();
//				}
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
//	        dicas = dao.findAllByClassName("Dica");
	        
	        for (Disciplina disciplina: disciplinas) {
	        dao.removeById(Disciplina.class, disciplina.getId());
	       }
	        for (User u: usuarios) {
		        dao.removeById(User.class, u.getId());
		       } 
//	        for (Dica d: dicas) {
//		        dao.removeById(User.class, d.getId());
//		       } 
	    }}); 
	}
	
	private void criaDisciplinaTemas(){
		si1 = new Disciplina("Sistemas de Informação 1");
		si1.addTema(new Tema("Análise x Design"));
		si1.addTema(new Tema("Orientação a objetos"));
		si1.addTema(new Tema("GRASP"));
		si1.addTema(new Tema("GoF"));
		si1.addTema(new Tema("Arquitetura"));
		si1.addTema(new Tema("Play"));
		si1.addTema(new Tema("JavaScript"));
		si1.addTema(new Tema("HTML / CSS / Bootstrap"));
		si1.addTema(new Tema("Heroku"));
		si1.addTema(new Tema("Labs"));
		si1.addTema(new Tema("Minitestes"));
		si1.addTema(new Tema("Projeto"));
		dao.persist(si1);
		dao.flush();
		
		oac = new Disciplina("Organização e Arquitetura de Computadores");
		oac.addTema(new Tema("Organização Básica de Computadores"));
		oac.addTema(new Tema("Circuitos Combinacionais"));
		oac.addTema(new Tema("Circuitos Sequenciais"));
		oac.addTema(new Tema("Organização e Arquitetura Básicas de Computadores"));
		oac.addTema(new Tema("Arquitetura do Conjunto de Instruções"));
		dao.persist(oac);
		dao.flush();
		
		log = new Disciplina("Lógica Matemática");
		log.addTema(new Tema("Lógica Proposicional"));
		log.addTema(new Tema("Semântica LP"));
		log.addTema(new Tema("Dedução LP"));
		log.addTema(new Tema("Formas Normais e SAT solvers"));
		log.addTema(new Tema("Lógica de Predicados"));
		dao.persist(log);
		dao.flush();
	}
	private void criaUsuarios(){
		User carol = new User("ca@bol.com","misan123","carolw");
		carol.setNome("Ana Caroline Wanderley");
		dao.persist(carol);
		dao.flush();
		
		User luiza = new User("lu@bol.com","fem123","luizac");
		luiza.setNome("Luiza Carvalho");
		dao.persist(luiza);
		dao.flush();

		User dands = new User("da@bol.com","het123","dands");
		dands.setNome("Dandara Maria");
		dao.persist(dands);
		dao.flush();

		User nat = new User("nat@bol.com","gos123","natg");
		nat.setNome("Natália Gomes");
		dao.persist(nat);
		dao.flush();

		User aline = new User("tro@bol.com","sapa123","alinet");
		aline.setNome("Aline Trovão");
		dao.persist(aline);
		dao.flush();

		User mari = new User("ma@bol.com","fom123","maril");
		mari.setNome("Mariane Linhares");
		dao.persist(mari);
		dao.flush();

		User paulo = new User("vini@bol.com","ro123","vinip");
		paulo.setNome("Paulo Vinicius");
		dao.persist(paulo);
		dao.flush();

		User italo = new User("italindo@bol.com","vibes123","italob");
		italo.setNome("Ítalo Batista");
		dao.persist(italo);
		dao.flush();

		User dre = new User("dre@bol.com","fecha123","andren");
		dre.setNome("André Andrade");
		dao.persist(dre);
		dao.flush();

		User luiz = new User("luiz@bol.com","sam123","luizf");
		luiz.setNome("Luiz Fonseca");
		dao.persist(luiz);
		dao.flush();
	}
//	private void criaDicas(){
//	// eu ia fazer um metadica pra cada usuário mas dica n pega nada de metadica wtf ??????? pra que metadica existe???
//		
//		DicaConselho dicaoac1 = new DicaConselho();
//		dicaoac1.setTema(oac.getTemaByNome("Organização Básica de Computadores"));
//		dicaoac1.setUser("dands");
//		dicaoac1.setConcordancias(3);
//		dicaoac1.addUsuarioQueVotou("luizac");
//		dicaoac1.addUsuarioQueVotou("italob");
//		dicaoac1.addUsuarioQueVotou("maril");
//		dicaoac1.setConselho("Lembrem-se de sempre checar o site da disciplina para ver se existem atividades que valem ponto!");
//		
//		DicaMaterial dicaoac2 = new DicaMaterial();
//		dicaoac2.setTema(oac.getTemaByNome("Circuitos Sequenciais"));
//		dicaoac2.setUser("luizf");
//		dicaoac2.setUrl("http://www.dsc.ufcg.edu.br/~joseana/OAC_NA07.pdf");
//		dicaoac2.setConcordancias(2);
//		dicaoac2.setDiscordancias(1);
//		dicaoac2.addUsuarioQueVotou("carolw");
//		dicaoac2.addUsuarioQueVotou("andren");
//		dicaoac2.addUsuarioQueVotou("dands");
//		
//		DicaMaterial dicasi1 = new DicaMaterial();
//		dicasi1.setTema(si1.getTemaByNome("HTML / CSS / Bootstrap"));
//		dicasi1.setUser("luizac");
//		dicasi1.setConcordancias(4);
//		dicasi1.addUsuarioQueVotou("luizf");
//		dicasi1.addUsuarioQueVotou("andren");
//		dicasi1.addUsuarioQueVotou("carolw");
//		dicasi1.addUsuarioQueVotou("alinet");
//		dicasi1.setUrl("https://www.codecademy.com/courses/web-beginner-en-yjvdd/0/1");
//		
//		DicaAssunto dicasi2 = new DicaAssunto();
//		dicasi2.setTema(si1.getTemaByNome("Play"));
//		dicasi2.setUser("carolw");
//		dicasi2.setConcordancias(2);
//		dicasi2.addUsuarioQueVotou("luizf");
//		dicasi2.addUsuarioQueVotou("alinet");
//		dicasi2.setAssunto("Para criar um projeto na framework play é necessário que você crie uma variável de ambiente, após isso vá na linha de comando, mude para a pasta desejada e digite 'activator ui'");
//		
//		DicaConselho dicalog = new DicaConselho();
//		dicalog.setTema(log.getTemaByNome("Dedução LP"));
//		dicalog.setUser("vinip");
//		dicalog.setConcordancias(1);
//		dicalog.setDiscordancias(2);
//		dicalog.addUsuarioQueVotou("maril");
//		dicalog.addUsuarioQueVotou("dands");
//		dicalog.addUsuarioQueVotou("natg");
//		dicalog.setConselho("Sempre é bom revisar esse assunto, cai muito na prova!");
//	}
}
