package DAO;

import entetys.Busnis;
import entetys.Dmc;
import entetys.Meniu;
import entetys.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminDAO {
    public static final String DATABASE_NAME = "maisto_ystaiga";
    static Scanner sc = new Scanner(System.in);
    public static void dishAdd(Meniu meniuAdd) {
        try {
            String url = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
            Connection connection = DriverManager.getConnection(url, "root", "");
            System.out.println("patiekalo įvedimas ");
            System.out.println("Patiekalo pavadinimas:");
            String dishName = sc.next();
            System.out.println("Patiekalo aprašimas:");
            String discription = sc.next();

            //Order_id	User_id	Food_id	Confirmation
            String query = "INSERT INTO meniu(Food_id,Food_name, Discription) VALUES (0,'" + dishName + "','" + discription + "');";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
            connection.close();
            System.out.println("sėkmingai patalpintas meniu");
        } catch (SQLException e) {
            System.out.println("Nepavyko patalpinti:");
            e.printStackTrace();
        }
    }
    public static void dmcAdd(Dmc dmcadd) {
        try {
            String url = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
            Connection connection = DriverManager.getConnection(url, "root", "");
            System.out.println("valgerasčio įvedimas ");
            System.out.println("yveskite valgeraščio pavadinima:");
            String meniuName = sc.next();
            System.out.println("Įveskite patiekalo ID:");
            int foodId = sc.nextInt();
            System.out.println("Įveskite verslo ID:");
            int busnisId = sc.nextInt();
            String query = "INSERT INTO dmc (Dmc_id,Dm_name, Food_id,busnes_id) VALUES (0,'" + meniuName + "','" + foodId + "','" + busnisId + "');";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
            connection.close();
            System.out.println("sėkmingai patalpintas valgeraštis");
        } catch (SQLException e) {
            System.out.println("Nepavyko patalpinti:");
            e.printStackTrace();
        }
    }
    public static void dmcUpdate(Dmc dmcup) {
        try {
            String url = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
            Connection connection = DriverManager.getConnection(url, "root", "");
            System.out.println("valgerasčio įvedimas ");
            System.out.println("yveskite valgeraščio pavadinima:");
            String meniuName = sc.next();
            System.out.println("Įveskite patiekalo ID:");
            int foodId = sc.nextInt();
            System.out.println("Įveskite verslo ID:");
            int busnisId = sc.nextInt();
            String query = "UPDATE dmc SET Dm_name = ? , adress = ? , city=? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
            connection.close();
            System.out.println("sėkmingai patalpintas valgeraštis");
        } catch (SQLException e) {
            System.out.println("Nepavyko patalpinti:");
            e.printStackTrace();
        }
    }
    public static void addBusnis(Busnis busnisAdd) {
        try {
            String url = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
            Connection connection = DriverManager.getConnection(url, "root", "");
            System.out.println("restorano įvedimas ");
            System.out.println("yveskite verslo pavadinima:");
            String busnisName = sc.next();
            System.out.println("Įveskite adresa");
            String address = sc.next();
            String query = "INSERT INTO busnis(Busnis_id,Busnis_name, Address) VALUES (0,'" + busnisName + "','" + address + "');";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
            connection.close();
            System.out.println("sėkmingai patalpintas valgeraštis");
        } catch (SQLException e) {
            System.out.println("Nepavyko patalpinti:");
            e.printStackTrace();
        }
    }
}
