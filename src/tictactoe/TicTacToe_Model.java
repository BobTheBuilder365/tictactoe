package tictactoe;

public class TicTacToe_Model {
	public static final int BOARD_SIZE = 3; // Game board size
	
	public enum ValidMove { X, O }; // Possible moves
	private ValidMove nextMove = ValidMove.X; //Next Move
	
	private ValidMove winner = null; // Set to the winner, if there is one
	
	protected ValidMove[][] board = new ValidMove[BOARD_SIZE][BOARD_SIZE]; // Game board
	
	// Method to make the game move
//	public boolean makeMove(int col, int row) {
//		boolean moveMade = false;
//		
//		
//		
//		
//		return moveMade;
//	}
	
	// Method to check if someone has one
	
}
