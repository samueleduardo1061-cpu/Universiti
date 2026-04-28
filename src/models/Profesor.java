package models;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Profesor extends Persona {

    private Departamento departamento;
    private ArrayList<Curso> mis_cursos = new ArrayList<>();

    public Profesor(String nombre, String apellido, String identificacion, Departamento departamento) {
        setNombre(nombre);
        setApellido(apellido);
        setIdentificacion(identificacion);
        setDepartamento(departamento);

    }
    
        public Profesor(String nombre, String apellido, String identificacion, Departamento departamento, Curso curso) {
        setNombre(nombre);
        setApellido(apellido);
        setIdentificacion(identificacion);
        setDepartamento(departamento);
        mis_cursos.add(curso);

    }

    public void agregarCurso(Curso curso) {
        mis_cursos.add(curso);
    }

    public ArrayList<Curso> getMis_cursos() {
        return mis_cursos;
    }

    public void setMis_cursos(ArrayList<Curso> mis_cursos) {
        this.mis_cursos = mis_cursos;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public void registrarCursoProfe(String nombrecurso)
    {
        //es fuerte porque la instancia estudios nacio o se crea 
      Curso curso = new Curso(nombrecurso);
      mis_cursos.add(curso);
        JOptionPane.showMessageDialog(null, "Curso Registrado");
    
    }
    

}
