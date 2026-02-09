package ISC;
import java.util.*;

public class CharFreqOp {
	
	String word;
	String newWord;
	char maxChar;
	
	public CharFreqOp() {
		word="";
		newWord = "";
		maxChar = '\0';
		
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter word");
		word = sc.next();
	}
	
	public int freq(char ch) {
		int c = 0;
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)==ch) {
				c++;
			}
		}
		return c;
	}

	public void transform() {
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<word.length(); i++) {
			int curr = freq(word.charAt(i));
			if(curr>max){
				max = curr;
				maxChar = word.charAt(i);
			}
		}
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)==maxChar) {
				newWord += '#';
			}else {
				newWord+= word.charAt(i);
			}
		}
		
	}
	
	public void display() {
		System.out.println(word);
		System.out.println(newWord);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CharFreqOp obj = new CharFreqOp();
		
		obj.accept();
		obj.transform();
		obj.display();
		
		
		
	}

}
