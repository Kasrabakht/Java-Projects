package L10.H1;

import L10.H1.Impl.UserImpl;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Main {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1100);
            UserImpl user=new UserImpl();
            Naming.rebind("Homework1",user);
            System.out.println("server is waiting......");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
