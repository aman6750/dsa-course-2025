package ISC;

public class InheritanceTwo extends InheritenceConcept{
	
	double bill;
	double surcharge;
	double finalbill;
	
	public InheritanceTwo(String n,int un,double bill,double surcharge,double finalbill) {
		super(n,un);
		bill = 0.0;
		surcharge = 0.0;
		finalbill = 0.0;
	}
	
	public void calculate() {
		
		if(units<=199) {
			bill = units*1.20;
		}else if(units>=200 && units<400) {
			bill = units*1.50;
		}else if(units>=400 && units<600) {
			bill = units*1.80;
		}else{
			bill = units*2;
		}
		
		if(bill>400) {
			surcharge = .15*bill;
		}
		
		if(bill<100) {
			finalbill = 100;
		}
	}
	
	public void display() {
		super.show();
		System.out.println(finalbill);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceTwo obj = new InheritanceTwo("aman",5,0.0,0.0,0.0);
		
		obj.calculate();
		obj.display();
		
		
		
	}

}
