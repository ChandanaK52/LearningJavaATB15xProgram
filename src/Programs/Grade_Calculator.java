package Programs;

import java.util.Scanner;

public class Grade_Calculator {
    static void main() {
// Write a program that calculates and displays the letter grade for a given numerical score (e.g.,A,B,C,D,orF)
//        based on the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59

      Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Grade number:");
        int grade=scanner.nextInt();
        if(grade>=90 && grade<=100)
        {
            System.out.println("Grade A");
        }
        else if (grade>=80 && grade<=89)
        {
            System.out.println("Grade B");
        }
        else if (grade>=70 && grade<=79)
        {
            System.out.println("Grade C");
        }
        else if (grade>=60 && grade<=69)
        {
            System.out.println("Grade D");
        }
        else if (grade>=0 && grade<=59)
        {
            System.out.println("Grade F");
        }
        else
        {
            System.out.println("Invalid Grade");
        }

            scanner.close();


    }
}
