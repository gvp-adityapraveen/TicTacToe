package aditya.games.tictactoe;

public class Play {
	
	static Boolean selectBlock(Player p,int row,int column){
		Boolean gameOver;
		if (Board.Board[row][column] == '0'){
			Board.Board[row][column] = p.getChoice();
			gameOver = rowCheck(row, p.getChoice());
			if(gameOver){
				return UsefulConstants.TRUE;
			}
			gameOver =columnCheck(column, p.getChoice());
			if(gameOver){
				return UsefulConstants.TRUE;
			}
			if((row == column)||(absolute(row, column)== 2)){
				return crossCheck(row,column,p.getChoice());
			}
			
		}else{
			System.out.println("This block is already selected");
			return UsefulConstants.FALSE;
		}
		return UsefulConstants.FALSE;
		
	}
	
	
	//optimizations can be made in not checking the clicked block
	static Boolean rowCheck(int row,char val){
		int j=0;
		for(;j<UsefulConstants.COLUMNS;j++){
			if(Board.Board[row][j] != val){
				return UsefulConstants.FALSE;
			}
		}
		return UsefulConstants.TRUE;
	}
	
	static Boolean columnCheck(int col,char val){
		int i=0;
		for(;i<UsefulConstants.ROWS;i++){
			if(Board.Board[i][col] != val){
				return UsefulConstants.FALSE;
			}
		}
		return UsefulConstants.TRUE;
		}
	
	static int absolute(int a,int b){
		return (a-b)>0?(a-b):(b-a);
	}
	
	static Boolean crossCheck(int row,int col,char val){
		Boolean result;
		if((row == col)&& row !=1){
			return leftDiagonal(val);
			}else if(row == col){
				result = leftDiagonal(val);
				if(result){
					return result;
				}
				return rightDiagonal(val);
			}else{
				return rightDiagonal(val);
			}
		}
	
	static Boolean leftDiagonal(char val){
		int i=0;
		for(;i<UsefulConstants.ROWS;i++){
			if(Board.Board[i][i] != val){
				return UsefulConstants.FALSE;
			}
		}
		return UsefulConstants.TRUE; 
	}
	
	static Boolean rightDiagonal(char val){
		int i,j;
		for(i=UsefulConstants.ROWS-1,j=0;j<UsefulConstants.COLUMNS;j++,i--){
			if(Board.Board[i][j] != val){
				return UsefulConstants.FALSE;
				}
			}
		return UsefulConstants.TRUE;
	}
	
	}
