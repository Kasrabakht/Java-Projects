package L10_Tamrinclass;



import L10_Tamrinclass.BankEnti.BankEnti;
import L10_Tamrinclass.BankRemote.BankRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            BankRemote bankRemot = (BankRemote) Naming.lookup("//localhost/bank");
            BankEnti bankEnti = new BankEnti();
            List<BankEnti> bankEntiList = bankRemot.Show();
            for (BankEnti bankEnti1 : bankEntiList) {
                System.out.println("CardId:" + bankEnti.getIdCard() + "Name:" + bankEnti.getName() + "Money:" + bankEnti.getMoney());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
