package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;

import clientServer.parameter.EntityParameters;

/**
 * Handles grammatical subcategories for adjectives.
 * 
 * @author ludovic
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name=EntityParameters.TABLE_CGRAM_ADJECTIF_NAME)
public class CGramAdjectif extends CGram implements Serializable {
	
	/**
	 * TODO
	 */
	@Transient
	private static final long serialVersionUID = 1L;
		
	@Column(	name=EntityParameters.CGRAM_ADJECTIF_FIELD_SOUS_LIBELLE_NAME,
				nullable=EntityParameters.CGRAM_ADJECTIF_FIELD_SOUS_LIBELLE_NULLABLE
			)
	private String sousLibelle;

	/**
	 * Default constructor.
	 */
	public CGramAdjectif () {
		super();
	}

	/**
	 * A constructor.
	 * 
	 * @param	libelle		String	The grammatical category name.
	 */
	public CGramAdjectif(String libelle) {
		super(libelle);
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	libelle		String	The grammatical category name.
	 * @param	sousLibelle	String	The subcategory for adjectives.
	 */
	public CGramAdjectif(String libelle, String sousLibelle) {
		super(libelle);
		this.sousLibelle = sousLibelle;
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	id		int		The grammatical category id.
	 * @param	libelle	String	The grammatical category name.
	 */
	public CGramAdjectif(int id, String libelle) {
		super(id, libelle);
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	id		int		The grammatical category id.
	 * @param	libelle	String	The grammatical category name.
	 * @param	sousLibelle	String	The subcategory for adjectives.
	 */
	public CGramAdjectif(int id, String libelle, String sousLibelle) {
		super(id, libelle);
		this.sousLibelle = sousLibelle;
	}

	/**
	 * Gets the adjective subcategory name.
	 * 
	 * @return	String	The subcategory for adjectives.
	 */
	public String getSousLibelle() {
		return sousLibelle;
	}

	/**
	 * Set the adjective subcategory name.
	 * 
	 * @param	sousLibelle	String	The subcategory for adjectives.
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
		return "CGramAdjectif [sousLibelle=" + sousLibelle + "]";
	}

}
