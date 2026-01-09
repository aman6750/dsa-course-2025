package ISC;

public class Passenger extends Flight {
	
	int id;
	String name;
	double tax;
	double tot;
	
	
	public Passenger(String fno,String dt,String at,double bf,int pid,String pname) {
        super(fno,dt,at,bf);
		 id = pid;
         name = pname;
         tax = 0.0;
         tot = 0.0;
	}
	
	public void cal() {
		tax = .05*basefare;
		tot = tax + basefare;
	}
	
	public void show() {
		    super.show();   
	        System.out.println("Passenger ID : " + id);
	        System.out.println("Passenger Name : " + name);
	        System.out.println("Tax : " + tax);
	        System.out.println("Total Amount Payable : " + tot);
	}

	
}
