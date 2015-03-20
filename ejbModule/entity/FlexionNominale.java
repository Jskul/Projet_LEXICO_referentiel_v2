package entity;

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
@Entity
@Table(name=EntityParameters.TABLE_FLEXION_NOMINALE_NAME)
public class FlexionNominale extends Flexion {

	/**
	 * TODO
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	
	/**
	 * Notice: When <code>null</code>, the form having this flexion has both genders (ex.: amours).
	 */
	@Column(	name=EntityParameters.FLEXION_NOMINALE_FIELD_GENRE_NAME,
				nullable=EntityParameters.FLEXION_NOMINALE_FIELD_GENRE_NULLABLE
			)
	private String genre;
	
	/**
	 * Notice: When <code>null</code>, the form having this flexion has both numbers (ex.: abat-jour).
	 */
	@Column(	name=EntityParameters.FLEXION_NOMINALE_FIELD_NOMBRE_NAME,
				nullable=EntityParameters.FLEXION_NOMINALE_FIELD_NOMBRE_NULLABLE
			)
	private String nombre;
	
	/**
	 * Default constructor.
	 */
	public FlexionNominale () {
		super();
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	genre	String	The nominal flexion gender.
	 * @param	nombre	String	The nominal flexion number.
	 */
	public FlexionNominale (String genre, String nombre) {
		super();
		this.genre = genre;
		this.nombre = nombre;
	}
	
	public FlexionNominale (int id, String genre, String nombre) {
		super(id);
		this.genre = genre;
		this.nombre = nombre;
	}

	/**
	 * Gets the gender.
	 * 
	 * @return	String The nominal flexion gender.	
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * Sets the gender.
	 * 
	 * @param	genre	String	The nominal flexion gender.
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * Gets the number.
	 * 
	 * @return String	The nominal flexion number.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the number.
	 * 
	 * @param	nombre	String	The nominal flexion number.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Returns an instance description.
	 * 
	 * @return	String	An instance description.
	 */
	@Override
	public String toString() {
		return "FlexionNominale [id=" + super.getId() + ", genre=" + genre + ", nombre=" + nombre + "]";
	}

}
