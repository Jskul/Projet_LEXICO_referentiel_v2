package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import parameter.Parameters;
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
//	@Override
//	public boolean persistLexique380Line(String line) {
//		Utilities.trace(this.getClass().getName(), ".persistLexique380Line()", null, true, false);
//		boolean status = false;
//		
//		LexiconLineParser llp = new Lexique380LineParser();
//		try {
//			FlatLexiconItem item = llp.parse(line);
//			Utilities.trace(this.getClass().getName(), "item = " + item, null, null, false);
//			
//			
//			status = daoFacade.persist((FlatLexique380Item) item);
//		} catch (Exception e) {
//			status = false;
//		}
//		
//		Utilities.trace(this.getClass().getName(), ".persistLexique380Line()", null, false, true);
//		return status;
//	}
	
	/**
	 * TODO
	 */
//	@Override
//	public int emptyLexique380() {
//		Utilities.trace(this.getClass().getName(), ".emptyLexique380()", null, true, false);
//		int deletedCount = daoFacade.emptyLexique380();
//		Utilities.trace(this.getClass().getName(), ".emptyLexique380()", null, false, true);
//		return deletedCount;
//	}

	/**
	 * TODO
	 * 
	 * Le client (?) doit tester si le fichier existe avant toute chose
	 * Puis le supprimer
	 */
	@SuppressWarnings("resource")
	@Override
	public Map<String,String> persistLexique380File(File file) {
		Utilities.trace(this.getClass().getName(), ".persistLexique380File()", null, true, false);
		int itemCountBefore = this.daoFacade.countLexique380Items();
		int deletedCount = this.daoFacade.emptyLexique380();
        int index = 1;
        int processed = 0;
        int success = 0;
		boolean persistStatus = false;
		FlatLexiconItem item;
		Scanner scanner = null;
		LexiconLineParser llp = null;
		Map<String,String> report = new HashMap<String,String>();
		try {			
			scanner = new Scanner( file );
			llp = new Lexique380LineParser();
			while (scanner.hasNextLine()) {
				if(index > Parameters.LEXICON_SOURCE_FILE_SKIP_HEADER_LINES_LEXIQUE_380) {
					processed++;
					try {
						item = llp.parse(scanner.nextLine());
						Utilities.trace(this.getClass().getName(), ".persistLexique380File()", "item = " + item, null, false);
						persistStatus = daoFacade.persist((FlatLexique380Item) item);
						if (persistStatus) {
							success++;
						}
					} catch (Exception e) {
						throw new Exception("TODO parsing failed");
					}
				}
				index++;
			}
		} catch (Exception e) {
			persistStatus = false;
		}
        scanner.close();
        report.put("itemCountBefore", Integer.toString(itemCountBefore));
        report.put("deletedCount", Integer.toString(deletedCount));
        report.put("lines", Integer.toString(index-1));
        report.put("processed", Integer.toString(processed));
        report.put("success", Integer.toString(success));
        report.put("persistStatus", Boolean.toString(persistStatus));
        Utilities.trace(this.getClass().getName(), ".persistLexique380File()", "report = " + report, null, false);
        Utilities.trace(this.getClass().getName(), ".persistLexique380File()", null, false, true);
		return report;
	}

}
