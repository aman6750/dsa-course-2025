package ISC;

import java.util.Scanner;

public class Flipgram {
	
	String word;
	
	public Flipgram(String s) {
		word = s;
	}
	
	boolean ishetero() {
		
		int len = word.length();
		
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(word.charAt(i)==word.charAt(j)) {
					return true;
				}
			}
		}
		
		return false;
		
		
	}
	
	String flip() {
		
		int len = word.length();
		
		String flipped="";
		
		if(len%2==0) {
			for(int i=len/2; i<len; i++) {
				flipped+= word.charAt(i);
			}
			for(int i=0; i<len/2; i++) {
				flipped+= word.charAt(i);
			}
		}else {
			for(int i=len/2+1; i<len; i++) {
				flipped+= word.charAt(i);
			}
			flipped+= word.charAt(len/2);
			for(int i=0; i<len/2; i++) {
				flipped+= word.charAt(i);
			}
		}
		
		return flipped;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word ");
		String w = sc.next();

		Flipgram obj = new Flipgram(w);
		
		if(obj.ishetero()) {
			System.out.println("flipped  = "+ obj.flip());
		}else {
			System.out.println("it is heterogram");
		}	
	}

}

/*

Question 8 [10]
A class Flipgram has been defined to flip the letters of the left and right halves of a non-heterogram word. If the
word has odd number of characters, then the middle letter remains at its own position.
A heterogram is a word where no letter appears more than once.
Example 1: INPUT: BETTER
     OUTPUT: TERBET
Example 2: INPUT: NEVER
     OUTPUT: ERVNE
Example 3: INPUT: THAN
     OUTPUT: HETEROGRAM
The details of the members of the class are given below:
Class name : Flipgram
Data members/instance variables:
word : to store a word
Methods/Member functions:
Flipgram(String s) : parameterised constructor to assign word = s
boolean ishetero() : to return true if word is a heterogram else return false
String flip() : to interchange the left and right sides of a non-heterogram word and
return the resultant word
void display() : to print the flipped word for a non-heterogram word by invoking
the method flip(). An appropriate message should be printed for a
heterogram word
Specify the class Flipgram giving the details of the constructor(String), boolean ishetero(), String flip() and void
display(). Define a main() function to create an object and call the functions accordingly to enable the task. 

*/