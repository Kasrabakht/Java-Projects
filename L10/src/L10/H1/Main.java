package L10.H1;

import L10.H1.UserEnti.UserEnti;
import L10.H1.UserRemote.UserRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String action;
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter Your Action");
        action=reader.nextLine();
        switch (action)
        {
            case "Create":
                try {
                    UserRemote remote=(UserRemote) Naming.lookup("//localhost/Homework1");
                    UserEnti userEnti=new UserEnti();
                    System.out.println("Enter id:");
                    userEnti.setId(Integer.parseInt(reader.nextLine()));
                    System.out.print("Enter Username:");
                    userEnti.setUsername(reader.nextLine());
                    System.out.print("Enter password");
                    userEnti.setPassword(reader.nextLine());
                    remote.Insert(userEnti);
                    List<UserEnti> userEntiList=remote.View();
                    for (UserEnti userEnti1:userEntiList)
                    {
                        System.out.println("Username:"+userEnti1.getUsername());
                        System.out.println("Password:"+userEnti1.getPassword());
                    }
                } catch (NotBoundException e) {
                    e.printStackTrace();
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (RemoteException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "Update":

                try {
                    UserRemote remote = (UserRemote) Naming.lookup("//localhost/Homework1");
                    UserEnti userEnti=new UserEnti();
                    System.out.println("Enter ia for edit:");
                    userEnti.setEid(Integer.parseInt(reader.nextLine()));
                    System.out.println("Enter id");
                    userEnti.setId(Integer.parseInt(reader.nextLine()));
                    System.out.print("Enter Username:");
                    userEnti.setUsername(reader.nextLine());
                    System.out.print("Enter password");
                    userEnti.setPassword(reader.nextLine());
                    remote.Update(userEnti);
                    List<UserEnti> userEntiList=remote.View();
                    for (UserEnti userEnti1:userEntiList)
                    {
                        System.out.println("Username:"+userEnti1.getUsername());
                        System.out.println("Password:"+userEnti1.getPassword());
                    }
                } catch (NotBoundException e) {
                    e.printStackTrace();
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (RemoteException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
               break;

        }
    }
}
