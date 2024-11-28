package org.example;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    public static Connection java_db() {
        Connection conn = null;
        try {
            // SQLite JDBC sürücüsünü yükle
            Class.forName("org.sqlite.JDBC");

            // SQLite veritabanı URL'sini doğru formatta belirt
            String url = "jdbc:sqlite:C:/Users/Ahmet/OneDrive/Masaüstü/Yedek/Java-Swing-Restaurant-Management-Sytem/rysdb.sqlite";
            conn = DriverManager.getConnection(url); // Veritabanına bağlan

            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e); // Hata mesajı göster
            System.out.println("Bağlanamadı");
            return null;
        }
    }
}


