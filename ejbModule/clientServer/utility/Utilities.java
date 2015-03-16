package clientServer.utility;

import clientServer.parameter.ParametersI;

/**
 * A set of shared utilities.
 * 
 * @author JL
 */
public class Utilities  {

	/**
	 * Prints console traces according to ParametersI interface debugging constants.
	 * 
	 * @param	className	String	The name of the class for which traces has to be printed.
	 * @param	methodName	String	The name of the method for which traces has to be printed.
	 * @param	message		String	A message.
	 * @param	start		Boolean	If <code>null</code>, a simple trace tag is printed; If <code>true</code>, a beginning trace tag is printed; If <code>false</code> an end trace is printed. 
	 * @param	returning	boolean	If <code>start == false && returning == true</code>, a return tag is printed.
	 */
	@SuppressWarnings("unused")
	public static void trace(String className, String methodName, String message, Boolean start, boolean returning) {
		if (className == null) {className = "Unspecified class name";}
		if (methodName == null) {methodName = "";}
		if (message == null) {message = "";}
		String startTag = "";
		String endTag = "";

		if (start == null) {
			startTag = "TRACE\t\t>>>";
		} else if (start == true) {
			startTag = "TRACE\tBEGIN\t>>>";
		} else {
			startTag = "TRACE\tEND\t>>>";
			if (returning == true) {
				endTag = "<<< RETURN";
			} else {
				endTag = "<<< END";
			}
		}
		
		String trace = "";
		
		if	(ParametersI.DEBUG_ALL) {
			trace = startTag + "\t" + className + methodName + "\t:\t" + message + "\t" + endTag;
		}
		
		if (trace.length() > 0) {			
			System.out.println(trace);
		}
	}
	
}
