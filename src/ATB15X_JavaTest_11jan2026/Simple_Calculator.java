package ATB15X_JavaTest_11jan2026;

import java.util.Scanner;

public class Simple_Calculator
{
//Write a Java program to perform addition, subtraction,multiplication, or division based on user choice using a switch statement.
static void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number1");
    int a = scanner.nextInt();
    System.out.println("Enter the number2");
    int b = scanner.nextInt();
    int d = a + b;
    int e=a-b;
    int f=a*b;
    int g=a/b;
    System.out.println("Enter the choice");
    int choice=scanner.nextInt();
    switch (choice) {
        case 1:
            System.out.println("Addition of two number is "+d);
            break;
        case 2:
            System.out.println("Subtraction of two number is "+e);
            break;
        case 3:
            System.out.println("Subtraction of two number is"+ f);
            break;
        case 4:
            System.out.println("Subtraction of two number is "+g);
            break;
        default:
            System.out.println("Invalid Operation");
    }


}


}

