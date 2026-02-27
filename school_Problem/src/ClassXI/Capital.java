package ClassXI;
import java.util.*;

public class Capital {
    String sent;   // Data member to store sentence

    // Constructor to initialize data member
    Capital() {
        sent = "";
    }

    // Method to accept sentence
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sent = sc.nextLine();
    }

    // Method to convert each word's first letter into capital
    void beginCap(Capital C) {
        String s = C.sent;
        String result = "";
        boolean newWord = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (newWord && Character.isLetter(ch)) {
                result = result + Character.toUpperCase(ch);
                newWord = false;
            } else {
                result = result + ch;
            }

            if (ch == ' ')
                newWord = true;
        }

        sent = result;   // store in current object
    }

    // Method to display sentence
    void display() {
        System.out.println("Sentence after capitalizing each word:");
        System.out.println(sent);
    }

    // Main method
    public static void main(String args[]) {
        Capital obj1 = new Capital();
        Capital obj2 = new Capital();

        obj1.input();        // accept sentence
        obj2.beginCap(obj1); // generate capitalized sentence
        obj2.display();      // display result
    }
}