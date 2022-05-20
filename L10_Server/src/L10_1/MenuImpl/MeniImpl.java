package L10_1.MenuImpl;

import L10_1.MenuEnti.MenuEnti;
import L10_1.MenuRemote.MenuRemote;
import L10_1.MenuRepo.MenuRepo;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class MeniImpl extends UnicastRemoteObject implements MenuRemote {
    public MeniImpl() throws Exception {
    }

    @Override
    public List<MenuEnti>choose()throws Exception {
        MenuRepo menuRepo=new MenuRepo();
        List<MenuEnti> menuEntiList=menuRepo.Choose();
        return menuEntiList;


    }

    @Override
    public List<MenuEnti> View() throws Exception {
        MenuRepo menuRepo=new MenuRepo();
        List<MenuEnti> menuEntiList=menuRepo.View();
        menuRepo.Close();
        return menuEntiList;
    }
}
