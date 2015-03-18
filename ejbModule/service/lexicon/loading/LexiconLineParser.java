package service.lexicon.loading;

import entity.FlatLexiconItem;

public abstract class LexiconLineParser {

	private String delimiter;
	private int fieldCount;
	
	/**
	 * Default constructor.
	 */
	public LexiconLineParser() {
		
	}
	
	public LexiconLineParser(String delimiter) {
		this.delimiter = delimiter;
	}
	
	public LexiconLineParser(String delimiter, int fieldCount) {
		this.delimiter = delimiter;
		this.fieldCount = fieldCount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LexiconLineParser [delimiter=" + delimiter + ", fieldCount="
				+ fieldCount + "]";
	}

	/**
	 * @return the fieldCount
	 */
	public int getFieldCount() {
		return fieldCount;
	}

	/**
	 * @param fieldCount the fieldCount to set
	 */
	public void setFieldCount(int fieldCount) {
		this.fieldCount = fieldCount;
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
	
	public abstract FlatLexiconItem parse(String line) throws Exception;

}
