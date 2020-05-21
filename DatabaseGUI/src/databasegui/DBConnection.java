package databasegui;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    
    public static Connection Connect() throws ClassNotFoundException
    {
        Connection con = null;
        
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=GUIEmployee;user=sa;password=123";
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection(connectionURL);
            
            if(con!=null)
            {
                System.out.println("Connected");
            }
            else
            {
                System.out.println("Error while Connecting");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}

