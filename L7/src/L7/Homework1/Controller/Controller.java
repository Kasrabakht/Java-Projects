package L7.Homework1.Conteroller;


import L7.Homework1.Model.Model;

import java.sql.SQLException;

public class Controller {
    Model model=new Model();
    public void setModelUsername(String username)
    {
        model.setUsername(username);
    }
    public void setModelpassword(String password)
    {
        model.setPassword(password);
    }
    public void Check()
    {
        model.Check();
    }
    public void Update()
    {

        if (model.getkey() == true)
        {
            System.out.println("Welcome");
        }
        else
        {
            System.out.print("Username or Password is not correct");
        }
    }
    public void setModelGig_number(String gig_number)
    {
        model.setGig_number(gig_number);
    }
    public String Gig_return()
{
   return model.getVolume_Gig();
}
public int Price_return()
{
  return   model.getPrice_Gig();
}
public void Choose()
{
    model.Choose();
}


}
