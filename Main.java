import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // TODO: Create objects and test code here.
    Person p1 = new person("John Pork", 300); //A person name John pork, age 300
    Person p2 = new person();//John Doe, age 0

    Person p3 = new Person(5); //will not work because we did not make anything for this input

    Student s1 = new Student("Thy", 17, 12, 5.3); //Thy, age 17, grade 12, gpa : 5.3
    Student s2 = new Student(10, 4.5); //John doe, age 0, grade 10, gpa 4.5
    Student s3 = new Student();//John ddoe, age 0, grade 0, gpa 0.0
  }
}
