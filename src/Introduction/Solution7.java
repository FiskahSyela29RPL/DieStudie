package Introduction;
import java.util.*;
import java.io.*;

//looping 2 java dasar
public class Solusi{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        for(int i=0;a<t;i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int b = x;
            for(int j=0;j<z;j++){
                b += Math.pow(2, j)*y;
                System.out.printf("%s ",b);
            }
            System.out.println();
        }
        in.close();
    }
}
