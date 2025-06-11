package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                String server = "localhost";
                String database = "MoneyChanger";
                String user = "sa";
                String password = "Jeje2406";
                String url = "jdbc:sqlserver://" + server + ":1433;databaseName=" + database + ";encrypt=false";
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi berhasil!");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Koneksi gagal: " + e.getMessage());
            }
        }
        return koneksi;
    }
}
