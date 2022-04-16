package TamrinClass;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/L6","KASRA","myjava123");
        User user=new User();
        System.out.print("What do you do:");
        Scanner reader=new Scanner(System.in);
        String action=reader.nextLine();
        switch (action)
        {
            case "Create":
                System.out.print("Enter username:");
                user.setUsername(reader.nextLine());
                System.out.print("Enter password");
                user.setPassword(reader.nextLine());
                if(user.getUsername() == null && user.getPassword()==null)
                {
                    throw new Exception("Username Or password didn't Entered!");
                }
                else
                {
                    PreparedStatement preparedStatement=connection.prepareStatement("insert into tamrinclass(Username,Password,Email,Name) values (?,?,?,?)");
                    preparedStatement.setString(1, user.getUsername());
                    preparedStatement.setString(2, user.getPassword());
                    preparedStatement.setString(3,null);
                    preparedStatement.setString(4,null);
                    preparedStatement.executeUpdate();
                    connection.close();
                    System.out.print("User Created!");
                    break;

                }
            case "Enter":
                System.out.print("Enter Username:");
                user.setUsername(reader.nextLine());
                System.out.print("Enter Password:");
                user.setPassword(reader.nextLine());
                System.out.print("Enter Name:");
                user.setName(reader.nextLine());
                System.out.print("Enter Email:");
                user.setEmail(reader.nextLine());
                PreparedStatement preparedStatement2=connection.prepareStatement("insert into tamrinclass(Username,Password,Email,Name) values (?,?,?,?)");
                preparedStatement2.setString(1, user.getUsername());
                preparedStatement2.setString(2, user.getPassword());
                preparedStatement2.setString(3, user.getEmail());
                preparedStatement2.setString(4, user.getName());
                preparedStatement2.executeUpdate();
                connection.close();
                System.out.print("Entered.......");
                break;

        }



    }
}
