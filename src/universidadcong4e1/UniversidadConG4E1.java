
package universidadcong4e1;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;
import uni.AccesoADatos.AlumnoData;
import uni.AccesoADatos.Conexion;
import uni.AccesoADatos.InscripcionData;
import uni.AccesoADatos.MateriaData;
import uni.Entidades.Alumno;
import uni.Entidades.Inscripcion;
import uni.Entidades.Materia;


public class UniversidadConG4E1 {

  
    public static void main(String[] args) throws SQLException {
        //Connection con = Conexion.getConnection();
        
        
            //PRUBA METODOS ALUMNODATA
//        Alumno juan = new Alumno(564534, "Cirio", "Martin", LocalDate.of(1986, 7, 25), true);
//        AlumnoData alu = new AlumnoData();
//        alu.guardarAlumno(juan);        
        //alu.modificarAlumno(juan);
        //alu.eliminarAlumno(4);
//        Alumno alumnoEncontrado = alu.buscarAlumno(2);
//        if(alumnoEncontrado != null){
//        System.out.println("DNI: " + alumnoEncontrado.getDni());
//        System.out.println(" Apellido: " + alumnoEncontrado.getApellido());
//        System.out.println(" Nombre: " + alumnoEncontrado.getNombre());
//        System.out.println(" Fecha de Nacimiento: " + alumnoEncontrado.getFechaNac());
//        }*/
        /*
        AlumnoData alu = new AlumnoData();
        for(Alumno alumno:alu.listarAlumnos()){
            System.out.println(alumno.getDni());
            System.out.println(alumno.getApellido());
            System.out.println(alumno.getNombre());
            System.out.println(alumno.getFechaNac());
        }*/
        
        //PRUEBAS MATERIADATA
        //Materia analisis = new Materia("Analisis II", 1, true);
        //MateriaData mat = new MateriaData();
        //mat.guardarMateria(analisis);
        //*/
        /*
        Materia materiaEncontrada = mat.buscarMateria(4);
        if(materiaEncontrada != null){
            System.out.println("ID Materia: " + materiaEncontrada.getIdMateria());
            System.out.println("Nombre: " + materiaEncontrada.getNombre());
            System.out.println("Año: " + materiaEncontrada.getAnioMateria());
            System.out.println("Estado: " + materiaEncontrada.isActivo());
        }*/
        //mat.modificarMateria(analisis);
        //mat.eliminarMateria(4);
        /*
        MateriaData mate = new MateriaData();
        for(Materia materia : mate.listarMateria()){
            System.out.println("ID:" + materia.getIdMateria());
            System.out.println("Nombre:" + materia.getNombre());
            System.out.println("Año:" + materia.getAnioMateria());
            System.out.println("Estado" + materia.isActivo());
        }*/
        /*
        //PRUEBAS INSCRIPCION
        AlumnoData ad = new AlumnoData();
        MateriaData md = new MateriaData();
        InscripcionData ind = new InscripcionData();
        
        Alumno Stella = ad.buscarAlumno(1);
        Materia mate = md.buscarMateria(2);
        Inscripcion insc = new Inscripcion(Stella, mate, 8);
        //List<Inscripcion> inscr = ind.obtenerInscripciones();
        //List<Inscripcion> inscr = ind.obtenerInscripcionesPorAlumno(2);
        //List<Materia> inscri = ind.obtenerMateriasCursadas(1);
        //List<Materia> inscri = ind.obtenerMateriasNOCursadas(3);
        //ind.guardarInscripcion(insc);
        //ind.actualizarNota(2, 3, 9);
        //ind.borrarInscripcion(2, 1);
        /*
        //REVISAR BORRADO LOGICO 
        for(Inscripcion inscripcion:inscr){
            System.out.println("Id Inscripcion:" + inscripcion.getIdInscripcion());
            System.out.println("Apellido:" + inscripcion.getAlumno().getApellido());
            System.out.println("Materia:" + inscripcion.getMateria().getNombre());
        }*/
        /*for(Materia materia:inscri){
            System.out.println("ID Materia:" + materia.getIdMateria());
            System.out.println("Nombre:" + materia.getNombre());
            System.out.println("Año:" + materia.getAnioMateria());
        }*//*
        List<Alumno> al = ind.obtenerAlumnoXMateria(3);
        for(Alumno alumno:al){
            System.out.println("ID Alumno: " + alumno.getIdAlumno());
            System.out.println("DNI: " + alumno.getDni());           
            System.out.println("Apellido: " + alumno.getApellido());
             System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Fecha de Naciemiento: " + alumno.getFechaNac());
        }*/
    }
    
}
