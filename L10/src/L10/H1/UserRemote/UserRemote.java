package L10.H1.UserRemote;

import L10.H1.UserEnti.UserEnti;

import java.rmi.Remote;
import java.util.List;

public interface UserRemote extends Remote {
    void Insert(UserEnti userEnti) throws Exception;
    void Update(UserEnti userEnti) throws Exception;
    List<UserEnti> View() throws Exception;
}
