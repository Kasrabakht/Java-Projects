package Java.L5.Homework3;


public class CarFactory  {
public static Car getcar(String type)
{
    Car car=null;
    if (type.equals("BMVX6"))
    {
        car=new BMWX6();
    }
    else if (type.equals("BMVX4"))
    {
        car=new BMWX4();
    }
    else if (type.equals("Benz"))
    {
        car=new Benz();
    }
    return car;
}

}
