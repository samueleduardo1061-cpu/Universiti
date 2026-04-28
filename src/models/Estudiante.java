package models;
import java.util.ArrayList;
import javax.swing.JTextArea;

public class Estudiante extends Persona{
    
    ArrayList <Curso> mis_cursos = new ArrayList<>();
    
    
    public Estudiante (String nombre, String apellido, String identificacion){
        setNombre(nombre);
        setApellido(apellido);
        setIdentificacion(identificacion);

    }
    
    public void agregarCurso(Curso curso){
        mis_cursos.add(curso);
    }



    public ArrayList<Curso> getMis_cursos() {
        return mis_cursos;
    }

    public void setMis_cursos(ArrayList<Curso> mis_cursos) {
        this.mis_cursos = mis_cursos;
    }


        public void verCursosRegistrados(JTextArea area)
    {
        for (int posicion = 0; posicion < mis_cursos.size(); posicion++) {
            area.append("\n Cursos registrados: " + mis_cursos.get(posicion).getNombrecurso());
           
            
        }
    }
        
        public String getInformacion(){
            return "\n Nombre: " + getNombre() +
                    "\n Apellido: " + getApellido()+
                    "\n Identificación: " + getIdentificacion();
        }
    
    
    
}
