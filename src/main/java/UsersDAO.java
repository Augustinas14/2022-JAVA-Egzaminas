import entetys.Users;

import java.sql.*;
import java.util.Scanner;

public class UsersDAO {
    public static final String DATABASE_NAME = "maisto_ystaiga";
    static Scanner sc = new Scanner(System.in);
    public static void creatLogin(Users usersCreation) {
        try {
            String url = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
            Connection connection = DriverManager.getConnection(url, "root", "");
            System.out.println("Registracija");
            System.out.println("Įveskite vartotojo vardą:");
            String usersName = sc.next();
            System.out.println("Įveskite Epaštą:");
            String ePastas = sc.next();
            System.out.println("Įveskite slaptazodį:");
            String pasword = sc.next();
            String query = "INSERT INTO users (User_id,User_name, Email,Password,rol) VALUES (0,'" + usersName + "','" + ePastas + "','" + pasword + "',0);";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
            connection.close();
            System.out.println("sėkmingai atlikta registracija");
        } catch (SQLException e) {
            System.out.println("Nepavyko prisijungti prie Duomenu bazes. Daugiau info:");
            e.printStackTrace();
        }
    }

    public static void login(Users userLogin) {
        try {

            String url = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
            Connection connection = DriverManager.getConnection(url, "root", "");
            System.out.println("Įveskite prisijungimo duomenis");
            System.out.println("vartotojo vardas:");
            String userAcesName= sc.nextLine();
            System.out.println("Slaptažodis:");
            String userAcesPassword= sc.nextLine();
            String query = "SELECT * FROM `users` WHERE User_name='"+userAcesName+"' AND Password='"+userAcesPassword+"';";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs=preparedStatement.executeQuery(query);
            if(rs.next()){
                System.out.println("jums pavyko prisijungti");
            }else {
                System.out.println("jums nepavyko");
            }
            connection.close();


        } catch (SQLException e) {
            e.printStackTrace();


        }
    }
    public static void adminLogin(Users userLogin) {
        try {

            String url = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
            Connection connection = DriverManager.getConnection(url, "root", "");
            System.out.println("Įveskite prisijungimo duomenis");
            System.out.println("vardas:");
            String userAcesName= sc.nextLine();
            System.out.println("Slaptažodis:");
            String userAcesPassword= sc.nextLine();
            String query = "SELECT * FROM `users` WHERE User_name='"+userAcesName+"' AND Password='"+userAcesPassword+"'and rol=true;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs=preparedStatement.executeQuery(query);
            if(rs.next()){
                System.out.println("jums pavyko prisijungti");
            }else {
                System.out.println("jums nepavyko");
            }
            connection.close();


        } catch (SQLException e) {
            e.printStackTrace();


        }
    }
}

