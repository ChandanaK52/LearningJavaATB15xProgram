package ATB15X_JavaTest_11jan2026;

import java.util.Scanner;

public class Week_Number {
    //Write a Java program to print the name of the day based on a number (1–7) using a switch statement.
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the week number");
        int weekno=scanner.nextInt();
        // int weekno=5;
        switch (weekno)
        {
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
            default:
                System.out.println("Invalid week name");
        }

    }
}
