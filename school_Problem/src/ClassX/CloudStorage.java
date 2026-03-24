package ClassX;

import java.util.Scanner;

public class CloudStorage {
	
	int acno;
	int space;
	double bill;
	
	public void accept() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter account number");
		acno = sc.nextInt();
		System.out.println("enter space accupied");
		space = sc.nextInt();
		
	}
	
	public void calculate() {
		if(space>0 && space<=15) {
			bill = 15*space;
		}else if(space>15 && space<=30) {
			bill = 15*15;
			bill += 13*(space-15);
		}else {
			bill = 15*15;
			bill+= 13*15;
			bill+=  11*(space-30);
		}
	}
	
	public void display() {
		System.out.println("account number is -"+ acno);
		System.out.println("storage space is - "+ space);
		System.out.println("bill to be paid - "+bill);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CloudStorage obj = new CloudStorage();
		obj.accept();
		obj.calculate();
		obj.display();

	}

}
