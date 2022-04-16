package Homework3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Student student=new Student();
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/L6","root","myjava123");
        Scanner reader=new Scanner(System.in);
        System.out.print("What do you want to do:");
        String action=reader.nextLine();
        switch (action)
        {
            case "Create":
                System.out.print("Enter Id:");
                student.setId(Integer.parseInt(reader.nextLine()));
                System.out.print("Enter Name:");
                student.setName(reader.nextLine());
                System.out.print("Enter the year:");
                student.setYear(Integer.parseInt(reader.nextLine()));
                System.out.print("Enter Average:");
                student.setAverage(Double.parseDouble(reader.nextLine()));
                PreparedStatement preparedStatement= connection.prepareStatement("insert into homework3(Id,Name,Year,Average) values (?,?,?,?)");
                preparedStatement.setInt(1,student.getId());
                preparedStatement.setString(2, student.getName());
                preparedStatement.setInt(3,student.getYear());
                preparedStatement.setDouble(4,student.getAverage());
                preparedStatement.executeUpdate();
                connection.close();
                System.out.print("Created.......");
                break;
            case "Update":
                    System.out.print("Enter Edit for Id:");
                    student.setEdit_Id(Integer.parseInt(reader.nextLine()));
                    System.out.print("Enter new Id:");
                    student.setId(Integer.parseInt(reader.nextLine()));
                    System.out.print("Enter Name:");
                    student.setName(reader.nextLine());
                    System.out.print("Enter Year");
                    student.setYear(Integer.parseInt(reader.nextLine()));
                    System.out.print("Enter Average");
                    student.setAverage(Double.parseDouble(reader.nextLine()));
                    PreparedStatement preparedStatement1= connection.prepareStatement("update homework3 set Id=?,Name=?,Year=?,Average=? where Id=?");
                    preparedStatement1.setInt(1,student.getId());
                    preparedStatement1.setString(2, student.getName());
                    preparedStatement1.setInt(3,student.getYear());
                    preparedStatement1.setDouble(4,student.getAverage());
                    preparedStatement1.setInt(5,student.getEdit_Id());
                    preparedStatement1.executeUpdate();
                    connection.close();
                System.out.print("Edited..........");
                    break;
            case "Delete":
                System.out.print("Enter the Id");
                student.setId(Integer.parseInt(reader.nextLine()));
                PreparedStatement preparedStatement2= connection.prepareStatement("delete from homework3 where Id=?");
                preparedStatement2.setInt(1,student.getId());
                preparedStatement2.executeUpdate();
                connection.close();
                System.out.print("Deleted..........");
        }}
}
