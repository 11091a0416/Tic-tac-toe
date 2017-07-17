import java.io.BufferedReader;

import java.io.InputStreamReader;

public class ticTacToe {

	public static void main(String[] args) throws Exception {
		String thisLine=null;
		boolean isWin=false;
		char[][] board=new char[3][3];
		int i=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while((thisLine=br.readLine())!=null){
			char[] c=thisLine.toCharArray();
			for(int j=0;j<3;j++){
				board[i][j]=c[j];
			}
			i++;
			if(i==3){
				break;
			}
			}
		for(int p=0;p<3;p++){
			if(checkRow(board,p,'O')){
			 isWin=true;
			 System.out.print('O');
			}
		
			if(checkRow(board,p,'X')){
				isWin=true;
				System.out.print('X');
			}
		
		
			if(checkColumn(board,p,'O')){
				 isWin=true;
				 System.out.print('O');
				}
			if(checkColumn(board,p,'X')){
				 isWin=true;
				 System.out.print('X');
				}
		}
			if(checkDiagonal(board,'O')){
				isWin=true;
				 System.out.print('O');
			}
			if(checkDiagonal(board,'X')){
				isWin=true;
				 System.out.print('X');
			}
			if(checkAntiDiagonal(board,'O')){
				isWin=true;
				 System.out.print('O');
			}
			if(checkAntiDiagonal(board,'X')){
				isWin=true;
				 System.out.print('X');
			}
			
		   if(!isWin){
			System.out.print("Draw");
		}
	}

	
	static boolean checkRow(char[][] ch, int i, char letter) {
		for(int j=0;j<3;j++){
			if(ch[i][j]!=letter){
				return false;
			}if(j==2){
			return true;
		}
		}
		return false;
	}
	 static boolean checkColumn(char[][] ch, int i, char letter) {
		 for(int j=0;j<3;j++){
			 if(ch[j][i]!=letter){
				 return false;
				 }
			 if(j==2){
				 return true;
			 }
		 }
		
		return false;
	}
	 static boolean checkDiagonal(char[][] ch,char letter) {
		 for(int j=0;j<3;j++){
			 if(ch[j][j]!=letter){
				 return false;
				 }
			 if(j==2){
				 return true;
			 }
		 }
		
		return false;
	}
	 static boolean checkAntiDiagonal(char[][] ch,char letter) {
		 for(int j=0;j<3;j++){
			 if(ch[j][2-j]!=letter){
				 return false;
				 }
			 if(j==2){
				 return true;
			 }
		 }
		
		return false;
	}


}
