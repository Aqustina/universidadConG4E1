
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
import uni.Entidades.Alumno;
import uni.Entidades.Inscripcion;
import uni.Entidades.Materia;

public class InscripcionData {
    private Connection con = null;
    private MateriaData md = new MateriaData();
    private AlumnoData ad = new AlumnoData();

    public InscripcionData() {
        this.con= Conexion.getConnection();
    }

    public void guardarInscripcion(Inscripcion insc){
        String sql = "INSERT INTO inscripcion (idAlumno, idMateria, nota)"
                + "VALUES (?,?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "INSCRIPCION REGISTRADA");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INSCRIPCION");
        }
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas = ps.executeUpdate();
            if(filas > 0){
                JOptionPane.showMessageDialog(null, "NOTA ACTUALIZADA");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INSCRIPCION");
        }
        
    }
    
    public void borrarInscripcion(int idAlumno, int idMateria){
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ?  AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int filas = ps.executeUpdate();
            if(filas > 0){
                JOptionPane.showMessageDialog(null, "INSCRIPCION ELIMINADA");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INSCRIPCION");
        }        
    }
    
    //REVISAR BORRADO LOGICO chack :)
    public List<Inscripcion> obtenerInscripciones(){
        List<Inscripcion> cursadas = new ArrayList<>();
        
        String sql = "SELECT * FROM inscripcion JOIN alumno ON inscripcion.idAlumno = alumno.idAlumno"
                + " WHERE alumno.estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                insc.setNota(rs.getDouble("nota"));
                Alumno alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = md.buscarMateria(rs.getInt("idMateria"));
                
                insc.setAlumno(alu);
                insc.setMateria(mat);
                
                cursadas.add(insc);
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INSCRIPCION");
        }
        return cursadas;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno){
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = md.buscarMateria(rs.getInt("idMateria"));
                
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                cursadas.add(insc);
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INSCRIPCION");
        }
        return cursadas;
    }
    
    public List<Materia> obtenerMateriasCursadas(int idAlumno){
        ArrayList<Materia> materias = new ArrayList<>();
        String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion, "
                + "materia WHERE inscripcion.idMateria = materia.idMateria AND "
                + "inscripcion.idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               Materia materia = new Materia();
               materia.setIdMateria(rs.getInt("idMateria"));
               materia.setNombre(rs.getString("nombre"));
               materia.setAnioMateria(rs.getInt("anio"));
               materias.add(materia);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INSCRIPCION");
        }
        return materias;
    }
    
    public List<Materia> obtenerMateriasNOCursadas(int idAlumno){
        ArrayList<Materia> materias = new ArrayList<>();
        
        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria NOT IN "
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               Materia materia = new Materia();
               materia.setIdMateria(rs.getInt("idMateria"));
               materia.setNombre(rs.getString("nombre"));
               materia.setAnioMateria(rs.getInt("anio"));
               materias.add(materia);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INSCRIPCION");
        }
        return materias;
    }
    
    public List<Alumno> obtenerAlumnoXMateria(int idMateria){
        ArrayList<Alumno> alumnosMateria = new ArrayList<>();
        String sql = "SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado "
                + "FROM inscripcion i, alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND estado = 1 ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));                
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                alumnosMateria.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INSCRIPCION");
        }
        return alumnosMateria;
    }
}
