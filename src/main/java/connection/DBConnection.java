
package connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    Connection connection;
    static String bd = "movies_rental";
    static String port = "3307";
    static String login = "root";
    static String password = "123456";
    
    public DBConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:"+this.port+"/"+this.bd;
            connection = DriverManager.getConnection(url, this.login, this.password);
            System.out.println("Conexión");
        } catch (Exception ex) {
             System.out.println("Error de Conexión");
        }
    }

    public Connection getConnection() {
        return connection;
    }
    
    public void desconectar (){
        connection = null;
    }
}
