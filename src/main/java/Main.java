import DAO.AdminDAO;
import entetys.Meniu;
import entetys.Users;

public class Main {
    public static void main(String[] args) {
Users vytenis= new Users();
Meniu paolo= new Meniu();
//UsersDAO.creatLogin(vytenis);
//UsersDAO.login(vytenis);
//UsersDAO.adminLogin(vytenis);
        AdminDAO.dishAdd(paolo);

    }
}