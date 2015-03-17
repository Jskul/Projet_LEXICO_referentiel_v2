package clientServer.parameter;

/**
 * An error enum.
 * 
 * @author JL
 */
public enum Errors {
	
	MISC(0),
	FORBIDDEN_ACCESS(1),
	FORBIDDEN_GET_ACCESS(2),
	FORBIDDEN_POST_ACCESS(3);
	
	/**
	 * Gets the error message.
	 * 
	 * @return	String	An error message.
	 */
	public String getMessage() {
		String message = "";
		
		switch (this) {
			case FORBIDDEN_ACCESS:
				message =  "Accès refusé.";
			break;
			
			case FORBIDDEN_GET_ACCESS:
				message =  "Accés GET refusé.";
			break;
			
			case FORBIDDEN_POST_ACCESS:
				message =  "Accès POST refusé.";
			break;
		
			case MISC:
				message =  "Erreur non-spécifiée.";
			break;
			
			default :
				message =  "Erreur inconnue.";
			;
		}
		
		return message;
	}
	
	
	private int code;
	
	/**
	 * A constructor.
	 * 
	 * @param	code	int	An error code.
	 */
	private Errors (int code) {
		this.code = code;
	}
	
	/**
	 * Gets the error code.
	 *  
	 * @return	int	An error code.
	 */
	public int getCode () {
		return this.code;
	}

}
