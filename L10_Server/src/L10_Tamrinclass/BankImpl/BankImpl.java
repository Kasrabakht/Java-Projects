package L10_Tamrinclass.BankImpl;

import L10_Tamrinclass.BankEnti.BankEnti;
import L10_Tamrinclass.BankRemote.BankRemote;
import L10_Tamrinclass.BankRepo.BankRepo;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class BankImpl extends UnicastRemoteObject implements BankRemote {
    public BankImpl()throws Exception{};
    @Override
    public List<BankEnti> Show() throws Exception {
        BankRepo bankRepo=new BankRepo();
        List<BankEnti> bankEntiList=bankRepo.Show();
        bankRepo.Close();
        return bankEntiList;
    }
}
