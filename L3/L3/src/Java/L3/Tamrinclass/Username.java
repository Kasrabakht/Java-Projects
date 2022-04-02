package Java.Session4.Tamrinclass;

import java.util.Scanner;

public class Username {
    public static class  User
    {
        String name[]=new String[4];
        int age[]=new int[2];

    }

    public static void  main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        Scanner reader=new Scanner(System.in);
        User user=new User();
        System.out.println("User 1");
        System.out.print("Enter you name:");
        user.name[0]= in.nextLine();
        System.out.print("Enter tour Family:");
        user.name[1]= in.nextLine();
        System.out.print("Enter tour Age:");
        user.age[0]= reader.nextInt();
        System.out.println("User 2");
        System.out.print("Enter tour name:");
        user.name[2]= in.nextLine();
        System.out.print("Enter your Family:");
        user.name[3]= in.nextLine();
        System.out.print("Enter tour Age:");
        user.age[1]= reader.nextInt();
        if(user.name[0].equals(user.name[2]) && user.name[1].equals(user.name[3]) && user.age[0]==user.age[1])
        {
            throw new Exception("Error:Users are Repetitious ");
        }
        else
        {
            System.out.println("User 1");
            System.out.println(user.name[0]);
            System.out.println(user.name[1]);
            System.out.println(user.age[0]);
            System.out.println("User 2");
            System.out.println(user.name[2]);
            System.out.println(user.name[3]);
            System.out.println(user.age[1]);

        }

    }
}
