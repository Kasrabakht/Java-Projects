package L10_Tamrinclass.BankRepo;

import L10_Tamrinclass.BankEnti.BankEnti;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankRepo
{
    private Connection connection;
    private PreparedStatement preparedStatement;
    public BankRepo() throws SQLException {
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/L10","root","myjava123");
    }
   public List<BankEnti> Show() throws Exception
    {
        preparedStatement=connection.prepareStatement("select * from tamrinclass");
        ResultSet resultSet=preparedStatement.executeQuery();
        List<BankEnti> bankEntiList=new ArrayList<>();
        while (resultSet.next())
        {
            BankEnti bankEnti=new BankEnti();
            bankEnti.setIdCard(resultSet.getString("id"));
            bankEnti.setName(resultSet.getString("name"));
            bankEntiList.add(bankEnti);
        }
        return bankEntiList;
    }
    public void Close() throws SQLException {
        connection.close();
        preparedStatement.close();
    }
}

