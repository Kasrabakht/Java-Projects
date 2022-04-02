package Java.L4.Homework2;

public class User <Name,Age,Username,Password>   implements Cloneable{
    public Name name ;
    public Age age;
    public Username username;
    public Password password;

    @Override
    public User<Name, Age, Username, Password> clone() {
        try {
            User clone = (User) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
