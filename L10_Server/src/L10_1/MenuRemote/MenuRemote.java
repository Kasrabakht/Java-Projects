package L10_1.MenuRemote;

import L10_1.MenuEnti.MenuEnti;

import java.rmi.Remote;
import java.util.List;

public interface MenuRemote extends Remote {
    List<MenuEnti> choose() throws Exception;
    List<MenuEnti> View() throws Exception;
}
