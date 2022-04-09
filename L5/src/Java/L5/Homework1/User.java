package Java.L5.Homework1;

public class User {
    private String Username;
    private String Fullname;
    private String Password;
    private String Address;
    private String Phone;
    private String Degree;

    public User(String username, String fullname, String password, String address, String phone, String degree) {
       this. Username = username;
       this. Fullname = fullname;
        this.Password = password;
        this.Address = address;
        this.Phone = phone;
        this.Degree = degree;
    }
    public User(){}

    public String getUsername() {
        return Username;
    }

    public User setUsername(String username) {
        this.Username = username;
        return this;
    }

    public String getFullname() {
        return Fullname;
    }

    public User setFullname(String fullname) {
        this.Fullname = fullname;
        return this;
    }

    public String getPassword() {
        return Password;
    }

    public User setPassword(String password) {
       this. Password = password;
        return this;
    }

    public String getAddress() {
        return Address;
    }

    public User setAddress(String address) {
        this.Address = address;
        return this;
    }

    public String getPhone() {
        return Phone;
    }

    public User setPhone(String phone) {
        this.Phone = phone;
        return this;
    }

    public String getDegree() {
        return Degree;
    }

    public User setDegree(String degree) {
        this.Degree = degree;
        return this;
    }
}
