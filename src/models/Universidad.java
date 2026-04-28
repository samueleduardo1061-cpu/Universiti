package models;
import java.util.ArrayList;
import javax.swing.JTextArea;

public class Universidad {

    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private ArrayList<Departamento> departamentos = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

}
