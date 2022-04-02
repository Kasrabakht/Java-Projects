package Session3.Java.TamrinClass;

public class University {
    public static void main(String[] args) {
        Student student=new Student();
        System.out.println("Student information:");
        student.name();
        student.Familyname();
        student.age();
        student.job();
        student.number();
        System.out.println("**************************************");
        System.out.println("Teacher information");
        Teacher teacher=new Teacher();
        teacher.name();
        teacher.Familyname();
        teacher.age();
        teacher.job();
        teacher.number();
        System.out.println("************************************");
        System.out.println("Employee information");
        Employee employee=new Employee();
        employee.name();
        employee.Familyname();
        employee.age();
        employee.job();
        employee.number();
    }

}
