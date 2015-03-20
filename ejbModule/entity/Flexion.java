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
 * Handles flexion.
 * 
 * @author ludovic
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name=EntityParameters.TABLE_FLEXION_NAME)
public abstract class Flexion implements Serializable {
	/**
	 * TODO
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(	name=EntityParameters.FLEXION_FIELD_ID_NAME,
				nullable=EntityParameters.FLEXION_FIELD_ID_NULLABLE
			)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	/**
	 * Default constructor.
	 */
	public Flexion () {

	}

	/**
	 * A constructor.
	 * 
	 * @param	id		int		The flexion id.
	 */
	public Flexion(int id) {
		this.id = id;
	}

	/**
	 * Gets the flexion id.
	 * 
	 * @return	int	The flexion id.
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * Sets the flexion id.
	 * 
	 * @param	id		int		The flexion id.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Returns an instance description.
	 * 
	 * @return	String	An instance description.
	 */
	@Override
	public String toString() {
		return "Flexion [id=" + id + "]";
	}

}
