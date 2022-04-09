package Java.L5.Homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
      Singleton singleton=Singleton.getInstance();
        System.out.print("Enter Name:");
      Singleton.getInstance().setName(reader.nextLine());
         System.out.print("Enter Username:");
        Singleton.getInstance().setUsername(reader.nextLine());
         System.out.print("Enter Password:");
         Singleton.getInstance().setPassword(reader.nextLine());
        System.out.print("Enter Age:");
        Singleton.getInstance().setAge(Integer.parseInt(reader.nextLine()));
        System.out.println("Enter Id:");
        Singleton.getInstance().setId(Integer.parseInt(reader.nextLine()));
        Singleton.getInstance().getName();
        Singleton.getInstance().getUsername();
        Singleton.getInstance().getPassword();
        Singleton.getInstance().getAge();
        Singleton.getInstance().getId();

    }

}
