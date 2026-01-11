package ATB15X_JavaTest_11jan2026;

import java.util.Scanner;

public class EvenandOdd {

//    Description:
//    Write a Java program to check whether a given number is even or odd using arithmetic operators.

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
               int num= scanner.nextInt();
               if(num%2==0)
               {
                   System.out.println(num +" is even");
               }
               else
               {
                   System.out.println(num +" is odd");

               }
    }
}
