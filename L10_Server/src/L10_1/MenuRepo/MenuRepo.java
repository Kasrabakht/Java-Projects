package L10_1.MenuRepo;

import L10_1.MenuEnti.MenuEnti;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MenuRepo {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public MenuRepo() throws SQLException {
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/L10","root","myjava123");

    }
    public List<MenuEnti> View() throws Exception
    {
        preparedStatement=connection.prepareStatement("select * from Homework2 ");
        ResultSet resultSet2=preparedStatement.executeQuery();
        List<MenuEnti> menuRepoList=new ArrayList<>();
        while ((resultSet2.next()))
        {
            MenuEnti menuEnti=new MenuEnti();
            menuEnti.setFood1(resultSet2.getString("Food"));
            menuEnti.setPrice(resultSet2.getInt("Price"));
            menuEnti.setFood2(resultSet2.getString("Food"));
            menuEnti.setPrice1(resultSet2.getInt("Price"));
            menuRepoList.add(menuEnti);

        }
        return menuRepoList;
    }
    public List<MenuEnti> Choose() throws SQLException {
        preparedStatement=connection.prepareStatement("select * from Homework2 where Food='Pizza'");
        MenuEnti menuEnti=new MenuEnti();
        List<MenuEnti> menuEntiList=new ArrayList<>();
        ResultSet resultSet=preparedStatement.executeQuery();
        while ((resultSet.next()))
        {
            menuEnti.setFood1(resultSet.getString("Food"));
           menuEnti.setPrice(resultSet.getInt("Price"));
           menuEntiList.add(menuEnti);

        }
        return menuEntiList;
    }
    public void Close() throws SQLException {
        connection.close();
        preparedStatement.close();
    }
}
