package L10.H1.Impl;

import L10.H1.UserEnti.UserEnti;
import L10.H1.UserRemote.UserRemote;
import L10.H1.UserRepo.UserRepo;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class UserImpl extends UnicastRemoteObject implements UserRemote {
    public UserImpl() throws Exception{};
    @Override
    public void Insert(UserEnti userEnti) throws Exception {
        UserRepo userRepo=new UserRepo();
        userRepo.Insert(userEnti);
        userRepo.Close();

    }

    @Override
    public void Update(UserEnti userEnti) throws Exception {
        UserRepo userRepo=new UserRepo();
        userRepo.Update(userEnti);
        userRepo.Close();

    }

    @Override
    public List<UserEnti> View() throws Exception {
        UserRepo userRepo=new UserRepo();
        List<UserEnti> userEntiList=userRepo.View();
        userRepo.Close();
        return userEntiList;
    }
}
