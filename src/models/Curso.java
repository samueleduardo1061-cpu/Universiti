package models;

import javax.swing.JTextArea;

public class Curso {

    private String nombrecurso;
    private Profesor profesor;
    private String descripcion;
    private String semestre;
    private String numeroestudiantes;
    private String teacher;

    public Curso(String nombrecurso, String descripcion, String semestre) {
        this.nombrecurso = nombrecurso;
        this.descripcion = descripcion;
        this.semestre = semestre;
    }

    public Curso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }
    

    public Curso(String nombrecurso, String descripcion, String semestre, Profesor profesor) {
        this.nombrecurso = nombrecurso;
        this.descripcion = descripcion;
        this.semestre = semestre;
        this.profesor = profesor;
    }

    public Curso(String nombrecurso, String profesor, String semestre, String descripcion) {
        this.nombrecurso = nombrecurso;
        this.descripcion = descripcion;
        this.semestre = semestre;
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

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
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
