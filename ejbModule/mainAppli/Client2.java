package mainAppli;

import java.text.ParseException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import clientServer.parameter.EntityParameters;
import clientServer.parameter.ParametersI;
import clientServer.service.ServiceFacadeI;


public class Client2 {

	public static void main(String[] args) throws ParseException, NamingException {
		
		
		//CGramArticle art = new CGramArticle();
		//System.out.println(art);
		
		/*
		
		Context context = new InitialContext();
		ServiceFacadeI serviceFacade 			= (ServiceFacadeI) context.lookup(ParametersI.EJB_SERVICE_FACADE);
		
			
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate0");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// affichage 
		
		System.out.println("*******************[requete : les livres qui ont le theme 31]");
		for (Object l : em.createNativeQuery("select * from " + EntityParameters.TABLE_FLAT_LEXIQUE_380_ITEM_NAME).getResultList())
		{   System.out.println(l);  }
		
		
		//System.out.println("*** " + serviceFacade.emptyLexique380());
			
		// fin transaction
		tx.commit();
		em.close();
		emf.close();
		System.out.println("termine ...");
		
		*/
		
	}
}
