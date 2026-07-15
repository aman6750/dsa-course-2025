package ClassX;
import java.util.*;

public class LargestSum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int lar = 0;
		int sm = 9;
		
		while(n>0) {
			int x = n%10;
			if(x>lar) {
				lar = x;
			}
			if(x<sm) {
				sm = x;
			}
			
			n = n/10;
		}
		
		int sum = lar+sm;
		
		if(sum%2==0) {
			System.out.println("sum is even");
		}else {
			
			System.out.println("sum is odd");
		}
		
	}

}


/*
 Define a class to accept a number. Check if the sum of the largest digit and the smallest 
digit is an even number or an odd number. Print appropriate messages.
Sample Input: 6425 3748
Largest digit: 6 8
Smallest digit: 2 3
Sample Output: Sum is even Sum is odd
 */