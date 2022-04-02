package Java.L4.Homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Double>grades=new ArrayList<>();
        Scanner reader=new Scanner(System.in);
        Student student=new Student();
        System.out.print("Enter your name:");
        String name=reader.nextLine();
        student.setName(name);
        System.out.print("Enter your father's name: ");
        String father= reader.nextLine();
        student.setFathername(father);
        System.out.print("Enter your Student Id:");
        int id=reader.nextInt();
        student.setStudentid(id);

        for (int i=0;i<5;i++)
        {
            System.out.print("Enter your grade:");
            Double g= reader.nextDouble();
            grades.add(g);
        }
        System.out.println("Student 's Name:"+student.getName());
        System.out.println("Student's Father's Name:"+student.getFathername());
        System.out.println("Student's Id:"+student.getStudentid());
        for(Double i:grades)
        {
            System.out.println("grade:"+i);
        }


    }
}
