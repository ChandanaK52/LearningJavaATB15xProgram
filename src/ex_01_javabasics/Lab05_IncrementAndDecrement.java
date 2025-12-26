package ex_01_javabasics;

public class Lab05_IncrementAndDecrement {
    static void main() {
        int a=10;
        System.out.println(a++ + a++ +a++);

        int b=3;
        int c = b++ * ++b; // 3 then ++ increment 4 * increment 5 (3*5)
        System.out.println(c);

        int a1 = 5;

        System.out.println(a1++ + a1--);
    }

}
