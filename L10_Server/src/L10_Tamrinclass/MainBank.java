package L10_Tamrinclass;
import L10_Tamrinclass.BankImpl.BankImpl;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class MainBank {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(2222);
            BankImpl bank =new BankImpl();
            Naming.rebind("bank",bank);
            System.out.println("server is waiting......");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
