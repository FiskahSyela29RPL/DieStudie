package Introduction;
import java.util.Scanner;
/*Menampilkan nilai dari inputan user dengan tipe data int, double dan String*/
public class Solution4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int i = a.nextInt();
        double d = a.nextDouble();
        a.nextLine();
        String s = a.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

