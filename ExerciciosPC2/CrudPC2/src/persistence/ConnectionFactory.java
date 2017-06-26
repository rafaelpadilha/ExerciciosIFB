/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alunotgn
 */
public class ConnectionFactory {

    public static Connection getConnection() {
        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "1234";
        String url = "jdbc:postgresql://localhost:5432/rh";

        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, senha);
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return con;
    }

    public static void close(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
