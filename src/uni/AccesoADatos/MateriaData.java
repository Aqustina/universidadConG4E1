
package uni.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import uni.Entidades.Materia;

public class MateriaData {
    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConnection();
    }
    
    public void guardarMateria(Materia materia){
        String sql = "INSERT INTO materia (nombre, anio, estado) "
                + "VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"MATERIA AGREGADA");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL INGRESAR A LA TABLA MATERIA");
        }
    }
    
    public Materia buscarMateria(int id){
        String sql = "SELECT nombre, anio, estado FROM materia WHERE idMateria = ? AND estado = 1";
        PreparedStatement ps;
        Materia materia = null; 
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setActivo(true);
            }else{
                JOptionPane.showMessageDialog(null, "MATERIA INEXISTENTE");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA MATERIA");
        }
        return materia;
    }
    
    public void modificarMateria(Materia materia){
        String sql = "UPDATE materia SET nombre = ?, anio = ?, estado = ? WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, materia.getIdMateria());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "MATERIA MODIFICADA EXITOSAMENTE");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA TABLA MATERIA");
        }
    }
    
    public void eliminarMateria(int id){
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "MATERIA ELIMINADA");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA TABLA MATERIA");
        }
    }
    
    public List<Materia> listarMateria(){
        String sql = "SELECT idMateria, nombre, anio, estado FROM materia WHERE estado = 1";
        ArrayList<Materia> materias= new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setActivo(true);
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA TABLA MATERIA");
        }
        return materias;
    }
}
