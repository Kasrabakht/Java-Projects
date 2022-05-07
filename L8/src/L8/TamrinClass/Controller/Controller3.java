package L8.TamrinClass.Controller;

import L8.TamrinClass.Model.Model3;

public class Controller3 {
    Model3 model=new Model3();
    public void setModelUsername(String username)
    {
        model.setUsername(username);
    }
    public void setModelPassword(String password)
    {
        model.setPass(password);
    }
    public void setModelEmail(String Email)
    {
        model.setEmail(Email);
    }
    public void setModelName(String name)
    {
        model.setName(name);
    }
    public void check(){model.check();}
    public String getModelcheck_Username()
    {
        return model.getCheck_Username();
    }
    public String getModelcheck_Password()
    {
        return model.getCheck_Password();
    }
    public String getModelUsername()
    {
        return model.getUsername();
    }
    public String getModelPassword()
    {
        return model.getPass();
    }
    public boolean getModelSwtch()
    {
        return model.getSwtch();
    }
    public void Create()
    {
        model.Create();
    }
}
