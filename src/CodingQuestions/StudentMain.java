package CodingQuestions;


class Student extends StudentMain{
    void StudentDetails(String name,int rollNo,String section)
    {
        System.out.println("Student:"+name+","+"Roll No:"+rollNo+","+"Section:"+section);
    }


}
public class StudentMain {
    static void main() {
        Student s=new Student();
        s.StudentDetails("Bob",101,"A");
    }
}
