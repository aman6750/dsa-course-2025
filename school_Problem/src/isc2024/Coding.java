package isc2024;
import java.util.*;

public class Coding {
	
	String word;
	int len;
	
	public Coding() {
		word = "";
		len = 0;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter word");
		word = sc.next();
		len = word.length();
	}
	
	public void find(){
		int ascii;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<len; i++) {
			char ch = word.charAt(i);
				ascii = (int)ch;
				if(ascii<min) {
					min  = ascii;
				}
				if(ascii>max) {
					max = ascii;
				}
				System.out.println("word is :"+  ch);
				System.out.println("ascii value of"+  ch + "is :" + ascii);
		}
		
		System.out.println("ascii value of maxterm is "+max);
		System.out.println("ascii value of minterm is "+min);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coding obj = new Coding();
		obj.accept();
		obj.find();
		
	}

}
