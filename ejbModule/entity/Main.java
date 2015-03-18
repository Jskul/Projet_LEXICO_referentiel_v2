package entity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import service.lexicon.loading.LexiconLineParser;
import service.lexicon.loading.Lexique380LineParser;

public class Main {

	public static void main(String[] args) {

		
		LexiconLineParser llp = new Lexique380LineParser();
		
        Scanner scanner = null;
		try {
			scanner = new Scanner(new File("C:/httpd/jboss7/standalone/tmp/tmpfiles/Lexique380.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        Scanner dataScanner = null;
        int index = 0;
        List<FlatLexiconItem> list = new ArrayList<FlatLexiconItem>();
         
        while (scanner.hasNextLine()) {
        	System.out
        	.println(index);
        	String line = scanner.nextLine();
        	if(index > 0) {
	            try {
					list.add( llp.parse(line) );
					System.out.println(list.get( list.size() - 1 ));
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
            index++;
        }
 
        scanner.close();
	}

}
