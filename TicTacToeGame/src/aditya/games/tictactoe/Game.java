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
		System.out.println(Play.selectBlock(A, 0, 0));
		System.out.println(Play.selectBlock(B, 0, 0));
		System.out.println(Play.selectBlock(B, 2, 0));
		System.out.println(Play.selectBlock(A, 0, 1));
		System.out.println(Play.selectBlock(B, 2, 1));
		System.out.println(Play.selectBlock(A, 0, 2));
		System.out.println(Play.selectBlock(B, 2, 2));

	}

}
