package INHERITENCE;

public class SportStudent extends Student{
	
	int sport;
	int total;
	
	public SportStudent(String n,int a,int s,int t) {
		super(n,a);
		sport = s;
		total = t;
	}
	
	public void calculateTotal() {
		total = sport+academic;
	}
	
	public void display() {
		super.display();
		System.out.println("sport score is :"+sport);
		System.out.println("total score is :"+total);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportStudent obj = new SportStudent("aman", 10, 77, 0);
		
		obj.calculateTotal();
		obj.display();
		
	}

}
