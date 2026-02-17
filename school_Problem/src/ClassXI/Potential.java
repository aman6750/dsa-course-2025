package ClassXI;
import java.util.*;

public class Potential {
	
	String str;
	int p;
	
	public Potential() {
		str = "";
		p = 0;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence ");
		str = sc.nextLine().toUpperCase();		
	}
	
	public int calpot(String w) {
		p=0;
		for(int i=0; i<w.length(); i++) {
			p+= (int)w.charAt(i);
		}
		return p;
	}
	
	public void display() {
		String word = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				word += str.charAt(i);
			}else {
				System.out.println(word+"----"+calpot(word));
				word = "";
			}
		}
		if(word.length()>0) {
			System.out.println(word+"----"+calpot(word));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Potential obj = new Potential();
		obj.accept();
		obj.display();
	}

}
