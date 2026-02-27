package practiceUnitOne;
import java.util.*;

public class TicTacToe {
	
	int row;
	int col;
	int mat[][];
	
	
	public TicTacToe() {
		row = 0;
		col = 0;
		mat = new int[row][col];
		
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows in the game");
		row = sc.nextInt();
		System.out.println("Enter the number of columns in the game");
		col = sc.nextInt();
		mat = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe obj = new TicTacToe();
		obj.input();
		
	}

}
