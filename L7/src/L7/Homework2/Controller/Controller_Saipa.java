package L7.Homework2.Controller;
import L7.Homework2.Model.Model_Saipa;

public class Controller_Saipa {
    Model_Saipa model=new Model_Saipa();
    public void setModelNational_Id(String National)
    {
        model.setNational_Id(National);
    }
    public void setModelFullname(String fullname)
    {
        model.setName(fullname);
    }
    public void setModelFatherName(String Father)
    {
        model.setFather(Father);
    }
    public void setModelPhone(String phone)
    {
        model.setPhone(phone);
    }
    public void setModelAddress(String address)
    {
        model.setAddress(address);
    }
    public void setModelCar(String car)
    {
        model.setCar(car);
    }
    public void SetData()
    {
        model.getData();
    }
    public void SetCar()
    {
        model.Car();
    }
    public String Car_Type()
    {
        return model.getName_Car();
    }
    public String Car_Color()
    {
        return model.getColor();
    }
    public int Car_Price()
    {
        return model.getPrice();
    }
}
