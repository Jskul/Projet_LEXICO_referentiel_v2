package clientServer.parameter;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * An enum of cancelation origins.
 * 
 * @author JL
 */
public enum CancelationOrigins {
	
	MISC(0),
	
	LEXICON_UPLOADING(1);
	
	/**
	 * Gets the cancelation origin message.
	 * 
	 * @return	String	A cancelation origin message.
	 */
	public String getMessage() {
		String message = "";
		
		switch (this) {
			case LEXICON_UPLOADING:
				message =  "Abandon de l'importation du r�f�rentiel.";
			break;
		
			case MISC:
				message =  "Action abandonn�e.";
			break;
			
			default :
				message =  "Abandon.";
			;
		}
		
		return message;
	}
	
	/**
	 * Gets the URL encoded cancelation message.
	 * 
	 * @return	String	An URL encoded cancelation message.
	 * 
	 * @throws	UnsupportedEncodingException
	 */
	public String getURLEncodedMessage() throws UnsupportedEncodingException {
		return URLEncoder.encode(this.getMessage(), ParametersI.PROJECT_ENCODING);
	}
	
	private int code;
	
	/**
	 * A constructor.
	 * 
	 * @param	code	int	A cancelation code.
	 */
	private CancelationOrigins (int code) {
		this.code = code;
	}
	
	/**
	 * Gets the cancelation code.
	 *  
	 * @return	int	A A cancelation code.
	 */
	public int getCode () {
		return this.code;
	}

}
