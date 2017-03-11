package aditya.games.tictactoe;

public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board();
		Player A = new Player();
		Player B = new Player();
		A.setName("Aditya Praveen");
		B.setName("Sai Praneeth");
		A.setTurn(UsefulConstants.TRUE);
		B.setTurn(UsefulConstants.FALSE);
		A.setChoice('o');
		B.setChoice('x');

	}

}
