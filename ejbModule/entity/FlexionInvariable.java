package entity;

import javax.ejb.Singleton;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;

import clientServer.parameter.EntityParameters;

/**
 * Handles nominal flexion.
 * 
 * @author Afpa
 */
@Singleton
@Entity
@Table(name=EntityParameters.TABLE_FLEXION_INVARIABLE_NAME)
public class FlexionInvariable extends Flexion {

	/**
	 * TODO
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	
	/**
	 * Notice: When <code>null</code>, the form having this flexion has both genders (ex.: amours).
	 */
	@Column(	name=EntityParameters.FLEXION_INVARIABLE_FIELD_LIBELLE_NAME,
				nullable=EntityParameters.FLEXION_INVARIABLE_FIELD_LIBELLE_NULLABLE
			)
	private String libelle;
	
	/**
	 * Default constructor.
	 */
	public FlexionInvariable () {
		super();
		this.libelle = "inv";
	}

	/**
	 * Gets the label.
	 * 
	 * @return	String	The label.
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Sets the label.
	 * 
	 * @param	libelle	String	The label.
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
		return "FlexionInvariable [id=" + super.getId() + ", libelle=" + libelle + "]";
	}

}
