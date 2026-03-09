package ClassXI;
import java.util.*;

public class Matrix {
	
	int rows;
	int cols;
	int[][] mat;
	
	public Matrix(int r,int c) {
		rows = r;
		cols = c;
		mat = new int[r][c];
	}
	
	public void inputValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values of matrix");
		for(int i=0;  i<rows; i++) {
			for(int j=0; j<cols; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
	}
	
	public Matrix addMatrix(Matrix m1, Matrix m2){
		Matrix result = new Matrix(m1.rows,m1.cols);
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				result.mat[i][j] = m1.mat[i][j] + m2.mat[i][j];
			}
		}
		
		return result;
		
	}
	
	void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matrix m1 = new Matrix(3,4);
		m1.inputValues();
		Matrix m2 = new Matrix(3,4);
		m2.inputValues();
		
		Matrix m;
		
		 m  = m1.addMatrix(m1, m2);
		 
		 m.display();		

	}

}
