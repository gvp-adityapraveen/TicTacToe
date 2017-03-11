package aditya.games.tictactoe;

class Player {
	
	private String name;
	
	private Boolean turn;
	
	private char choice;
	
	
	void setName(String name){
		this.name = name;
	}
	
	void setTurn(Boolean turn){
		this.turn = turn;
	}
	
	void setChoice(char val){
		this.choice = val;
	}
	
	char getChoice(){
		return this.choice;
	}
}
