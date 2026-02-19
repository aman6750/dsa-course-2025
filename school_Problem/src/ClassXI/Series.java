package ClassXI;
import java.util.*;

public class Series {
	
	double x;
	int n;
	double sum;
	
	public Series(){
		x = 0.0;
		n=0;
		sum = 0.0;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x");
		x = sc.nextDouble();
		System.out.println("Enter the value of n");
		n = sc.nextInt();
	}
	
	public double sumSeries(double p,int q) {
		
		if(q==0) {
			return 1;
		}
		
		
		return Math.pow(p, q)+sumSeries(p,q-1);
		
	}
	
	public void display() {
		System.out.println("sum of the series is "+ sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Series obj = new Series();
		obj.input();
		obj.sum = obj.sumSeries(obj.x, obj.n);
		obj.display();

	}

}
