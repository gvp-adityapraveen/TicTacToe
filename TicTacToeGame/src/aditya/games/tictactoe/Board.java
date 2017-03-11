package aditya.games.tictactoe;

//You can make this singleton object

class Board {
 private final static int rows = 3;
 private final static int columns =3 ;
 public static char[][] Board = new char[rows][columns];
 int noOfUnfilledSlots = rows*columns;
 
 Board(){
	 int i=0,j=0;
	 for(;i<rows;i++){
		 for(;j<columns;j++){
			 Board[i][j]='0';
			 }
		 }
	 }
 }
