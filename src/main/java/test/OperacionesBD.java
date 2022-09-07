
package test;

import beans.Peliculas;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;


public class OperacionesBD {
    
    public static void main(String[] args) {
       // listaPeliculas();
       actualizarPelicula(1,"Terror");
    }
    
    public static void actualizarPelicula( int id, String genero){
    
        DBConnection con = new DBConnection();
        String sql = "UPDATE peliculas SET genero = '"+genero+"' WHERE id =" + id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.desconectar();
        }
    }   
    public static void listaPeliculas(){
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM peliculas";
         try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
             while (rs.next()) {
                 int id = rs.getInt("id");
                 String titulo = rs.getString("titulo");
                 String genero = rs.getString("genero");
                 String autor = rs.getString("autor");
                 int copias = rs.getInt("copias");
                 boolean novedad = rs.getBoolean("novedad");
                 
                 Peliculas peliculas = new Peliculas(id, copias, titulo, genero, autor, novedad);
                 System.out.println(peliculas.toString());
             }
             st.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
         con.desconectar();
         }
    }

    private static void actualziarPelicula() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
