package Inheritance;

class universityPersonal
{
    String name ;
    int age ;
    String gender ;
    universityPersonal(String name , int age , String gender)
    {
        this.name = name ;
        this.age = age ;
        this.gender = gender ;
    } 

    void display()
    {
        System.out.println("Name   :" + name);
        System.out.println("Age   :" + age);
        System.out.println("Gender   :" + gender);
    }
}
class Student extends universityPersonal
{
    String degreeProgram ;
    double cgpa ;
    int semester ;
    Student(String name , int age , String gender , String degreeProgram , double cgpa , int semester )
    {
        super(name, age, gender) ;
        this.degreeProgram = degreeProgram ;
        this.cgpa = cgpa ;
        this.semester = semester ;
    }
    void displayStudent()
    {
        System.out.println("...Student Info...");
        display();
        System.out.println("Degree Program   " + degreeProgram);
        System.out.println("CGPA  " + cgpa);
        System.out.println("Semester   " + semester);
    }
}
class Teacher extends universityPersonal
{
    String designation ;
    double salary ;
    String department ;
    Teacher(String name , int age , String gender , String designation , double salary ,String department)
    {
        super(name, age, gender);
        this.designation = designation ;
        this.salary = salary ;
        this.department = department ;
    }
    void displayTeacher()
    {
        System.out.println("...TEACHER INFO...");
        display();
        System.out.println("DESIGNATION   " + designation);
        System.out.println("SALARY   " + salary);
        System.out.println("DEPARTMENT   " + department);
    }
}
public class P9
{
    public static void main(String[] args) 
    {
        universityPersonal uni = new universityPersonal("zoro", 26, "Male");
        Student st = new Student("ibbi", 20, "Male", "BSCS", 3.25, 2);
        Teacher th = new Teacher("Usman", 35, "Male", "Lecturer", 200000, "Computer Science");

        uni.display();
        st.displayStudent();
        th.displayTeacher();  
    }

    
}
