package Homework2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Empeloyee empeloyee=new Empeloyee();
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/L6","root","myjava123");
        Scanner reader=new Scanner(System.in);
        String action;
        System.out.print("what do you want to do ");
        action=reader.nextLine();
        switch (action)
        {
            case "Create":
                PreparedStatement preparedStatement= connection.prepareStatement("insert into homework2(id,Name,National_Number,Father_Name,Position,Salary,Work_Experiance )values (?,?,?,?,?,?,?)");
                System.out.print("Enter Id:");
                empeloyee.setId(Integer.parseInt(reader.nextLine()));
                System.out.print("Enter name:");
                empeloyee.setName(reader.nextLine());
                System.out.print("Enter National Number");
                empeloyee.setNational_number(reader.nextLine());
                System.out.print("Enter Father's Name");
                empeloyee.setFather(reader.nextLine());
                System.out.print("Enter Position");
                empeloyee.setPosition(reader.nextLine());
                System.out.print("Enter Salary");
                empeloyee.setSalary(Integer.parseInt(reader.nextLine()));
                System.out.print("Enter the work experience");
                empeloyee.setHistory(reader.nextLine());
                preparedStatement.setInt(1,empeloyee.getId());
                preparedStatement.setString(2,empeloyee.getName());
                preparedStatement.setString(3,empeloyee.getNational_number());
                preparedStatement.setString(4, empeloyee.getFather());
                preparedStatement.setString(5, empeloyee.getFather());
                preparedStatement.setInt(6, empeloyee.getSalary());
                preparedStatement.setString(7, empeloyee.getHistory());
                preparedStatement.executeUpdate();
                connection.close();
                System.out.print("Created......");
                break;
            case "Delete":
                PreparedStatement preparedStatement1= connection.prepareStatement("delete from homework2 where Id=?");
                System.out.print("Enter Id");
                empeloyee.setId(Integer.parseInt(reader.nextLine()));
                preparedStatement1.setInt(1,empeloyee.getId());
                preparedStatement1.executeUpdate();
                connection.close();
                System.out.print("Deleted.....");
                break;
        }

    }
}
