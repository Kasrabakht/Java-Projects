package Java.L4.TamrinClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        User user=new User();
        System.out.print("Enter your username:");
        user.setUsername(reader.nextLine());
        System.out.print("Enter your Name:");
        user.setName(reader.nextLine());
        System.out.print("Enter your Family name:");
        user.setFamily(reader.nextLine());
        System.out.print("Enter your age:");
        user.setAge(Integer.parseInt(reader.nextLine()));
        System.out.print("Enter your job:");
        user.setJob(reader.nextLine());
        System.out.print("Do you pass the lesson?");
        user.setPass(reader.nextLine());
        System.out.println("Username:"+user.getUsername());
        System.out.println("Name:"+user.getName());
        System.out.println("Family:"+user.getFamily());
        System.out.println("Age:"+user.getAge());
        System.out.println("Job:"+user.getJob());
        System.out.println("Pass:"+user.getPass());
    }
}
