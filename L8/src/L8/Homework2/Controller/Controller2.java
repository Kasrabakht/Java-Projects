package L8.Homework2.Controller;

import L8.Homework2.Model.Model2;

public class Controller2 {
    Model2 model2=new Model2();
    public void setModel2Username(String username)
    {
        model2.setUsername(username);
    }
    public void setModel2Password(String password)
    {
        model2.setPassword(password);
    }
    public void Database()
    {
        model2.Database();
    }
    public boolean Check()
    {
        return model2.Check();
    }
    public void setModelId(String Id)
    {
        model2.setId(Integer.parseInt(Id));
    }
    public void setModelName(String name)
    {
        model2.setName(name);
    }
    public void setModelFamily(String family)
    {
        model2.setFamily(family);
    }
    public void setModelAge(String age)
    {
        model2.setAge(Integer.parseInt(age));
    }
    public void setModelFather(String father)
    {
        model2.setFather(father);
    }
    public void setModelJob(String job)
    {
        model2.setJob(job);
    }
    public void setModelAddress(String address)
    {
        model2.setAddress(address);
    }
    public void setModelPhone(String phone)
    {
        model2.setPhone(phone);
    }
    public void setModel2Edit_Id(String edit_id)
    {
        model2.setEdit_Id(Integer.parseInt(edit_id));
    }
    public void Database2()
    {
        model2.Database2();
    }
}
