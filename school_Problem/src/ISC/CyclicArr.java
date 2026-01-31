package ISC;
import java.util.*;

public class CyclicArr {

    int arr[][];
    int n, m;

    public CyclicArr(int row, int col) {
        n = row;
        m = col;
        arr = new int[n][m];
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // Right circular shift on columns
    public void changeMat() {
        for (int i = 0; i < n; i++) {
            int temp = arr[i][m - 1];
            for (int j = m - 1; j > 0; j--) {
                arr[i][j] = arr[i][j - 1];
            }
            arr[i][0] = temp;
        }
    }

    void display() {
        System.out.println("The matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CyclicArr obj = new CyclicArr(5, 4);
        obj.accept();
        obj.changeMat();
        obj.display();
    }
}
