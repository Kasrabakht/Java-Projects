package Java.L4.Homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1=new User();
        User user2=null;
        User user3=null;
        User user4=null;
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter Name:");
        user1.name=reader.nextLine();
        System.out.print("Enter username:");
        user1.username=reader.nextLine();
        System.out.print("Enter age:");
        user1.age=reader.nextLine();
        System.out.print("Enter password:");
        user1.password=reader.nextLine();
        user2= user1.clone();
        user3=user1.clone();
        user4=user1.clone();
        System.out.println("User1:"+user1.name+"   "+user1.username+"  "+user1.age+"  "+user1.password);
        System.out.println("User2:"+user2.name+"  "+user2.username+"  "+user2.age+"  "+user2.password);
        System.out.println("User3:"+user3.name+"   "+user3.username+"  "+user3.age+"  "+user3.password);
        System.out.println("User4:"+user4.name+"  "+user4.username+"  "+user4.age+"  "+user4.password);

    }
}
