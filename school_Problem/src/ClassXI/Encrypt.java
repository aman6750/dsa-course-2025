package ClassXI;
import java.util.*;

public class Encrypt {
	
	String wrd;
	int len;
	String newWrd;
	
	public Encrypt() {
		wrd = "";
		len = 0;
		newWrd = "";
	}
	
	public void acceptWord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the worrd to  be changed");
		wrd = sc.next();
		wrd = wrd.toUpperCase();
		len = wrd.length();
	}
	
	public void nextVowel() {
		
		newWrd = "";
		
		for(int i=0; i<len; i++) {
			char ch = wrd.charAt(i);
			
			switch(ch) {
			case 'A' :
				newWrd+= 'E';
				break;
			case 'E':
				newWrd+= 'I';
				break;
			case 'I' :
				newWrd += 'O';
				break;
			case 'O':
				newWrd += 'U';
				break;
			case 'U':
				newWrd+= 'A';
				break;
			default:
				newWrd+= ch;
				
			}
		}
		
	}
	
	public void display() {
		System.out.println(wrd);
		System.out.println(newWrd);
	}
	
	public static void main(String[] args) {
		
		Encrypt obj = new Encrypt();
		obj.acceptWord();
		obj.nextVowel();
		obj.display();
	}

}
