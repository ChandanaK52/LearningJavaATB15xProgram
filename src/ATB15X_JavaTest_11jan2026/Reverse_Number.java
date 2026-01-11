package ATB15X_JavaTest_11jan2026;

public class Reverse_Number {
    //Write a program to reverse a integer number using do-while
    static void main() {
        int num=5783;
        int rev=0;
        do {
            rev=rev*10+num%10;
            num=num/10;

        }while(num!=0);
        System.out.println(rev);


//    while(num!=0)
//    {
//        rev=rev*10+num%10;
//        num=num/10;
//    }
        //System.out.println(rev);



    }
}
