package L10.H1.UserRepo;

import L10.H1.UserEnti.UserEnti;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public UserRepo() throws SQLException {
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/L10","root","myjava123");
    }
    public void Insert(UserEnti userEnti) throws SQLException {
        preparedStatement=connection.prepareStatement("insert into Homework1(id,username,password) values (?,?,?)");
        preparedStatement.setInt(1,userEnti.getId());
        preparedStatement.setString(2,userEnti.getUsername());
        preparedStatement.setString(3,userEnti.getPassword());
        preparedStatement.executeUpdate();
    }
    public void Update(UserEnti userEnti) throws SQLException
    { preparedStatement=connection.prepareStatement("update Homework1 set id=?,username=?,password=? where id=?");
        preparedStatement.setInt(1,userEnti.getId());
        preparedStatement.setString(2,userEnti.getUsername());
        preparedStatement.setString(3,userEnti.getPassword());
        preparedStatement.setInt(4,userEnti.getEid());
        preparedStatement.executeUpdate();
    }
    public List<UserEnti> View() throws Exception
    {
        preparedStatement=connection.prepareStatement("select * from Homework1");
        ResultSet resultSet=preparedStatement.executeQuery();
        List<UserEnti> userEntiList=new ArrayList<>();
        while ((resultSet.next()))
        {
            UserEnti userEnti=new UserEnti();
            userEnti.setId(resultSet.getInt("id"));
            userEnti.setUsername(resultSet.getString("username"));
            userEnti.setPassword(resultSet.getString("password"));
            userEntiList.add(userEnti);
        }
        return userEntiList;
    }
    public void Close() throws SQLException {
        connection.close();
        preparedStatement.close();
    }
}
