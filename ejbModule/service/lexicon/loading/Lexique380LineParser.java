package service.lexicon.loading;

import java.util.Scanner;
import java.util.regex.Pattern;

import clientServer.utility.Utilities;
import entity.FlatLexiconItem;
import entity.FlatLexique380Item;

/**
 * 
 * 
 * @author JL
 */
public class Lexique380LineParser extends LexiconLineParser {

	/**
	 * TODO
	 * 
	 * @param field
	 * @return
	 */
	private static boolean isValidFloatString (String field) {
		boolean status = false;
		if (field != null) {			
			status = field.matches("^\\s*\\d*\\.?\\d+\\s*$");
		}
		
		return status;
	}
	
	/**
	 * TODO
	 * 
	 * @param field
	 * @return
	 */
	private static boolean isValidIntegerString (String field) {
		boolean status = false;
		if (field != null) {			
			status = field.matches("^\\s*\\d+\\s*$");
		}
		
		return status;
	}
	
	/**
	 * TODO
	 * 
	 * @param field
	 * @return
	 */
	private static boolean isValidBooleanLike (String field) {
		boolean status = false;
		if (field != null) {			
			status = field.matches("^\\s*[0-1]\\s*$");
		}
		
		return status;
	}
	
	/**
	 * TODO
	 * 
	 * @param field
	 * @return
	 */
	private static boolean toBoolean (String field) {
		boolean value = false;
		if 	(field.equals("1")) {
			value = true;
		}
		
		return value;
	}
	
