package L7.Homework2.Model;

import java.sql.*;

public class Model_Saipa {
    private String National_Id;
    private String Name;
    private String Father;
    private String Phone;
    private String Address;
    private String Car;
    private String Name_Car;
    private  String Color;
    private int Price;

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }



    public String getName_Car() {
        return Name_Car;
    }

    public void setName_Car(String name_Car) {
        Name_Car = name_Car;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getCar() {
        return Car;
    }

    public void setCar(String car) {
        Car=car;
    }
    public String getNational_Id() {
        return National_Id;
    }

    public void setNational_Id(String national_Id) {
        National_Id = national_Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFather() {
        return Father;
    }

    public void setFather(String father) {
        Father = father;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
    public void getData()
    {
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/L7","root","myjava123");
            PreparedStatement preparedStatement=connection.prepareStatement("insert into saipa(National_Id,Full_Name,Father_Name,phone,Address) values (?,?,?,?,?)");
            preparedStatement.setString(1,getNational_Id());
            preparedStatement.setString(2,getName());
            preparedStatement.setString(3,getFather());
            preparedStatement.setString(4,getPhone());
            preparedStatement.setString(5,getAddress());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void Car()
    {
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/L7","root","myjava123");
            Statement statement=connection.createStatement();
            switch (getCar())
            {
                case "Pried":
                    ResultSet resultSet=statement.executeQuery("select * from Cars_Info where Car_Name='Pride'");
                    while (resultSet.next())
                    {
                        setName_Car(resultSet.getString("Car_Name"));
                        setColor(resultSet.getString("Car_Color"));
                        setPrice(resultSet.getInt("Car_Price"));
                    }
                    break;
                case "Quick":
                    ResultSet resultSet2=statement.executeQuery("select * from Cars_Info where Car_Name='Quick'");
                    while (resultSet2.next())
                    {
                        setName_Car(resultSet2.getString("Car_Name"));
                        setColor(resultSet2.getString("Car_Color"));
                        setPrice(resultSet2.getInt("Car_Price"));
                    }
                    break;
                case "Shahin":
                    ResultSet resultSet3=statement.executeQuery("select * from Cars_Info where Car_Name='Shahin'");
                    while (resultSet3.next())
                    {
                        setName_Car(resultSet3.getString("Car_Name"));
                        setColor(resultSet3.getString("Car_Color"));
                        setPrice(resultSet3.getInt("Car_Price"));
                    }
                    break;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
