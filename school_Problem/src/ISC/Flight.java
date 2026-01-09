package ISC;
import java.util.*;


public class Flight {
	
	String flightno;
	String dep_time;
	String arr_time;
	double basefare;
	
	public Flight(String fn,String dt,String at,double bf) {
		flightno = fn;
		dep_time = dt;
		arr_time = at;
		basefare = bf;
	}
	
	public void show() {
		System.out.println("Flight Number is"+flightno);
		System.out.println("departure time is"+dep_time);
		System.out.println("Arrival time is"+arr_time);
		System.out.println("Basefare is"+basefare);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
	}

}