	/**
	 * Default constructor.
	 */
	public Lexique380LineParser() {
		super("\t", 35);
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	delimiter	String	A field delimiter.
	 */
	public Lexique380LineParser(String delimiter) {
		super(delimiter, 35);
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	delimiter	String	A field delimiter.
	 * @param	fieldCount	int		The number of expected fields.
	 */
	public Lexique380LineParser(String delimiter, int fieldCount) {
		super(delimiter, fieldCount);
	}

	/**
	 * TODO
	 * 
	 * @throws Exception 
	 * 
	 * @see	http://www.journaldev.com/2335/how-to-read-csv-file-using-java-scanner-class
	 */
	public FlatLexiconItem parse(String line) throws Exception {
		Utilities.trace(this.getClass().getName(), ".parse()", null, true, false);
		
		if (line == null) {
			throw new Exception("TODO line is null"); // TODO
		}

		if (line.split(Pattern.quote(this.getDelimiter()), -1).length != this.getFieldCount()) {
			throw new Exception("TODO inconsistent field count"); // TODO
		}
		
        Scanner fieldScanner = new Scanner(line);
        String field = null;
        int fieldIndex = 1;
        FlatLexique380Item item = new FlatLexique380Item();
 
        fieldScanner.useDelimiter(this.getDelimiter());

        while (fieldScanner.hasNext()) {
        	field = fieldScanner.next();
        	if (fieldIndex == 1) {
        		item.setOrtho(field);
        	} else if (fieldIndex == 2) {
        		item.setPhon(field);
        	} else if (fieldIndex == 3) {
        		item.setLemme(field);
        	} else if (fieldIndex == 4) {
        		item.setCgram(field);
        	} else if (fieldIndex == 5) {        			
        		item.setGenre(field);
        	} else if (fieldIndex == 6) {
        		item.setNombre(field);
        	} else if (fieldIndex == 7) {
        		if (Lexique380LineParser.isValidFloatString(field)) {
        			item.setFreqlemfilms2( Float.parseFloat(field) );
        		}
        	} else if (fieldIndex == 8) {
        		if (Lexique380LineParser.isValidFloatString(field)) {
        			item.setFreqlemlivres( Float.parseFloat(field) );
        		}
        	} else if (fieldIndex == 9) {
        		if (Lexique380LineParser.isValidFloatString(field)) {
        			item.setFreqfilms2( Float.parseFloat(field) );
        		}
        	} else if (fieldIndex == 10) {
        		if (Lexique380LineParser.isValidFloatString(field)) {
        			item.setFreqlivres( Float.parseFloat(field) );
        		}
        	} else if (fieldIndex == 11) {
        		item.setInfover(field);
        	} else if (fieldIndex == 12) {
        		if (Lexique380LineParser.isValidIntegerString(field)) {
        			item.setNbhomogr( Integer.parseInt(field) );
        		}
        	} else if (fieldIndex == 13) {
        		if (Lexique380LineParser.isValidIntegerString(field)) {
        			item.setNbhomoph( Integer.parseInt(field) );
        		}
        	} else if (fieldIndex == 14) {
        		if (Lexique380LineParser.isValidBooleanLike(field)) {
        			item.setIslem( Lexique380LineParser.toBoolean(field) );
        		}
        	} else if (fieldIndex == 15) {
        		if (Lexique380LineParser.isValidIntegerString(field)) {
        			item.setNblettres( Integer.parseInt(field) );
        		}
        	} else if (fieldIndex == 16) {
        		if (Lexique380LineParser.isValidIntegerString(field)) {
        			item.setNbphons( Integer.parseInt(field) );
        		}
        	} else if (fieldIndex == 17) {
        		item.setCvcv( field );
        	} else if (fieldIndex == 18) {
        		item.setP_cvcv( field );
        	} else if (fieldIndex == 19) {
        		if (Lexique380LineParser.isValidIntegerString(field)) {        			
        			item.setVoisorth( Integer.parseInt(field) );
        		}
        	} else if (fieldIndex == 20) {
        		if (Lexique380LineParser.isValidIntegerString(field)) {        			
        			item.setVoisphon( Integer.parseInt(field) );
        		}
        	} else if (fieldIndex == 21) {
        		if (Lexique380LineParser.isValidIntegerString(field)) {        			
        			item.setPuorth( Integer.parseInt(field) );
        		}
        	} else if (fieldIndex == 22) {
        		if (Lexique380LineParser.isValidIntegerString(field)) {        			
        			item.setPuphon( Integer.parseInt(field) );
        		}
        	} else if (fieldIndex == 23) {
        		item.setSyll(field);
        	} else if (fieldIndex == 24) {
        		if (Lexique380LineParser.isValidIntegerString(field)) {        			
        			item.setNbsyll( Integer.parseInt(field) );
        		}
        	} else if (fieldIndex == 25) {
        		item.setCv_cv( field );
        	} else if (fieldIndex == 26) {
        		item.setOrthrenv(field);
        	} else if (fieldIndex == 27) {
        		item.setPhonrenv(field);
        	} else if (fieldIndex == 28) {
        		item.setOrthosyll(field);
        	} else if (fieldIndex == 29) {
        		item.setCgramortho(field);
        	} else if (fieldIndex == 30) {
        		if (Lexique380LineParser.isValidIntegerString(field)) {        			
        			item.setDeflem( Integer.parseInt(field) );
        		}
        	} else if (fieldIndex == 31) {
        		if (Lexique380LineParser.isValidIntegerString(field)) {        			
        			item.setDefobs( Integer.parseInt(field) );
        		}
        	} else if (fieldIndex == 32) {
        		if (Lexique380LineParser.isValidFloatString(field)) {        			
        			item.setOld20( Float.parseFloat(field) );
        		}
        	} else if (fieldIndex == 33) {
        		if (Lexique380LineParser.isValidFloatString(field)) {        			
        			item.setPld20( Float.parseFloat(field) );
        		}
        	} else if (fieldIndex == 34) {
        		item.setMorphoder( field );
        	} else if (fieldIndex == 35) {
        		if (Lexique380LineParser.isValidIntegerString(field)) {        			
        			item.setNbmorph( Integer.parseInt(field) );
        		}
        	}

    		fieldIndex++;
        }

        fieldScanner.close();
        Utilities.trace(this.getClass().getName(), ".parse()", null, false, true);
        return item;
	}

}
