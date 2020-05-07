/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anon
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class config {
    private static Connection sqlConfig;
    public static Connection configDB()throws SQLException{
        try {
            String url = "jdbc:postgresql://18.139.225.232:5432/perpustakaan";
            Properties props = new Properties();
            props.setProperty("user","rawon");
            props.setProperty("password","1234567890");
            props.setProperty("ssl","false");
            java.sql.Connection conn = DriverManager.getConnection(url, props);
            sqlConfig = conn;    
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return sqlConfig;
    }
}
