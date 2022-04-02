package Session3.Java.TamrinClass;

public class Teacher extends Student
{
    @Override
    public void name() {
        System.out.println("Name:My name is Amir");
    }

    @Override
    public void Familyname() {
        System.out.println("Family Name:My family name is Asghary");
    }

    @Override
    public void age() {
        System.out.println("Age:I'm 42");
    }

    @Override
    public void job() {
        System.out.println("Job:I'm a teacher");
    }

    public void number() {
        System.out.println("Teacher Number:My teacher number is 8899");

    }
}
