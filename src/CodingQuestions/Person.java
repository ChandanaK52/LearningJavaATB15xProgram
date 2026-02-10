package CodingQuestions;

public class Person extends Person1 {
    static void main() {
        Person1 p1 = new Person1();
        p1.display(25,"John");
        p1.display(30,"Alice");

    }
}
class Person1
{
    void display(int age ,String name)
    {
        System.out.println("Name:" + name +" ,"+ "Age:"+""+age);
    }
}



