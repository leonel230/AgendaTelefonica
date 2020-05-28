package database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class mysql{
    private static String database ="agenda";
    private static String user="root";
    private static String pass="";
    private static String url="jdbc.mysql://localhost/"+database;
    private static Connection Conn;
    
    public static Connection getConnect() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Conn = DriverManager.getConnection(url, user, pass);
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error:  "+e.getMessage());
    }return Conn;
    }
}