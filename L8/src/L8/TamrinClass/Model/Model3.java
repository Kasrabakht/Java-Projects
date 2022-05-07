package L8.TamrinClass.Model;

import java.sql.*;

public class Model3 {
    private String Username;
    private String Email;
    private String Pass;
    private String Name;
    private boolean swtch = false;
    private String check_Username;

    public String getCheck_pass() {
        return check_pass;
    }

    public void setCheck_pass(String check_pass) {
        this.check_pass = check_pass;
    }

    private String check_pass;

    public String getCheck_Username() {
        return check_Username;
    }

    public void setCheck_Username(String check_Username) {
        this.check_Username = check_Username;
    }

    private String check_Password;

    public String getCheck_Password() {
        return check_Password;
    }

    public void setCheck_Password(String check_Password) {
        this.check_Password = check_Password;
    }

    public boolean getSwtch() {
        return swtch;
    }

    public void setSwtch(boolean swtch) {
        this.swtch = swtch;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void check() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/L8", "root", "myjava123");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from User");
            while (resultSet.next()) {
                setCheck_Username(resultSet.getString("Username"));
                setCheck_Password(resultSet.getString("Password"));
            }
                if (getCheck_Password().equals(getPass()) && getCheck_Username().equals(getUsername()))
                {
                    setSwtch(true);
                }


        }catch(SQLException e){
                e.printStackTrace();
            }
        }
        public void Create()
        {
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/L8", "root", "myjava123");
                PreparedStatement preparedStatement=connection.prepareStatement("insert into info(Username,Password,Name,Email) value (?,?,?,?)");
                preparedStatement.setString(1,getUsername());
                preparedStatement.setString(2,getPass());
                preparedStatement.setString(3,getName());
                preparedStatement.setString(4,getEmail());
                preparedStatement.executeUpdate();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }




