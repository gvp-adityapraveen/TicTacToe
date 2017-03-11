package aditya.games.tictactoe;

public class Play {
	
	void selectBlock(Player p,int row,int column){
		if (Board.Board[row][column] == '0'){
			Board.Board[row][column] = p.getChoice();
			rowCheck(row, p.getChoice());
			columnCheck(column, p.getChoice());
			if((row == column)||(absolute(row, column)== 2)){
				crossCheck(row,column,p.getChoice());
			}
			
		}else{
			System.out.println("This block is already selected");
		}
		
	}
	
	Boolean isValid(){
		return true;
	}
	
	//optimizations can be made in not checking the clicked block
	Boolean rowCheck(int row,char val){
		int j=0;
		for(;j<UsefulConstants.COLUMNS;j++){
			if(Board.Board[row][j] != val){
				return UsefulConstants.FALSE;
			}
		}
		return UsefulConstants.TRUE;
	}
	
	Boolean columnCheck(int col,char val){
		int i=0;
		for(;i<UsefulConstants.ROWS;i++){
			if(Board.Board[i][col] != val){
				return UsefulConstants.FALSE;
			}
		}
		return UsefulConstants.TRUE;
		}
	
	int absolute(int a,int b){
		return (a-b)>0?(a-b):(b-a);
	}
	
	Boolean crossCheck(int row,int col,char val){
		int i,j;
		if((row == col)&& row !=1){
			for(i=0;i<UsefulConstants.ROWS;i++){  //This would work only for square matrix
				if(Board.Board[i][i] != val){
					return UsefulConstants.FALSE;
					}
				}
		}else if(row == col){
			for(i=0;i<UsefulConstants.ROWS;i++){  //This would work only for square matrix
				if(Board.Board[i][i] != val){
					return UsefulConstants.FALSE;
					}
				}
			}
		return null;
		}
	
	}
