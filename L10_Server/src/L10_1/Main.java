package L10_1;

import L10_1.MenuImpl.MeniImpl;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Main {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            MeniImpl menu=new MeniImpl();
            Naming.rebind("H2",menu);
            System.out.println("server is waiting......");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
