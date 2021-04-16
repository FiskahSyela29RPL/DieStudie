package ObjectOriented;
import java.util.*;
import java.lang.*;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class Interface implements AdvancedArithmetic {
    int divisor_sum (int b){
        int c = 0;
        int a = (int) Math.sqrt(b);
        for (int i = 1; i <= a; i++) {
            if (b % i == 0) {
                c += i + b/i;
            }
        }
        if (a * a == b) {
            c -= a;
        }
        return c;
    }
}

class Solution{

    public static void main(String []args){
        Interface my_calculator = new Interface();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
