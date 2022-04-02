package Java.Session4.Exersice1;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader= new Scanner(System.in);
        Student student=new Student();
        System.out.print("Enter your name:");
        String name=reader.nextLine();
        int a=name.compareToIgnoreCase(student.Name());
        if(a!=0)
        {
            throw new Exception("Error:the name isn't correct!");
        }
        System.out.print("Enter your Username:");
        String username=reader.nextLine();
        int b=username.compareToIgnoreCase(student.Username());
        if(b!=0)
        {
            throw new Exception("Error:the Username isn't correct!");
        }
        System.out.print("Enter your Password:");
        int password= reader.nextInt();
        if(password!=student.Password())
        {
            throw new Exception("Error:Password isn't correct!");
        }
        else
        {
            System.out.println("Welcome Ali");
        }


    }
}
