package ISC;
import java.util.*;

public class ColSum {
	
	int mat[][];
	int row;
	int col;
	
	public ColSum(int n,int m) {
		row = n;
		col = m;
		mat = new int[row][col];
	}
	
	
	public void readArray() {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
	}
	
	 boolean check(ColSum A, ColSum B) {
		
		for(int i=0; i<col; i++) {
			int sum1 = 0;
			int sum2 = 0;
			for(int j=0; j<row; j++) {
				sum1 += A.mat[j][i];
				sum2 += B.mat[j][i];
			}
			if(sum1!=sum2) {
				return false;
			}
		}
		
		return true;		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of row ");
		int r = sc.nextInt();
		
		System.out.println("Enter size of column ");
		int c = sc.nextInt();
		
		ColSum obj1 = new ColSum(r,c);
		
		System.out.println("Enter the elements of matrix 1 ");
		
		obj1.readArray();
		
		ColSum obj2 = new ColSum(r,c);
		
		System.out.println("Enter the elements of matrix 2 ");
		
		obj2.readArray();
		
		if(obj1.check(obj1,obj2))
		System.out.println("Sum of corresponding columns is equal.");
	    else
	    System.out.println("Sum of corresponding columns is not equal.");
				
	}

}

/*
Question 7 [10]
Design a class Colsum to check if the sum of elements in each corresponding column of two matrices is equal or
not. Assume that the two matrices have the same dimensions.
Example:
Input:
MATRIX A MATRIX A
2 3 1 	7 4 2
7 5 6 	1 3 1
1 4 2 	2 5 6
Output: Sum of corresponding columns is equal.
The details of the members of the class are given below:
Class name : Colsum
Data members/instance variables:
mat[] [] : to store the integer array elements
m : to store the number of rows
n : to store the number of columns
Member functions/methods:
Colsum(int mm, int nn) : parameterised constructor to initialise the data members m=mm and
n = nn

void readArray() : to accept the elements into the array

boolean check(Colsum A, Colsum B) : to check if the sum of elements in each column of the objects A and B
is equal and return true otherwise, return false
void print() : to display the array elements
Specify the class Colsum giving details of the constructor(int, int), void readArray(), boolean check(Colsum,
Colsum), and void print(). Define the main() function to create objects and call the functions accordingly to enable
the task. 

*/