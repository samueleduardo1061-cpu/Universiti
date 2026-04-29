package models;
import java.util.ArrayList;
import javax.swing.JTextArea;

public class Universidad {

    private ArrayList<Estudiante> estudiantes_matriculados = new ArrayList<>();
    private ArrayList<Departamento> departamentos = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes_matriculados.add(estudiante);
    }
    
    public void agregarDepartamento(Departamento departamento){
        departamentos.add(departamento);
        
        
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes_matriculados;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes_matriculados = estudiantes;
    }

}
