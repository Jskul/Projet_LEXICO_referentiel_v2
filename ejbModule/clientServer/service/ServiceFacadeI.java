package clientServer.service;

import javax.ejb.Remote;

/**
 * An interface for facade services.
 * 
 * @author JL
 */
@Remote
public interface ServiceFacadeI {

	public boolean persistLexique380Line(String line);

	public boolean emptyLexique380();
	
	
	
}
