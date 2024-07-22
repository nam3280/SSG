package Board.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Connect {
    private Connection connection = null;

    public boolean setConnection(Connection con) {
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream("C://Study//java//SSG//src//board//db.properties"));

            String url = prop.getProperty("url");
            String id = prop.getProperty("id");
            String password = prop.getProperty("password");

            con = DriverManager.getConnection(url,id,password);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        } catch (IOException e){
            return false;
        }
        this.connection = con;
        return true;
    }

    public Connection getConnection(){
        return this.connection;
    }
}

