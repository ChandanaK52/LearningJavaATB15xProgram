package ATB15X_JavaTest_11jan2026;

public class Break_Statement {
    //Write a Java program to print numbers from 1 to 10, but stop the loop when the number becomes 5 using the break statement
    static void main() {
        for(int i=1;i<11;i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.println(i);
        }

    }
}
