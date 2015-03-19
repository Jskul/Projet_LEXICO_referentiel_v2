package clientServer.service;

import java.io.File;
import java.util.Map;

import javax.ejb.Remote;

/**
 * An interface for facade services.
 * 
 * @author JL
 */
@Remote
public interface ServiceFacadeI {

	public Map<String,String> persistLexique380File(File file);
//	public boolean persistLexique380Line(String line); // Supprimer

//	public int emptyLexique380(); // Supprimer
	
	
	
}
