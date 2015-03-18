package service;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import service.lexicon.loading.LexiconLineParser;
import service.lexicon.loading.Lexique380LineParser;
import clientServer.service.ServiceFacadeI;
import clientServer.utility.Utilities;
import dao.DAOFacade;
import entity.FlatLexiconItem;
import entity.FlatLexique380Item;

/**
 * A facade for services.
 * 
 * Session Bean implementation class ServiceFacadeBean
 */
@Stateless
@Remote(ServiceFacadeI.class)
public class ServiceFacadeBean implements ServiceFacadeI {

	@EJB
	private DAOFacade daoFacade;
	
	/**
	 * TODO
	 */
	@Override
	public boolean persistLexique380Line(String line) {
		Utilities.trace(this.getClass().getName(), ".persistLexique380Line()", null, true, false);
		boolean status = false;
		
		LexiconLineParser llp = new Lexique380LineParser();
		try {
			FlatLexiconItem item = llp.parse(line);
			Utilities.trace(this.getClass().getName(), "item = " + item, null, null, false);
			
			
			status = daoFacade.persist((FlatLexique380Item) item);
		} catch (Exception e) {
			status = false;
		}
		
		Utilities.trace(this.getClass().getName(), ".persistLexique380Line()", null, false, true);
		return status;
	}
	
	/**
	 * TODO
	 */
	@Override
	public boolean emptyLexique380() {
		Utilities.trace(this.getClass().getName(), ".emptyLexique380()", null, true, false);
		boolean status = daoFacade.emptyLexique380();
		Utilities.trace(this.getClass().getName(), ".emptyLexique380()", null, false, true);
		return status;
	}

}
