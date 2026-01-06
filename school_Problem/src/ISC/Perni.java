package ISC;
import java.util.*;

public class Perni {
	
	int num;
	
	Perni(){
		num = 0;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		num = sc.nextInt();
		
	}
	
	public int countOne(int k) {
//		System.out.println(k);
		
		if(k==0) {
			return 0;
		}
		
		int dig = k%10;
		return dig + countOne(k/10);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perni obj = new Perni();
		obj.accept();
		int ones = obj.countOne(obj.num);
		boolean isPrime = true;
		
		if(ones<2) {
			isPrime=false;
		}else {
			for(int i=2; i<=ones/2; i++) {
				if(ones%i==0) {
					isPrime = false;
					break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println("this is Pernicious Number");
		}else {
			System.out.println("this is not Pernicious Number");
		}
		

	}

}


/*
 A class Perni has been defined to accept a positive integer in binary number system from the user and display if it
is a Pernicious number or not.
[A pernicious number is a binary number that has minimum of two digits and has prime number of 1’s in it.]
Examples:
• 101 is a pernicious number as the number of 1’s in 101 = 2 and 2 is prime number.
• 10110 is a pernicious number as the number of 1’s in 10110 3 = and 3 is prime number.
• 1111 is a NOT a pernicious number as the number of 1’s in 1111 = 4 and 4 is NOT a prime number.
The details of the members of the class are given below:
Class name : Perni
Data member/instance variable:
num : to store a binary number
Methods/Member functions:
Perni() : constructor to initialise the data member with 0
void accept() : to accept a binary number (containing 0’s and 1’s only)
int countOne(int k) : to count and return the number of 1’s in ‘k’ using recursive technique
void check() : to check whether the given number is a pernicious number by invoking
the function countOne() and to display an appropriate message
Specify the class Perni giving the details of the constructor(), void accept(), int countOne(int) and void check().
Define a main() function to create an object and call the functions accordingly to enable the task. 
 * 
 */
