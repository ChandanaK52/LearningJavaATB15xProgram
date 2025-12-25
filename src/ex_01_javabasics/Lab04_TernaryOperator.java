package ex_01_javabasics;

public class Lab04_TernaryOperator {
    public static void main(String[] args)
    {
        int n1 = 2;

        int n2 = 9;

        int n3 = -11;

     int res=n1>n2? n1 :(n2>n3?n2:n3);
        System.out.println("Max of 3 number is :" +res);
    }
}
