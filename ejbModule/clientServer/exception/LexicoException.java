package clientServer.exception;

import clientServer.parameter.Errors;

/**
 * Handles generic exceptions within the Lexico application.
 * 
 * @author JL
 *
 */
public class LexicoException extends Exception {

	/**
	 * TODO serialVersionUID 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * An Errors enum element.
	 */
	private Errors error = Errors.MISC;

	/**
	 * Default constructor.
	 */
	public LexicoException() {
		super();
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	error	Errors	An Errors enum element.
	 */
	public LexicoException(Errors error) {
		super(error.getMessage());
		this.error = error;
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	error	Errors		An Errors enum element.
	 * @param	cause	Throwable	The cause.
	 */
	public LexicoException(Errors error, Throwable cause) {
		super(error.getMessage(), cause);
		this.error = error;
	}

	/**
	 * A constructor.
	 * 
	 * @param	error				Errors		An Errors enum element.
	 * @param	cause				Throwable	The cause.
	 * @param	enableSuppression	boolean		Whether or not suppression is enabled or disabled.
	 * @param	writableStackTrace	boolean		Whether or not the stack trace should be writable.
	 */
	public LexicoException(Errors error, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(error.getMessage(), cause, enableSuppression, writableStackTrace);
		this.error = error;
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	cause				Throwable	The cause.
	 */
	public LexicoException(Throwable cause) {
		super(cause);
	}
	
	/**
	 * Gets the Errors enum element.
	 * 
	 * @return	Errors	The Errors enum element.
	 */
	public Errors getError () {
		return this.error;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LexicoException [error=" + error + "]";
	}
	
}
