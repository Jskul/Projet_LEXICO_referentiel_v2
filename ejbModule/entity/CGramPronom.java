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
 * Handles grammatical subcategories for pronouns.
 * 
 * @author ludovic
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name=EntityParameters.TABLE_CGRAM_PRONOM_NAME)
public class CGramPronom extends CGram implements Serializable {
	
	/**
	 * TODO
	 */
	@Transient
	private static final long serialVersionUID = 1L;
		
	@Column(	name=EntityParameters.CGRAM_PRONOM_FIELD_SOUS_LIBELLE_NAME,
				nullable=EntityParameters.CGRAM_PRONOM_FIELD_SOUS_LIBELLE_NULLABLE
			)
	private String sousLibelle;

	/**
	 * Default constructor.
	 */
	public CGramPronom () {
		super();
	}

	/**
	 * A constructor.
	 * 
	 * @param	libelle		String	The grammatical category name.
	 */
	public CGramPronom(String libelle) {
		super(libelle);
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	libelle		String	The grammatical category name.
	 * @param	sousLibelle	String	The subcategory for pronouns.
	 */
	public CGramPronom(String libelle, String sousLibelle) {
		super(libelle);
		this.sousLibelle = sousLibelle;
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	id		int		The grammatical category id.
	 * @param	libelle	String	The grammatical category name.
	 */
	public CGramPronom(int id, String libelle) {
		super(id, libelle);
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	id		int		The grammatical category id.
	 * @param	libelle	String	The grammatical category name.
	 * @param	sousLibelle	String	The subcategory for pronouns.
	 */
	public CGramPronom(int id, String libelle, String sousLibelle) {
		super(id, libelle);
		this.sousLibelle = sousLibelle;
	}

	/**
	 * Gets the pronoun subcategory name.
	 * 
	 * @return	String	The subcategory for pronouns.
	 */
	public String getSousLibelle() {
		return sousLibelle;
	}

	/**
	 * Set the pronoun subcategory name.
	 * 
	 * @param	sousLibelle	String	The subcategory for pronouns.
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
		return "CGramPronom [sousLibelle=" + sousLibelle + "]";
	}

}
