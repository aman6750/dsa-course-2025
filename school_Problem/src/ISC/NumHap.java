package ISC;
import java.util.*;

public class NumHap {
	
	int x;
	boolean flag;
	
	public NumHap() {
		x = 0;
		flag = false;
	}
	
	public void getnum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to be checked to be happy number");
		x = sc.nextInt();
	}
	
	public int sumsqdigits(int x) {
		if(x==0) {
			return 0;
		}
		if(x==1) {
			flag = true;
			return 1;
		}
		if(x==4) {
			flag = false;
			return x;
		}
		
		int sum = 0;
		while(x>0) {
			int d = x%10;
			sum+= (d*d);
			x= x/10;
		}
		
		return sumsqdigits(sum);
		
		
	}
	
	public void display() {
		if(flag) {
			System.out.println("it is a happy number");
		}else {
			System.out.println("it is not a happy number");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumHap obj = new NumHap();
		obj.getnum();
		int ans = obj.sumsqdigits(obj.x);
		obj.display();
		

	}

}
