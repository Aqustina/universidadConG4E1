
package uni.AccesoADatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "g4e1";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection; 
    
    private Conexion(){}
    
    public static Connection getConnection(){
        if(connection == null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB, USUARIO,PASSWORD);
                JOptionPane.showMessageDialog(null, "CONECTADO");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LOS DRIVERS");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR DE CONEXION");
            }
        }
        return connection;
    }
}
