package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="TestZ")
public class TestZ implements Serializable {
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;

	@Id
	@Column(	name="id",
				nullable=false
			)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(	name="libelle",
			nullable=false
		)
	private String libelle;
	
	
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}


	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public TestZ() {

	}

}
