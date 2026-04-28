package models;
import java.util.ArrayList;
import javax.swing.JTextArea;

public class Estudiante extends Persona{
    
    private String carrera;
    ArrayList <Curso> mis_cursos = new ArrayList<>();
    
    
    public Estudiante (String nombre, String apellido, String identificacion, String carrera){
        setNombre(nombre);
        setApellido(apellido);
        setIdentificacion(identificacion);
        this.carrera = carrera;
    }
    
    public void agregarCurso(Curso curso){
        mis_cursos.add(curso);
    }
    
   //nyaaaaaaaaaaaaaaaaaaaaaaaaaaaa
   //aaaaaaaaaaaaaaaaaaa
    
    ///uwuwuw
    


    public ArrayList<Curso> getMis_cursos() {
        return mis_cursos;
    }

    public void setMis_cursos(ArrayList<Curso> mis_cursos) {
        this.mis_cursos = mis_cursos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
        public void verCursosRegistrados(JTextArea area)
    {
        for (int posicion = 0; posicion < mis_cursos.size(); posicion++) {
            area.append("\n Cursos registrados: " + mis_cursos.get(posicion).getNombrecurso());
           
            
        }
    }
    
    
    
}
