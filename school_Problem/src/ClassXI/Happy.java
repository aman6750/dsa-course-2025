package ClassXI;
import java.util.*;

public class Happy {
	
	int n;
	
	public Happy() {
		n = 0;
	}
	
	public void getnum(int nn) {
		n = nn;
	}
	
	public int sum_sq_digit(int x) {
		int sum = 0;
		
		while(x>0) {
			int d = x%10;
			sum += d*d;
			x=x/10;
		}
		
		return sum;
		
	}
	
	public void isHappy() {
		
		int temp = n;
		
		while(temp!=1 && temp!=4) {
			temp = sum_sq_digit(temp);
		}
		
				
		if(temp==1) {
			System.out.println("it is an happy number");
		}else {
			System.out.println("it is not an happy number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Happy obj = new Happy();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to be checked");
		int num = sc.nextInt();
		
		obj.getnum(num);
		obj.isHappy();
		
	}

}
