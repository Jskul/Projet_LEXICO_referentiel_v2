package service.lexicon.loading;

public abstract class LexiconLineParser {

	private String delimiter;
	
	public LexiconLineParser() {
		
	}
	
	public LexiconLineParser(String delimiter) {
		this.delimiter = delimiter;
	}

	/**
	 * @return the delimiter
	 */
	public String getDelimiter() {
		return this.delimiter;
	}

	/**
	 * @param delimiter the delimiter to set
	 */
	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}
	
	public abstract void parse(String line);

}
