package ISC;
import java.util.*;

public class Exchange {
	
	String state;
	String rev;
	int size;
	
	
	public Exchange() {
		rev = "";
		state = "";
		size = 0;
	}
	
	public void readStatement() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter sentence : ");
		state = sc.nextLine();
		size = state.length();
	}
	
	public void exFirstLast()
	{
		String word = "";
		for(int i=0; i<size; i++) {
			char ch = state.charAt(i);
			if(ch!=' ' && ch!='.') {
				word+= ch;
			}else {
				if(word.length()>1) {
					word = word.charAt(word.length()-1) + word.substring(1,word.length()-1)+word.charAt(0);
				}
				rev += word;
				
				if(ch==' ')
					rev+=" ";
				
				word = "";
				}
		}
	}
	
	void display()
    {
        System.out.println("Original Sentence : " + state);
        System.out.println("Changed Sentence  : " + rev);
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exchange obj = new Exchange();
		obj.readStatement();
		obj.exFirstLast();
		obj.display();
		
	}

}
