package INHERITENCE;

public class Student {
	
	String name;
	int academic;
	
	public Student(String n,int a) {
		name = n;
		academic = a;
	}
	
	public void display() {
		System.out.println("Name is :"+name);
		System.out.println("academic score is :"+academic);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
