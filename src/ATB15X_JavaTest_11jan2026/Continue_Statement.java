package ATB15X_JavaTest_11jan2026;

public class Continue_Statement {
    //Write a Java program to print numbers from 1 to 10, but skip printing the number 5 using the continue statement.
    static void main() {
        for(int i=1;i<11;i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
