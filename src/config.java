import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class config {
      private static Connection conn;
      public static Connection getKoneksi( ){
               String host       = "jdbc:mysql://localhost/db_fotografi",
                          user       = "root",
                          pass       = "";
               try{
                      conn = (Connection) DriverManager.getConnection(host, user, pass);
               }catch (SQLException err){
                       JOptionPane.showMessageDialog(null, err.getMessage( ) );
               }
               return conn;
      }
}