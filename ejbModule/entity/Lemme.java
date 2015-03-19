package entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import clientServer.parameter.EntityParameters;

/**
 * Handles lemme.
 * 
 * @author ludovic
 */
@Entity
@Table(name=EntityParameters.TABLE_LEMME_NAME)
public class Lemme implements Serializable {
	
	/**
	 * TODO
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(	name=EntityParameters.LEMME_FIELD_ID_NAME,
				nullable=EntityParameters.LEMME_FIELD_ID_NULLABLE
			)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne (	cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch=FetchType.LAZY)
	@JoinColumn(name = "id", unique = false, nullable = false)
//	@Column(	name=EntityParameters.LEMME_FIELD_CGRAM_NAME,
//				nullable=EntityParameters.LEMME_FIELD_CGRAM_NULLABLE
//			)
	private CGram cgram;
	
	@Column(	name=EntityParameters.LEMME_FIELD_FREQUENCE_LIVRES_NAME,
				nullable=EntityParameters.LEMME_FIELD_FREQUENCE_LIVRES_NULLABLE
			)
	private Float frequenceLivres;
	
	@Column(	name=EntityParameters.LEMME_FIELD_FREQUENCE_FILMS_NAME,
			nullable=EntityParameters.LEMME_FIELD_FREQUENCE_FILMS_NULLABLE
		)
	private Float frequenceFilms;
	
	/**
	 * Default constructor.
	 */
	public Lemme () {
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	cgram	CGram	A grammatical category instance.
	 */
	public Lemme(CGram cgram) {
		this.cgram = cgram;
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	id		int		The lemme id.
	 * @param	cgram	CGram	A grammatical category instance.
	 */
	public Lemme(int id, CGram cgram) {
		this.id = id;
		this.cgram = cgram;
	}

	/**
	 * Gets the lemme id.
	 * 
	 * @return	int	The lemme id.
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the lemme id.
	 * 
	 * @param	id	int	The lemme id.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the grammatical category instance.
	 * 
	 * @return	CGram	The grammatical category instance.
	 */
	public CGram getCGram() {
		return this.cgram;
	}

	/**
	 * Sets the grammatical category instance.
	 * 
	 * @param	cgram	CGram	The grammatical category instance.
	 */
	public void setCGram(CGram cgram) {
		this.cgram = cgram;
	}

	/**
	 * Gets the frequency for books.
	 * 
	 * @return	Float	A frequency of occurrence for books.
	 */
	public Float getFrequenceLivres() {
		return this.frequenceLivres;
	}

	/**
	 * Sets the frequency for books.
	 * 
	 * @param	frequenceLivres	Float	A frequency of occurrence for books.
	 */
	public void setFrequenceLivres(Float frequenceLivres) {
		this.frequenceLivres = frequenceLivres;
	}

	/**
	 * Gets the frequency for films.
	 * 
	 * @return	Float	A frequency of occurrence for films.
	 */
	public Float getFrequenceFilms() {
		return this.frequenceFilms;
	}

	/**
	 * Sets the frequency for films.
	 * 
	 * @param	frequenceLivres	Float	A frequency of occurrence for films.
	 */
	public void setFrequenceFilms(Float frequenceFilms) {
		this.frequenceFilms = frequenceFilms;
	}

	/**
	 * Returns an instance description.
	 * 
	 * @return	String	An instance description.
	 */
	@Override
	public String toString() {
		return "Lemme [id=" + id + ", cgram=" + cgram + ", frequenceLivres="
				+ frequenceLivres + ", frequenceFilms=" + frequenceFilms + "]";
	}

}
