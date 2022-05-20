package L10_1;

import L10_1.MenuEnti.MenuEnti;
import L10_1.MenuRemote.MenuRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        try {
            MenuRemote menuRemote=(MenuRemote) Naming.lookup("//localhost/H2");
            MenuEnti menuEnti=new MenuEnti();
            List<MenuEnti> menuEntiList=menuRemote.View();
            for (MenuEnti menuEnti1:menuEntiList)
            {
                System.out.println("Food:"+menuEnti1.getFood1()+ "        price:"+menuEnti1.getPrice());
            }
            System.out.println("Which one would you like?");
            menuEnti.setChose(reader.nextLine());
            List<MenuEnti> menu=menuRemote.choose();
            for (MenuEnti menuEnti1:menu)
            {
                System.out.println("Food:" +menuEnti1.getFood1()+"          Price:"+menuEnti1.getPrice());

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

    }
}
