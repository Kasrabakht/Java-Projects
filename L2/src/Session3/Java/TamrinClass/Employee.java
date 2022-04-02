package Session3.Java.TamrinClass;

public class Employee extends Student{
    @Override
    public void name() {
        System.out.println("Name:My name is Ali ");
    }

    @Override
    public void Familyname() {
        System.out.println("Family Name: My family name is Mahmody");
    }

    @Override
    public void age() {
        System.out.println("Age: I'm 31");
    }

    @Override
    public void job() {
        System.out.println("Job: I'm an employee");
    }

    @Override
    public void number() {
        System.out.println("Employee number:My employee number is 7766198");
    }
}
