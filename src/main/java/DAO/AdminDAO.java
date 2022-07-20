package DAO;

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
    public static void dmcAdd(Meniu meniuAdd) {
        try {
            String url = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
            Connection connection = DriverManager.getConnection(url, "root", "");
            System.out.println("restorano įvedimas ");
            System.out.println("restorano id:");
            int dishName = sc.nextInt();
            System.out.println("Patiekalo aprašimas:");
            int discription = sc.nextInt();

            //Order_id	User_id	Food_id	Confirmation
            String query = "INSERT INTO meniu(Dmc_id,Dm_name, Food_id,busnes_id) VALUES (0,'" + dishName + "','" + discription + "');";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
            connection.close();
            System.out.println("sėkmingai patalpintas meniu");
        } catch (SQLException e) {
            System.out.println("Nepavyko patalpinti:");
            e.printStackTrace();
        }
    }
}
