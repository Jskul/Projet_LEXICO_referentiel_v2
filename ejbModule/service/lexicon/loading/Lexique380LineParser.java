package service.lexicon.loading;

import java.util.Scanner;

public class Lexique380LineParser extends LexiconLineParser {

	public Lexique380LineParser() {
		super();
	}
	
	public Lexique380LineParser(String delimiter) {
		super(delimiter);
	}

	
	public void parse(String line) {

        Scanner fieldScanner = new Scanner(line);
        String field = null;
        int fieldIndex = 0;
 
        fieldScanner.useDelimiter(this.getDelimiter());

        while (fieldScanner.hasNext()) {
        	field = fieldScanner.next();
        	if (fieldIndex == 0) {
        		//emp.setId(Integer.parseInt(field));
        	} else if (fieldIndex == 1) {
        		//emp.setName(field);
        	} else if (fieldIndex == 2) {
        		//emp.setRole(field);
        	} else if (fieldIndex == 3) {
        		//emp.setSalary(field);
        	} else {
        		
        	}	
    		fieldIndex++;
        }

        fieldScanner.close();
	}

}
