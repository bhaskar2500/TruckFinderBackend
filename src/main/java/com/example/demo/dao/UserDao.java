package com.example.demo.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

public class UserDao {
    // private static Optional<Connection> connection = Optional.empty();

    // public static Optional<Connection> getConnection() {
    //     if (connection.isEmpty()) {
    //         String url = "jdbc:postgresql://localhost:5432/postgres";
    //         // url="         jdbc:postgresql://localhost:5432/mmas"

    //         String user = "postgres";
    //         String password = "root";

    //         try {
    //             Class.forName("org.postgresql.Driver");
    //             connection = Optional.ofNullable(
    //             DriverManager.getConnection(url, user, password));
    //             if(connection.isPresent())
    //                 System.out.println("Established");
    //         } catch (SQLException ex) {
    //             System.out.println(ex);
    //         }
    //         catch(Exception ex2){
    //             System.out.println(ex2+"---->");
    //         }
    //     }

    //     return connection;
    // }   
}
