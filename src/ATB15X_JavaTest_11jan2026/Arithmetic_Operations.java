package ATB15X_JavaTest_11jan2026;

import java.util.Scanner;

public class Arithmetic_Operations {
    public static void main(String[] args)
    {
//   Description:
// Write a Java program that takes two integer numbers and prints their sum, difference, multiplication, division,
// and remainder.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the  first numbers:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the  second numbers:");
        int num2 = scanner.nextInt();
        System.out.println("The sum of two number is "+ (num1+num2));
        System.out.println("The difference of two number is "+ (num1-num2));
        System.out.println("The multiplication of two number is "+ (num1*num2));
        System.out.println("The division of two number is "+ (num1/num2));
        System.out.println("The remainder of two number is "+ (num1%num2));


    }
}
