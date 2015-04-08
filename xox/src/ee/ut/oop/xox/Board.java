package ee.ut.oop.xox;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private Player grid[][];
	private Player turn;
	private Player winner;
	private List<WinLine> winLines;
	
	Board() {
		grid = new Player[3][3];
		turn = Player.PLAYER_X;
		winLines = new ArrayList<WinLine>();
	}
	
	private void checkWin() {
		
		for (int i = 0; i < 3; i++) {
			if (grid[0][i] == turn && grid[1][i] == turn && grid[2][i] == turn)
				winLines.add(new WinLine(0, i, 2, i));
			if (grid[i][0] == turn && grid[i][1] == turn && grid[i][2] == turn)
				winLines.add(new WinLine(i, 0, i, 2));
		}
		if (grid[0][0] == turn && grid[1][1] == turn && grid[2][2] == turn)
			winLines.add(new WinLine(0,0, 2, 2));
		if (grid[2][0] == turn && grid[1][1] == turn && grid[0][2] == turn)
			winLines.add(new WinLine(2, 0, 0, 2));
		
		if (!winLines.isEmpty()) winner = turn;
	}
	
	public void makeMove(int x, int y) {
		if (isOccupied(x, y)) {
			// Kui koodi muuta, siis võib siin erindi küsimus kerkida.
		}
		
		// Märgime mänguvälja täidetuks hetkel käigul oleva kasutaja poolt.
		grid[x][y] = turn;
		
		checkWin();
		
		if (isRunning()) {
			// Anname mängujärje teisele mängijale üle.
			turn = Player.getNextPlayer(turn);
		}
	}
	
	public boolean allOccupied(){
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (! isOccupied(i,j))
					return false;
			}
		}
		return true;
	}
	
	/**
	 * Tagastab, kas mäng endiselt käib.
	 * @return Tagastab tõese väärtuse, kui mäng on aktiivne.
	 */
	public boolean isRunning() {
		return winner == null;
	}
	
	/**
	 * Tagastab kas antud mänguväli on juba hõivatud.
	 * @param x Mänguvälja x-koordinaat.
	 * @param y Mänguvälja y-koordinaat.
	 * @return Kas antud mängulaua ruut on hõivatud?
	 */
	public boolean isOccupied(int x, int y) {
		return getOwner(x, y) != null;
	}
	
	/**
	 * Tagastab mängija, kellele antud ruut kuulub. Kui see mänguväli on
	 * täitmata, tagastab null väärtuse.
	 * @param x Mängulaua x-koordinaat.
	 * @param y Mängulaua y-koordinaat.
	 * @return Tagastab antud ruudu omaniku või null kui see on veel hõivamata.
	 */
	public Player getOwner(int x, int y) {
		return grid[x][y];
	}

	public Player getTurn() {
		return turn;
	}
	
	public List<WinLine> getWinLines() {
		return winLines;
	}
}
