package ClassXI;

import java.io.FileInputStream;
import java.util.*;

public class FileProcess {
	
	String name;
	int age;
	double basic;
	
	public FileProcess() {
		name = "";
		age = 0;
		basic = 0.0;
	}
	
	public void printRecords() {
		try {
			
			FileInputStream fis = new FileInputStream("Emp.text");
			Scanner sc = new Scanner(fis);
			
			while(sc.hasNext()) {
				name = sc.next();
				age = sc.nextInt();
				basic = sc.nextDouble();
				
				if(basic<15000) {
					System.out.println(name);
				}
			}	
		} catch (Exception e) {
			System.out.println("Error reading file");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileProcess obj = new FileProcess();
		obj.printRecords();
	}

}
