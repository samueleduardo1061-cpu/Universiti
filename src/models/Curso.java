package models;

import java.util.ArrayList;

public class Curso {

    private String nombrecurso;
    private Profesor profesor;
    private String descripcion;

    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public Curso(String nombrecurso, String descripcion) {
        this.nombrecurso = nombrecurso;
        this.descripcion = descripcion;
    }

    public Curso(String nombrecurso, String descripcion, Profesor profesor) {
        this.nombrecurso = nombrecurso;
        this.descripcion = descripcion;

        this.profesor = profesor;
    }

    public String getInformacion() {
        String info = "\n Nombre del curso: " + getNombrecurso()
                + "\n Descripción del curso: " + getDescripcion()
                + "\n Profesor del curso: " + profesor.getNombre() + " " + profesor.getApellido() + "\nDepartamento profesor:  " + profesor.getDepartamento().toString()
                + "\n Estudiantes inscritos: ";

        for (Estudiante e : estudiantes) {
            info += "\n   - " + e.getNombre() + " " + e.getApellido();
        }

        return info;
    }

    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return nombrecurso;
    }

}
