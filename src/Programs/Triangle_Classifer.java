package Programs;

import java.util.Scanner;

public class Triangle_Classifer {
    static void main() {
       // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal),
        // or scalene (no sides are equal). Use an if-else statement to classify the triangle.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of first side a is:");
        int a=scanner.nextInt();
        System.out.println("Enter the value of second side a1 is:");
        int a1=scanner.nextInt();
        System.out.println("Enter the value of third side a2 is:");
        int a2=scanner.nextInt();

        if(a==a1 && a1==a2)
        {
            System.out.println("Equilateral triangle");
        }
        else if (a==a1 || a1==a2 || a==a2)
        {
            System.out.println("isosceles triangle");
        }
        else {
            System.out.println("scalene triangle");
        }
    }
}
