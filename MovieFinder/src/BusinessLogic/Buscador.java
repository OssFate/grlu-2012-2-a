package BusinessLogic;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Buscador {
    String Pelicula, actor, director, artista, genero, resultado;
    
    public Buscador() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection(url, user, pass);
    }
    
    public void BusquedaNombre(String pelicula) throws SQLException{
        String query = "SELECT * FROM Pelicula WHERE nombre LIKE '%" + pelicula + "%';";
        ResultSet select = conexion.createStatement().executeQuery(query);
        String[] result = null;
        int i = 0;
        
        while(select.next()){
            resultado += select.getString("nombre") + "\n"
                      + select.getInt("año") + "\n"
                      + select.getString("genero") + "\n"
                      + select.getDouble("puntaje") + "\n"
                      + select.getTime("duracion") + "\n"
                      + select.getBoolean("alquilable") + "\n"
                      + select.getBoolean("comprable") + "\n";
            result[i] = resultado;
            i++;
        }
    }
    
    public void BusquedaActor(String actor){
        
    }
    
    // Configurar estos valores de acuerdo a la DataBase que se vaya a usar
    String url = "jdbc:mysql://localhost:3306/proyecto";
    String user = "root";
    String pass = "s257949";
    Connection conexion;
}
