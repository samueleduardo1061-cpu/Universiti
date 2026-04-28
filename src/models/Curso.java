package models;

import javax.swing.JTextArea;

public class Curso {

    private String nombrecurso;
    private Profesor profesor;
    private String descripcion;

    private String numeroestudiantes;
    private String teacher;

    public Curso(String nombrecurso, String descripcion) {
        this.nombrecurso = nombrecurso;
        this.descripcion = descripcion;
    }

    public Curso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }
    

    public Curso(String nombrecurso, String descripcion, Profesor profesor) {
        this.nombrecurso = nombrecurso;
        this.descripcion = descripcion;

        this.profesor = profesor;
    }

    public Curso(String nombrecurso, String profesor, String descripcion) {
        this.nombrecurso = nombrecurso;
        this.descripcion = descripcion;
        this.teacher = profesor;
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

    public String getNumeroestudiantes() {
        return numeroestudiantes;
    }

    public void setNumeroestudiantes(String numeroestudiantes) {
        this.numeroestudiantes = numeroestudiantes;
    }

    @Override
    public String toString() {
        return nombrecurso;
    }

}
