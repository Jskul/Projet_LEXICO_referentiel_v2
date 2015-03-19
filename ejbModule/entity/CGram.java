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
 * Handles grammatical categories.
 * 
 * @author ludovic
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name=EntityParameters.TABLE_CGRAM_NAME)
public abstract class CGram implements Serializable {
	
	/**
	 * TODO
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(	name=EntityParameters.CGRAM_FIELD_ID_NAME,
				nullable=EntityParameters.CGRAM_FIELD_ID_NULLABLE
			)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(	name=EntityParameters.CGRAM_FIELD_LIBELLE_NAME,
				nullable=EntityParameters.CGRAM_FIELD_LIBELLE_NULLABLE
			)
	private String libelle;
	
	/**
	 * Default constructor.
	 */
	public CGram () {
	}

	/**
	 * A constructor.
	 * 
	 * @param	libelle	String	The grammatical category name.
	 */
	public CGram(String libelle) {
		this.libelle = libelle;
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	id		int		The grammatical category id.
	 * @param	libelle	String	The grammatical category name.
	 */
	public CGram(int id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}

	/**
	 * Gets the grammatical category id.
	 * 
	 * @return	int	The grammatical category id.
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the grammatical category id.
	 * 
	 * @param	id	int	The grammatical category id.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the grammatical category name.
	 * 
	 * @return	String	The grammatical category name.
	 */
	public String getLibelle() {
		return this.libelle;
	}

	/**
	 * Sets the grammatical category name.
	 * 
	 * @param	libelle	String	The grammatical category name.
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Returns an instance description.
	 * 
	 * @return	String	An instance description.
	 */
	@Override
	public String toString() {
		return "CGram [id=" + id + ", libelle=" + libelle + "]";
	}

}
