package Homework1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/L6","KASRA","myjava123");
        User user=new User();
        Scanner reader=new Scanner(System.in);
        System.out.print("What do you want to do?");
        String action=reader.nextLine();
        if(action.equals("Create"))
        {
            PreparedStatement preparedStatement= connection.prepareStatement("insert into homework1(username,name,email,password,age,degree) values (?,?,?,?,?,?)");
            System.out.print("Enter username:");
            user.setUsername(reader.nextLine());
            System.out.print("Enter name");
            user.setName(reader.nextLine());
            System.out.print("Enter Email:");
            user.setEmail(reader.nextLine());
            System.out.print("Enter password");
            user.setPassword(reader.nextLine());
            System.out.print("Enter Age");
            user.setAge(Integer.parseInt(reader.nextLine()));
            System.out.print("Enter degree");
            user.setDegree(reader.nextLine());
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setInt(5,user.getAge());
            preparedStatement.setString(6, user.getDegree());
            preparedStatement.executeUpdate();
            System.out.print("Created........");
            connection.close();


        }
        if (action.equals("Update"))
        {
            PreparedStatement preparedStatement2= connection.prepareStatement("update homework1 set username=?,name=?,email=?,password=?,age=?,degree=? where Username=?");
            System.out.print("Enter username for change: ");
            user.setUpusername(reader.nextLine());
            System.out.print("Enter username");
            user.setUsername(reader.nextLine());
            System.out.print("Enter name");
            user.setName(reader.nextLine());
            System.out.print("Enter Email");
            user.setEmail(reader.nextLine());
            System.out.print("Enter password");
            user.setPassword(reader.nextLine());
            System.out.print("Enter Age");
            user.setAge(Integer.parseInt(reader.nextLine()));
            System.out.print("Enter degree");
            user.setDegree(reader.nextLine());
            preparedStatement2.setString(1, user.getUsername());
            preparedStatement2.setString(2, user.getName());
            preparedStatement2.setString(3, user.getEmail());
            preparedStatement2.setString(4, user.getPassword());
            preparedStatement2.setInt(5,user.getAge());
            preparedStatement2.setString(6,user.getDegree());
            preparedStatement2.setString(7, user.getUpusername());
            preparedStatement2.executeUpdate();
            System.out.println("Updated........");
            connection.close();
        }
    }
}
