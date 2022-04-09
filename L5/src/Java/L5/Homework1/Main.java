package Java.L5.Homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter user");
        System.out.println("Enter full name");
        System.out.println("Enter Password");
        System.out.println("Enter Address");
        System.out.println("Enter phone number");
        System.out.println("Enter degree");
      User user=new User().setUsername(reader.nextLine()).setFullname(reader.nextLine()).setPassword(reader.nextLine()).setAddress(reader.nextLine()).setPhone(reader.nextLine()).setDegree(reader.nextLine());
        System.out.println(user.getUsername());
        System.out.println(user.getFullname());
        System.out.println(user.getPassword());
        System.out.println(user.getAddress());
        System.out.println(user.getPhone());
        System.out.println(user.getDegree());





    }


}

