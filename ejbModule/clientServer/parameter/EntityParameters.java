package clientServer.parameter;

/**
 * Holds shared parameters.
 * 
 * @author ludovic
 */
public interface EntityParameters {

	/*
	 * Entity: FlatLexique380Item
	 */
	public static final String TABLE_FLAT_LEXIQUE_380_ITEM_NAME = "FlatLexique380";
	
	public static final String LEXIQUE_380_FIELD_ID_NAME = "id";
	public static final boolean LEXIQUE_380_FIELD_ID_NULLABLE = false;
	
	public static final String LEXIQUE_380_FIELD_ORTHO_NAME = "ortho";
	public static final boolean LEXIQUE_380_FIELD_ORTHO_NULLABLE = false;
	public static final int LEXIQUE_380_FIELD_ORTHO_LENGTH = 64;
	
	public static final String LEXIQUE_380_FIELD_PHON_NAME = "phon";
	public static final boolean LEXIQUE_380_FIELD_PHON_NULLABLE = false;
	public static final int LEXIQUE_380_FIELD_PHON_LENGTH = 64;

	public static final String LEXIQUE_380_FIELD_LEMME_NAME = "lemme";
	public static final boolean LEXIQUE_380_FIELD_LEMME_NULLABLE = false;
	public static final int LEXIQUE_380_FIELD_LEMME_LENGTH = 64;

	public static final String LEXIQUE_380_FIELD_CGRAM_NAME = "cgram";
	public static final boolean LEXIQUE_380_FIELD_CGRAM_NULLABLE = false;
	public static final int LEXIQUE_380_FIELD_CGRAM_LENGTH = 32;

	public static final String LEXIQUE_380_FIELD_GENRE_NAME = "genre";
	public static final boolean LEXIQUE_380_FIELD_GENRE_NULLABLE = true;
	public static final int LEXIQUE_380_FIELD_GENRE_LENGTH = 8;

	public static final String LEXIQUE_380_FIELD_NOMBRE_NAME = "nombre";
	public static final boolean LEXIQUE_380_FIELD_NOMBRE_NULLABLE = true;
	public static final int LEXIQUE_380_FIELD_NOMBRE_LENGTH = 16;

	public static final String LEXIQUE_380_FIELD_FREQLEMFILMS2_NAME = "freqlemfilms2";
	public static final boolean LEXIQUE_380_FIELD_FREQLEMFILMS2_NULLABLE = true;

	public static final String LEXIQUE_380_FIELD_FREQLEMLIVRES_NAME = "freqlemlivres";
	public static final boolean LEXIQUE_380_FIELD_FREQLEMLIVRES_NULLABLE = true;

	public static final String LEXIQUE_380_FIELD_FREQFILMS2_NAME = "freqfilms2";
	public static final boolean LEXIQUE_380_FIELD_FREQFILMS2_NULLABLE = true;

	public static final String LEXIQUE_380_FIELD_FREQLIVRES_NAME = "freqlivres";
	public static final boolean LEXIQUE_380_FIELD_FREQLIVRES_NULLABLE = true;

	public static final String LEXIQUE_380_FIELD_INFOVER_NAME = "infover";
	public static final boolean LEXIQUE_380_FIELD_INFOVER_NULLABLE = true;
	public static final int LEXIQUE_380_FIELD_INFOVER_LENGTH = 256;

	public static final String LEXIQUE_380_FIELD_NBHOMOGR_NAME = "nbhomogr";
	public static final boolean LEXIQUE_380_FIELD_NBHOMOGR_NULLABLE = true;

	public static final String LEXIQUE_380_FIELD_NBHOMOPH_NAME = "nbhomoph";
	public static final boolean LEXIQUE_380_FIELD_NBHOMOPH_NULLABLE = true;

	public static final String LEXIQUE_380_FIELD_ISLEM_NAME = "islem";
	public static final boolean LEXIQUE_380_FIELD_ISLEM_NULLABLE = false;

	public static final String LEXIQUE_380_FIELD_NBLETTRES_NAME = "nblettres";
	public static final boolean LEXIQUE_380_FIELD_NBLETTRES_NULLABLE = true;

	public static final String LEXIQUE_380_FIELD_NBPHONS_NAME = "nbphons";
	public static final boolean LEXIQUE_380_FIELD_NBPHONS_NULLABLE = true;

	public static final String LEXIQUE_380_FIELD_CVCV_NAME = "cvcv";
	public static final boolean LEXIQUE_380_FIELD_CVCV_NULLABLE = true;
	public static final int LEXIQUE_380_FIELD_CVCV_LENGTH = 64;

	public static final String LEXIQUE_380_FIELD_P_CVCV_NAME = "p_cvcv";
	public static final boolean LEXIQUE_380_FIELD_P_CVCV_NULLABLE = true;
	public static final int LEXIQUE_380_FIELD_P_CVCV_LENGTH = 64;

	public static final String LEXIQUE_380_FIELD_VOISORTH_NAME = "voisorth";
	public static final boolean LEXIQUE_380_FIELD_VOISORTH_NULLABLE = true;

	public static final String LEXIQUE_380_FIELD_VOISPHON_NAME = "voisphon";
	public static final boolean LEXIQUE_380_FIELD_VOISPHON_NULLABLE = true;

	public static final String LEXIQUE_380_FIELD_PUORTH_NAME = "puorth";
	public static final boolean LEXIQUE_380_FIELD_PUORTH_NULLABLE = true;

	public static final String LEXIQUE_380_FIELD_PUPHON_NAME = "puphon";
	public static final boolean LEXIQUE_380_FIELD_PUPHON_NULLABLE = true;

