package L10_Tamrinclass.BankRemote;

import L10_Tamrinclass.BankEnti.BankEnti;

import java.rmi.Remote;
import java.util.List;

public interface BankRemote extends Remote {
    List<BankEnti> Show() throws Exception;
}
