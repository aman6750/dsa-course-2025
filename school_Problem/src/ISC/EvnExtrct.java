package ISC;
import java.util.*;

public class EvnExtrct {

    int mat[];
    int n;

    public EvnExtrct(int size) {
        n = size;
        mat = new int[n];
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = sc.nextInt();

        mat = new int[n];

        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++) {
            mat[i] = sc.nextInt();
        }
    }

    // extract even numbers
    public EvnExtrct pull(EvnExtrct A) {

        // count even numbers first
        int count = 0;
        for(int i=0;i<A.n;i++) {
            if(A.mat[i] % 2 == 0)
                count++;
        }

        // create new object of exact size
        EvnExtrct B = new EvnExtrct(count);

        int k = 0;
        for(int i=0;i<A.n;i++) {
            if(A.mat[i] % 2 == 0) {
                B.mat[k] = A.mat[i];
                k++;
            }
        }

        return B;
    }

    public void display() {
        for(int i=0;i<n;i++) {
            System.out.print(mat[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        EvnExtrct obj = new EvnExtrct(0);
        obj.input();

        EvnExtrct ans = obj.pull(obj);

        System.out.println("Even elements:");
        ans.display();     // display new object
    }
}
