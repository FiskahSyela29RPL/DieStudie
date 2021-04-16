package Introduction;
import java.util.Scanner;
/*Mengelompokkan inputan user (int)*/
public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String a;
        if (N % 2 == 1) {
            a = "Weird";
            System.out.println(a);
        } else {
            if (N >= 2 && N <= 5) {
                a = "Not Weird";
                System.out.println(a);
            } else if (N >= 6 && N <= 20) {
                a = "Weird";
                System.out.println(a);
            } else {
                a = "Not Weird";
                System.out.println(a);
            }
        }
    }
}

