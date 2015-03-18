package dao;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import clientServer.utility.Utilities;
import entity.FlatLexique380Item;

/**
 * Handles the creation, change and deletion of documents.
 * 
 * Session Bean implementation class LexiconUploadDAO
 */
@Singleton
@LocalBean
public class LexiconUploadDAO {
	
	@PersistenceContext(unitName="DMhibernate")
	private EntityManager em;
	
	/**
	 * TODO 
	 * @param item
	 * 
	 * @return
	 */
	public boolean persist (FlatLexique380Item item) {
		Utilities.trace(this.getClass().getName(), ".persist()", null, true, false);
		boolean status = false;
		if (item != null) {
			em.persist(item);
			status = true;
		}

		Utilities.trace(this.getClass().getName(), ".persist()", null, false, true);
		return status;
	}

	/**
	 * TODO
	 * 
	 * @return
	 */
	public boolean emptyLexique380() {
		Utilities.trace(this.getClass().getName(), ".emptyLexique380()", null, true, false);
		boolean status = false;
		int deletedCount = em.createQuery("DELETE FROM FlatLexique380").executeUpdate(); // TODO named request
		Utilities.trace(this.getClass().getName(), ".emptyLexique380()", "deletedCount = " + deletedCount, null, false);
		if (deletedCount > 0) {
			status = true;
		}
		Utilities.trace(this.getClass().getName(), ".emptyLexique380()", null, false, true);
		return status;
	}
	

}
