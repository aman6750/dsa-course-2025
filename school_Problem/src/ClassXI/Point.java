package ClassXI;
import java.util.*;

public class Point {
	
	int x,y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	
	public void readPoint() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x");
		x = sc.nextInt();
		System.out.println("Enter the value of y");
		y = sc.nextInt();
		
	}
	
	public Point midpoint(Point A, Point B){
		Point mid = new Point();
		mid.x = (A.x+B.x)/2;
		mid.y = (A.y+B.y)/2;
		
		return mid;
	}
	
	void displayPoint() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Point A = new Point();
			
			A.readPoint();
			
			Point B = new Point();
			
			B.readPoint();
			
			Point mid = new Point();
			
			mid = mid.midpoint(A, B);
			
			mid.displayPoint();
			
			
	}

}