	public static final String LEXIQUE_380_FIELD_SYLL_NAME = "syll";
	public static final boolean LEXIQUE_380_FIELD_SYLL_NULLABLE = true;
	public static final int LEXIQUE_380_FIELD_SYLL_LENGTH = 64;

	public static final String LEXIQUE_380_FIELD_NBSYLL_NAME = "nbsyll";
	public static final boolean LEXIQUE_380_FIELD_NBSYLL_NULLABLE = true;

	public static final String LEXIQUE_380_FIELD_CV_CV_NAME = "cv_cv";
	public static final boolean LEXIQUE_380_FIELD_CV_CV_NULLABLE = true;
	public static final int LEXIQUE_380_FIELD_CV_CV_LENGTH = 64;

	public static final String LEXIQUE_380_FIELD_ORTHRENV_NAME = "orthrenv";
	public static final boolean LEXIQUE_380_FIELD_ORTHRENV_NULLABLE = true;
	public static final int LEXIQUE_380_FIELD_ORTHRENV_LENGTH = 64;

	public static final String LEXIQUE_380_FIELD_PHONRENV_NAME = "phonrenv";
	public static final boolean LEXIQUE_380_FIELD_PHONRENV_NULLABLE = true;
	public static final int LEXIQUE_380_FIELD_PHONRENV_LENGTH = 64;

	public static final String LEXIQUE_380_FIELD_ORTHOSYLL_NAME = "orthosyll";
	public static final boolean LEXIQUE_380_FIELD_ORTHOSYLL_NULLABLE = true;
	public static final int LEXIQUE_380_FIELD_ORTHOSYLL_LENGTH = 64;

	public static final String LEXIQUE_380_FIELD_CGRAMORTHO_NAME = "cgramortho";
	public static final boolean LEXIQUE_380_FIELD_CGRAMORTHO_NULLABLE = true;
	public static final int LEXIQUE_380_FIELD_CGRAMORTHO_LENGTH = 128;

	public static final String LEXIQUE_380_FIELD_DEFLEM_NAME = "deflem";
	public static final boolean LEXIQUE_380_FIELD_DEFLEM_NULLABLE = true;

	public static final String LEXIQUE_380_FIELD_DEFOBS_NAME = "defobs";
	public static final boolean LEXIQUE_380_FIELD_DEFOBS_NULLABLE = true;

	public static final String LEXIQUE_380_FIELD_OLD20_NAME = "old20";
	public static final boolean LEXIQUE_380_FIELD_OLD20_NULLABLE = true;

	public static final String LEXIQUE_380_FIELD_PLD20_NAME = "pld20";
	public static final boolean LEXIQUE_380_FIELD_PLD20_NULLABLE = true;

	public static final String LEXIQUE_380_FIELD_MORPHODER_NAME = "morphoder";
	public static final boolean LEXIQUE_380_FIELD_MORPHODER_NULLABLE = true;
	public static final int LEXIQUE_380_FIELD_MORPHODER_LENGTH = 64;

	public static final String LEXIQUE_380_FIELD_NBMORPH_NAME = "nbmorph";
	public static final boolean LEXIQUE_380_FIELD_NBMORPH_NULLABLE = true;

	/*
	 * Entity: Lemme
	 */
	public static final String TABLE_LEMME_NAME = "Lemme";

	public static final String LEMME_FIELD_ID_NAME = "id";
	public static final boolean LEMME_FIELD_ID_NULLABLE = false;

	public static final String LEMME_FIELD_CGRAM_NAME = "cgram";
	public static final boolean LEMME_FIELD_CGRAM_NULLABLE = false;
	
	public static final String LEMME_FIELD_FREQUENCE_LIVRES_NAME = "frequenceLivres";
	public static final boolean LEMME_FIELD_FREQUENCE_LIVRES_NULLABLE = true;

	public static final String LEMME_FIELD_FREQUENCE_FILMS_NAME = "frequenceFilms";
	public static final boolean LEMME_FIELD_FREQUENCE_FILMS_NULLABLE = true;

	/*
	 * Entity: CGram
	 */
	public static final String TABLE_CGRAM_NAME = "CGram";
	
	public static final String CGRAM_FIELD_ID_NAME = "id";
	public static final boolean CGRAM_FIELD_ID_NULLABLE = false;
	
	public static final String CGRAM_FIELD_LIBELLE_NAME = "libelle";
	public static final boolean CGRAM_FIELD_LIBELLE_NULLABLE = false;
	
	public static final String CGRAM_FIELD_SOUS_LIBELLE_NAME = "sousLibelle";
	public static final boolean CGRAM_FIELD_SOUS_LIBELLE_NULLABLE = true;
	
	/*
	 * Entity: Flexion
	 */
	public static final String TABLE_FLEXION_NAME = "Flexion";

	public static final String FLEXION_FIELD_ID_NAME = "id";
	public static final boolean FLEXION_FIELD_ID_NULLABLE = false;

	/*
	 * Entity: FlexionNominale
	 */
	public static final String TABLE_FLEXION_NOMINALE_NAME = "FlexionNominale";

	public static final String FLEXION_NOMINALE_FIELD_GENRE_NAME = "genre";
	public static final boolean FLEXION_NOMINALE_FIELD_GENRE_NULLABLE = true;

	public static final String FLEXION_NOMINALE_FIELD_NOMBRE_NAME = "nombre";
	public static final boolean FLEXION_NOMINALE_FIELD_NOMBRE_NULLABLE = true;
	
	/*
	 * Entity: FlexionInvariable
	 */
	public static final String TABLE_FLEXION_INVARIABLE_NAME = "FlexionInvariable";

	public static final String FLEXION_INVARIABLE_FIELD_LIBELLE_NAME = "libelle";
	public static final boolean FLEXION_INVARIABLE_FIELD_LIBELLE_NULLABLE = false;
	
}
