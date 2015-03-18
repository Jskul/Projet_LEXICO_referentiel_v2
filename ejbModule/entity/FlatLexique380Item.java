package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import clientServer.parameter.EntityParameters;

/**
 * TODO
 * 
 * @author JL
 */
@Entity
@Table(name=EntityParameters.TABLE_FLAT_LEXIQUE_380_NAME)
public class FlatLexique380Item extends FlatLexiconItem implements Serializable {
	
	/**
	 * TODO
	 */
	@Transient
	private static final long serialVersionUID = 1L;

	@Id
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_ID_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_ID_NULLABLE
			)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private	int		id;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_ORTHO_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_ORTHO_NULLABLE,
				length=EntityParameters.LEXIQUE_380_FIELD_ORTHO_LENGTH
			)
	private	String	ortho;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_PHON_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_PHON_NULLABLE,
				length=EntityParameters.LEXIQUE_380_FIELD_PHON_LENGTH
			)
	private	String	phon;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_LEMME_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_LEMME_NULLABLE,
				length=EntityParameters.LEXIQUE_380_FIELD_LEMME_LENGTH
			)
	private	String	lemme;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_CGRAM_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_CGRAM_NULLABLE,
				length=EntityParameters.LEXIQUE_380_FIELD_CGRAM_LENGTH
			)
	private	String	cgram;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_GENRE_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_GENRE_NULLABLE,
				length=EntityParameters.LEXIQUE_380_FIELD_GENRE_LENGTH
			)
	private	String	genre;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_NOMBRE_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_NOMBRE_NULLABLE,
				length=EntityParameters.LEXIQUE_380_FIELD_NOMBRE_LENGTH
			)
	private	String	nombre;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_FREQLEMFILMS2_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_FREQLEMFILMS2_NULLABLE
			)
	private	Float	freqlemfilms2;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_FREQLEMLIVRES_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_FREQLEMLIVRES_NULLABLE
			)
	private	Float	freqlemlivres;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_FREQFILMS2_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_FREQFILMS2_NULLABLE
			)
	private	Float	freqfilms2;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_FREQLIVRES_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_FREQLIVRES_NULLABLE
			)
	private	Float	freqlivres;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_INFOVER_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_INFOVER_NULLABLE,
				length=EntityParameters.LEXIQUE_380_FIELD_INFOVER_LENGTH
			)
	private	String	infover;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_NBHOMOGR_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_NBHOMOGR_NULLABLE
			)
	private	Integer	nbhomogr;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_NBHOMOPH_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_NBHOMOPH_NULLABLE
			)
	private	Integer	nbhomoph;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_ISLEM_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_ISLEM_NULLABLE
			)
	private	boolean	islem;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_NBLETTRES_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_NBLETTRES_NULLABLE
			)
	private	Integer	nblettres;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_NBPHONS_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_NBPHONS_NULLABLE
			)
	private	Integer	nbphons;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_CVCV_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_CVCV_NULLABLE,
				length=EntityParameters.LEXIQUE_380_FIELD_CVCV_LENGTH
			)
	private	String	cvcv;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_P_CVCV_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_P_CVCV_NULLABLE,
				length=EntityParameters.LEXIQUE_380_FIELD_P_CVCV_LENGTH
			)
	private	String	p_cvcv;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_VOISORTH_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_VOISORTH_NULLABLE
			)
	private	Integer	voisorth;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_VOISPHON_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_VOISPHON_NULLABLE
			)
	private	Integer	voisphon;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_PUORTH_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_PUORTH_NULLABLE
			)
	private	Integer	puorth;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_PUPHON_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_PUPHON_NULLABLE
			)
	private	Integer	puphon;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_SYLL_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_SYLL_NULLABLE,
				length=EntityParameters.LEXIQUE_380_FIELD_SYLL_LENGTH
			)
	private	String	syll;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_NBSYLL_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_NBSYLL_NULLABLE
			)
	private	Integer	nbsyll;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_CV_CV_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_CV_CV_NULLABLE,
				length=EntityParameters.LEXIQUE_380_FIELD_CV_CV_LENGTH
			)
	private	String	cv_cv;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_ORTHRENV_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_ORTHRENV_NULLABLE,
				length=EntityParameters.LEXIQUE_380_FIELD_ORTHRENV_LENGTH
			)
	private	String	orthrenv;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_PHONRENV_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_PHONRENV_NULLABLE,
				length=EntityParameters.LEXIQUE_380_FIELD_PHONRENV_LENGTH
			)
	private	String	phonrenv;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_ORTHOSYLL_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_ORTHOSYLL_NULLABLE,
				length=EntityParameters.LEXIQUE_380_FIELD_ORTHOSYLL_LENGTH
			)
	private	String	orthosyll;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_CGRAMORTHO_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_CGRAMORTHO_NULLABLE,
				length=EntityParameters.LEXIQUE_380_FIELD_CGRAMORTHO_LENGTH
			)
	private	String	cgramortho;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_DEFLEM_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_DEFLEM_NULLABLE
			)
	private	Integer	deflem;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_DEFOBS_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_DEFOBS_NULLABLE
			)
	private	Integer	defobs;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_OLD20_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_OLD20_NULLABLE
			)
	private	Float	old20;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_PLD20_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_PLD20_NULLABLE
			)
	private	Float	pld20;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_MORPHODER_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_MORPHODER_NULLABLE,
				length=EntityParameters.LEXIQUE_380_FIELD_MORPHODER_LENGTH
			)
	private	String	morphoder;
	
	@Column(	name=EntityParameters.LEXIQUE_380_FIELD_NBMORPH_NAME,
				nullable=EntityParameters.LEXIQUE_380_FIELD_NBMORPH_NULLABLE
			)
	private	Integer	nbmorph;

	/**
	 * Default constructor.
	 */
	public FlatLexique380Item() {
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the ortho
	 */
	public String getOrtho() {
		return ortho;
	}

	/**
	 * @param ortho the ortho to set
	 * 
	 * @throws Exception 
	 */
	public void setOrtho(String ortho) throws Exception {
		if (ortho == null || ortho.matches("^\\s*$")) {
			throw new Exception("TODO invalid input"); // TODO
		}
		this.ortho = ortho.trim();
	}

	/**
	 * @return the phon
	 */
	public String getPhon() {
		return phon;
	}

	/**
	 * @param phon the phon to set
	 * 
	 * @throws Exception 
	 */
	public void setPhon(String phon) throws Exception {
		if (phon == null || phon.matches("^\\s*$")) {
			throw new Exception("TODO invalid input"); // TODO
		}
		this.phon = phon.trim();
	}

	/**
	 * @return the lemme
	 */
	public String getLemme() {
		return lemme;
	}

	/**
	 * @param lemme the lemme to set
	 * 
	 * @throws Exception 
	 */
	public void setLemme(String lemme) throws Exception {
		if (lemme == null || lemme.matches("^\\s*$")) {
			throw new Exception("TODO invalid input"); // TODO
		}
		this.lemme = lemme.trim();
	}

	/**
	 * @return the cgram
	 */
	public String getCgram() {
		return cgram;
	}

	/**
	 * @param cgram the cgram to set
	 * 
	 * @throws Exception 
	 */
	public void setCgram(String cgram) throws Exception {
		if (cgram == null || cgram.matches("^\\s*$")) {
			throw new Exception("TODO invalid input"); // TODO
		}
		this.cgram = cgram.trim();
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre.trim();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre.trim();
	}

	/**
	 * @return the freqlemfilms2
	 */
	public Float getFreqlemfilms2() {
		return freqlemfilms2;
	}

	/**
	 * @param freqlemfilms2 the freqlemfilms2 to set
	 */
	public void setFreqlemfilms2(Float freqlemfilms2) {
		this.freqlemfilms2 = freqlemfilms2;
	}

	/**
	 * @return the freqlemlivres
	 */
	public Float getFreqlemlivres() {
		return freqlemlivres;
	}

	/**
	 * @param freqlemlivres the freqlemlivres to set
	 */
	public void setFreqlemlivres(Float freqlemlivres) {
		this.freqlemlivres = freqlemlivres;
	}

	/**
	 * @return the freqfilms2
	 */
	public Float getFreqfilms2() {
		return freqfilms2;
	}

	/**
	 * @param freqfilms2 the freqfilms2 to set
	 */
	public void setFreqfilms2(Float freqfilms2) {
		this.freqfilms2 = freqfilms2;
	}

	/**
	 * @return the freqlivres
	 */
	public Float getFreqlivres() {
		return freqlivres;
	}

	/**
	 * @param freqlivres the freqlivres to set
	 */
	public void setFreqlivres(Float freqlivres) {
		this.freqlivres = freqlivres;
	}

	/**
	 * @return the infover
	 */
	public String getInfover() {
		return infover;
	}

	/**
	 * @param infover the infover to set
	 */
	public void setInfover(String infover) {
		this.infover = infover.trim();
	}

	/**
	 * @return the nbhomogr
	 */
	public Integer getNbhomogr() {
		return nbhomogr;
	}

	/**
	 * @param nbhomogr the nbhomogr to set
	 */
	public void setNbhomogr(Integer nbhomogr) {
		this.nbhomogr = nbhomogr;
	}

	/**
	 * @return the nbhomoph
	 */
	public Integer getNbhomoph() {
		return nbhomoph;
	}

	/**
	 * @param nbhomoph the nbhomoph to set
	 */
	public void setNbhomoph(Integer nbhomoph) {
		this.nbhomoph = nbhomoph;
	}

	/**
	 * @return the islem
	 */
	public boolean isIslem() {
		return islem;
	}

	/**
	 * @param islem the islem to set
	 */
	public void setIslem(boolean islem) {
		this.islem = islem;
	}

	/**
	 * @return the nblettres
	 */
	public Integer getNblettres() {
		return nblettres;
	}

	/**
	 * @param nblettres the nblettres to set
	 */
	public void setNblettres(Integer nblettres) {
		this.nblettres = nblettres;
	}

	/**
	 * @return the nbphons
	 */
	public Integer getNbphons() {
		return nbphons;
	}

	/**
	 * @param nbphons the nbphons to set
	 */
	public void setNbphons(Integer nbphons) {
		this.nbphons = nbphons;
	}

	/**
	 * @return the cvcv
	 */
	public String getCvcv() {
		return cvcv;
	}

	/**
	 * @param cvcv the cvcv to set
	 */
	public void setCvcv(String cvcv) {
		this.cvcv = cvcv.trim();
	}

	/**
	 * @return the p_cvcv
	 */
	public String getP_cvcv() {
		return p_cvcv;
	}

	/**
	 * @param p_cvcv the p_cvcv to set
	 */
	public void setP_cvcv(String p_cvcv) {
		this.p_cvcv = p_cvcv.trim();
	}

	/**
	 * @return the voisorth
	 */
	public Integer getVoisorth() {
		return voisorth;
	}

	/**
	 * @param voisorth the voisorth to set
	 */
	public void setVoisorth(Integer voisorth) {
		this.voisorth = voisorth;
	}

	/**
	 * @return the voisphon
	 */
	public Integer getVoisphon() {
		return voisphon;
	}

	/**
	 * @param voisphon the voisphon to set
	 */
	public void setVoisphon(Integer voisphon) {
		this.voisphon = voisphon;
	}

	/**
	 * @return the puorth
	 */
	public Integer getPuorth() {
		return puorth;
	}

	/**
	 * @param puorth the puorth to set
	 */
	public void setPuorth(Integer puorth) {
		this.puorth = puorth;
	}

	/**
	 * @return the puphon
	 */
	public Integer getPuphon() {
		return puphon;
	}

	/**
	 * @param puphon the puphon to set
	 */
	public void setPuphon(Integer puphon) {
		this.puphon = puphon;
	}

	/**
	 * @return the syll
	 */
	public String getSyll() {
		return syll;
	}

	/**
	 * @param syll the syll to set
	 */
	public void setSyll(String syll) {
		this.syll = syll.trim();
	}

	/**
	 * @return the nbsyll
	 */
	public Integer getNbsyll() {
		return nbsyll;
	}

	/**
	 * @param nbsyll the nbsyll to set
	 */
	public void setNbsyll(Integer nbsyll) {
		this.nbsyll = nbsyll;
	}

	/**
	 * @return the cv_cv
	 */
	public String getCv_cv() {
		return cv_cv;
	}

	/**
	 * @param cv_cv the cv_cv to set
	 */
	public void setCv_cv(String cv_cv) {
		this.cv_cv = cv_cv.trim();
	}

	/**
	 * @return the orthrenv
	 */
	public String getOrthrenv() {
		return orthrenv;
	}

	/**
	 * @param orthrenv the orthrenv to set
	 */
	public void setOrthrenv(String orthrenv) {
		this.orthrenv = orthrenv.trim();
	}

	/**
	 * @return the phonrenv
	 */
	public String getPhonrenv() {
		return phonrenv;
	}

	/**
	 * @param phonrenv the phonrenv to set
	 */
	public void setPhonrenv(String phonrenv) {
		this.phonrenv = phonrenv.trim();
	}

	/**
	 * @return the orthosyll
	 */
	public String getOrthosyll() {
		return orthosyll;
	}

	/**
	 * @param orthosyll the orthosyll to set
	 */
	public void setOrthosyll(String orthosyll) {
		this.orthosyll = orthosyll.trim();
	}

	/**
	 * @return the cgramortho
	 */
	public String getCgramortho() {
		return cgramortho;
	}

	/**
	 * @param cgramortho the cgramortho to set
	 */
	public void setCgramortho(String cgramortho) {
		this.cgramortho = cgramortho.trim();
	}

	/**
	 * @return the deflem
	 */
	public Integer getDeflem() {
		return deflem;
	}

	/**
	 * @param deflem the deflem to set
	 */
	public void setDeflem(Integer deflem) {
		this.deflem = deflem;
	}

	/**
	 * @return the defobs
	 */
	public Integer getDefobs() {
		return defobs;
	}

	/**
	 * @param defobs the defobs to set
	 */
	public void setDefobs(Integer defobs) {
		this.defobs = defobs;
	}

	/**
	 * @return the old20
	 */
	public Float getOld20() {
		return old20;
	}

	/**
	 * @param old20 the old20 to set
	 */
	public void setOld20(Float old20) {
		this.old20 = old20;
	}

	/**
	 * @return the pld20
	 */
	public Float getPld20() {
		return pld20;
	}

	/**
	 * @param pld20 the pld20 to set
	 */
	public void setPld20(Float pld20) {
		this.pld20 = pld20;
	}

	/**
	 * @return the morphoder
	 */
	public String getMorphoder() {
		return morphoder;
	}

	/**
	 * @param morphoder the morphoder to set
	 */
	public void setMorphoder(String morphoder) {
		this.morphoder = morphoder.trim();
	}

	/**
	 * @return the nbmorph
	 */
	public Integer getNbmorph() {
		return nbmorph;
	}

	/**
	 * @param nbmorph the nbmorph to set
	 */
	public void setNbmorph(Integer nbmorph) {
		this.nbmorph = nbmorph;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlatLexique380 [id=" + id + ", ortho=" + ortho + ", phon="
				+ phon + ", lemme=" + lemme + ", cgram=" + cgram + ", genre="
				+ genre + ", nombre=" + nombre + ", freqlemfilms2="
				+ freqlemfilms2 + ", freqlemlivres=" + freqlemlivres
				+ ", freqfilms2=" + freqfilms2 + ", freqlivres=" + freqlivres
				+ ", infover=" + infover + ", nbhomogr=" + nbhomogr
				+ ", nbhomoph=" + nbhomoph + ", islem=" + islem
				+ ", nblettres=" + nblettres + ", nbphons=" + nbphons
				+ ", cvcv=" + cvcv + ", p_cvcv=" + p_cvcv + ", voisorth="
				+ voisorth + ", voisphon=" + voisphon + ", puorth=" + puorth
				+ ", puphon=" + puphon + ", syll=" + syll + ", nbsyll="
				+ nbsyll + ", cv_cv=" + cv_cv + ", orthrenv=" + orthrenv
				+ ", phonrenv=" + phonrenv + ", orthosyll=" + orthosyll
				+ ", cgramortho=" + cgramortho + ", deflem=" + deflem
				+ ", defobs=" + defobs + ", old20=" + old20 + ", pld20="
				+ pld20 + ", morphoder=" + morphoder + ", nbmorph=" + nbmorph
				+ "]";
	}

	@Override
	public FlatLexiconItem getDTO() {
		// TODO Auto-generated method stub
		return null;
	}

}
