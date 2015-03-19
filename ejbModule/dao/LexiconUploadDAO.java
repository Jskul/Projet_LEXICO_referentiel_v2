package dao;

import java.util.List;

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
	public int emptyLexique380() {
		Utilities.trace(this.getClass().getName(), ".emptyLexique380()", null, true, false);
		int deletedCount = em.createNamedQuery("Empty FlatLexique380Item").executeUpdate();
		Utilities.trace(this.getClass().getName(), ".emptyLexique380()", "deletedCount = " + deletedCount, null, false);
		Utilities.trace(this.getClass().getName(), ".emptyLexique380()", null, false, true);
		return deletedCount;
	}
	
	/**
	 * 
	 * @return
	 */
	public int countLexique380Items() {
		Utilities.trace(this.getClass().getName(), ".countLexique380Items()", null, true, false);
		int itemCount = ((Long) em.createNamedQuery("Count FlatLexique380Item items").getSingleResult()).intValue();
		Utilities.trace(this.getClass().getName(), ".countLexique380Items()", null, false, false);
		return itemCount;
	}

}
