package Introduction;
import java.util.*;

/*Menampilkan nilai perkalian 1-10 dari variabel yang diinputkan */
public class Solution5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            int a = N * i;
            System.out.println(N + " x " + i + " = " + a);
        }
    }
}
