package boardgame;

public class Piece {

	protected Position position;

	// Associations
	private Board board;

	// Constructors
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	// Getters and Setters
	protected Board getBoard() {
		return board;
	}

}
