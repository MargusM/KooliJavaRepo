package ee.ut.oop.xox;

/**
 * Antud enum kirjeldab mängijat. Trips-traps-trullis on nendeks kas
 * "ikse" või "ringe" tegev mängija. 
 */
public enum Player {
	/** Mängija, kes teeb "ikse". */
	PLAYER_X,
	
	/** Mängija, kes teeb "ringe". */
	PLAYER_O;
	
	/**
	 * Tagastab järgmise käigul oleva mängija tüüp.
	 * 
	 * @param Hetkel käigul oleva mängija tüüp.
	 * @return Kelle käik peaks tulema järgmisena.
	 */
	public static Player getNextPlayer(Player player) {
		if (player == PLAYER_X) {
			return PLAYER_O;
		} else {
			return PLAYER_X;
		}
	}
}
