package isc2024;

import java.util.Scanner;

public class DeciHex {
	
	int num;
	String hexa;
	
	public DeciHex() {
		num = 0;
		hexa = "";
	}
	
	void getNum() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number to be converted : ");
		num = sc.nextInt();
	}
	
	void convert() {
		
		int n = num;
		int rem;
		
		while(n>0) {
			rem = n%16;
			if(rem<10) {
				hexa = rem+hexa;
			}else {
				hexa = (char)(rem+55)+hexa;
			}
			n  = n/16;
		}
		
	}
	
	void display() {
		System.out.println("Decimal Number is : "+num);
		
		System.out.println("Hexa Decimal Number is : "+hexa);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeciHex obj = new DeciHex();
		
		obj.getNum();
		obj.convert();
		obj.display();
	}

}
