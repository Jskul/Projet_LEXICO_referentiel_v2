package clientServer.parameter;

/**
 * Holds shared parameters.
 * 
 * @author ludovic
 */
public interface ParametersI {

	public static final String PROJECT_ENCODING = "iso-8859-1";
	
	/*
	 * Project names.
	 */
	public final static String SERVER_PROJECT_NAME		=	"Projet_LEXICO_referentiel_v2";
	public final static String WEB_CLIENT_PROJECT_NAME	=	"Projet_LEXICO_referentiel_v2_webClient";
	
	/*
	 * EJB paths.
	 */
	public final static String EJB_SERVICE_FACADE		=	"ejb:/" + SERVER_PROJECT_NAME + "/ServiceFacadeBean!clientServer.service.ServiceFacadeI";
	
	/* Debugging flags */
	
	public static final boolean DEBUG_ALL = false;
	

	
	

	
}
