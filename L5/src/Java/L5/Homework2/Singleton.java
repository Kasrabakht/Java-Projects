package Java.L5.Homework2;

public class Singleton {
    private String Name;
    private String Username;
    private String Password;
    private int Age;
    private int Id;
    public static Singleton singleton;
    private Singleton(){};
    public static Singleton getInstance(){
        if (singleton==null)
        {
            singleton=new Singleton();
        }
        return singleton;}
    public void setName(String name)
    {
        this.Name=name;
    }
    public void getName()
    {
        System.out.println(Name);
    }
    public void setUsername(String username)
    {
        this.Username=username;
    }
    public void setPassword(String password) {
        Password = password;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setId(int id) {
        Id = id;
    }
    public void getUsername()
    {
        System.out.println(Username);
    }
    public void getPassword()
    {
        System.out.println(Password);
    }
    public void getAge()
    {
        System.out.println(Age);
    }
    public void getId()
    {
        System.out.println(Id);
    }
    }

