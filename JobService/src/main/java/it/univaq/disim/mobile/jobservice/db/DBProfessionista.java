package it.univaq.disim.mobile.jobservice.db;

	
	import java.util.List;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;
	import it.univaq.disim.mobile.jobservice.model.Professionista;
        import org.hibernate.Query;



	public class DBProfessionista{
	private SessionFactory sessionFactory;
	protected void setUp() throws Exception {
	// Otteniamo una SessionFactory per la nostra applicazione
	sessionFactory = new Configuration()
	.configure() // configura la SessionFactory utilizzando l' hibernate.cfg.xml
	.buildSessionFactory();
	}
	protected void shutDown() throws Exception {
	if ( sessionFactory != null ) {
	sessionFactory.close();
	}
	}
	public void testBasicUsage() {
            //creiamo ed inseriamo un professionista
        Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save( new Professionista( "gino","di meo", "ginodimeo@gmail.com", "3389556212", 30,569L , "ortona") );
	session.getTransaction().commit();
	session.close();
	
	// visualizziamo i professionisti memorizzati su db
	session = sessionFactory.openSession();
	session.beginTransaction();
	List<Professionista> result = session.createQuery( "from Professionista" ).list();
	for ( Professionista professionista : (List<Professionista>) result ) {
	System.out.println( "Professionista (" + professionista.getNomep() + ") : " + professionista.getCognomep()+"  "+ professionista.getTelp()+ professionista.getCittà() + professionista.getmailp() + professionista.getEtap() );
	}
	session.getTransaction().commit();
	session.close();
	//select dal professionista ordinando per età 
        session=sessionFactory.openSession();
        session.beginTransaction();
        String h1 = "FROM Professionista E SELECT * ORDER BY E.etàp DESC";
        Query query = session.createQuery(h1);
        List results = query.list();
        System.out.println(results);
        session.getTransaction().commit();
        session.close();
        //select da professionista ordinando per categoria
        session=sessionFactory.openSession();
        session.beginTransaction();
        String h2 = "FROM Professionista E SELECT * ORDER BY E.id_categ";
        Query query1 = session.createQuery(h2);
        List results1 = query1.list();
        System.out.println(results1);
        session.getTransaction().commit();
        session.close();
        }
	public static void main (String arg[]) throws Exception{
	DBProfessionista test= new DBProfessionista();
	test.setUp();
	test.testBasicUsage();
	test.shutDown();
	}
	}
