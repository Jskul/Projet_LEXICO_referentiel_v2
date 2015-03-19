package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;

import clientServer.parameter.EntityParameters;

/**
 * Handles grammatical subcategories of article.
 * 
 * @author ludovic
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name=EntityParameters.TABLE_CGRAM_ARTICLE_NAME)
public class CGramArticle extends CGram implements Serializable {
	
	/**
	 * TODO
	 */
	@Transient
	private static final long serialVersionUID = 1L;
		
	@Column(	name=EntityParameters.CGRAM_ARTICLE_FIELD_SOUS_LIBELLE_NAME,
				nullable=EntityParameters.CGRAM_ARTICLE_FIELD_SOUS_LIBELLE_NULLABLE
			)
	private String sousLibelle;

	/**
	 * Default constructor.
	 */
	public CGramArticle () {
		super();
	}

	/**
	 * A constructor.
	 * 
	 * @param	libelle		String	The grammatical category name.
	 */
	public CGramArticle(String libelle) {
		super(libelle);
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	libelle		String	The grammatical category name.
	 * @param	sousLibelle	String	The subcategory for article.
	 */
	public CGramArticle(String libelle, String sousLibelle) {
		super(libelle);
		this.sousLibelle = sousLibelle;
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	id		int		The grammatical category id.
	 * @param	libelle	String	The grammatical category name.
	 */
	public CGramArticle(int id, String libelle) {
		super(id, libelle);
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	id		int		The grammatical category id.
	 * @param	libelle	String	The grammatical category name.
	 * @param	sousLibelle	String	The subcategory for article.
	 */
	public CGramArticle(int id, String libelle, String sousLibelle) {
		super(id, libelle);
		this.sousLibelle = sousLibelle;
	}

	/**
	 * Gets the article subcategory name.
	 * 
	 * @return	String	The subcategory for article.
	 */
	public String getSousLibelle() {
		return sousLibelle;
	}

	/**
	 * Set the article subcategory name.
	 * 
	 * @param	sousLibelle	String	The subcategory for article.
	 */
	public void setSousLibelle(String sousLibelle) {
		this.sousLibelle = sousLibelle;
	}

	/**
	 * Returns an instance description.
	 * 
	 * @return	String	An instance description.
	 */
	@Override
	public String toString() {
		return "CGramArticle [sousLibelle=" + sousLibelle + "]";
	}

}
