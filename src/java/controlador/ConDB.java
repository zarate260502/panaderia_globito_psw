package Controlador;
import java.sql.*;

public class ConDB{
    
    //tenemos que crear el meotod de conection
    
    public static Connection getConDB() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String user, pass, url;
            url = "jdbc:mysql://localhost:3306/globito";
            user = "root";
            pass = "n0m3l0";
            
            return DriverManager.getConnection(url, user, pass);
        
        }catch(SQLException e){
            
            System.out.println("Error en la conexión");
            System.out.println(e.getMessage());//obtener el mensaje de error
            System.out.println(e.getStackTrace()); //obtener el hilo del error
        
        }
        return null;
    }
    
}