package models;

import java.util.ArrayList;

public class Departamento {

    private String nombre;
    private ArrayList <Profesor> profesores = new ArrayList<>();

    public Departamento(String nombre) {
        this.nombre = nombre;
    }
    
    public Departamento(){
        
    }
    
    
    public void agregarProfesor(Profesor profesor){
        profesores.add(profesor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
    
    
    
}
