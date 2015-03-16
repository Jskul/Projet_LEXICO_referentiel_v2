package clientServer.exception;

import clientServer.parameter.Errors;

/**
 * Handles upload exceptions within the Lexico application.
 * 
 * @author JL
 *
 */
public class LexicoUploadException extends LexicoException {

	/**
	 * TODO serialVersionUID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public LexicoUploadException() {
		super();
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	error	Errors	An Errors enum element.
	 */
	public LexicoUploadException(Errors error) {
		super(error);
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	error	Errors		An Errors enum element.
	 * @param	cause	Throwable	The cause.
	 */
	public LexicoUploadException(Errors error, Throwable cause) {
		super(error, cause);
	}

	/**
	 * A constructor.
	 * 
	 * @param	error				Errors		An Errors enum element.
	 * @param	cause				Throwable	The cause.
	 * @param	enableSuppression	boolean		Whether or not suppression is enabled or disabled.
	 * @param	writableStackTrace	boolean		Whether or not the stack trace should be writable.
	 */
	public LexicoUploadException(Errors error, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(error, cause, enableSuppression, writableStackTrace);
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	cause				Throwable	The cause.
	 */
	public LexicoUploadException(Throwable cause) {
		super(cause);
	}

}
