package ATB15X_JavaTest_11jan2026;

public class Print_Evennumber_Using_dowhile {
    //Write a Java program to print all even numbers between 1 and 50 using a do-while loop.
    static void main() {
        int i=1;
        do {
           if(i%2==0) {
               System.out.println(i);
           }
                i++;


        }while(i<=50);
    }
}
