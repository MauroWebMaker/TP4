package MainPackage;

import java.util.HashSet;

/**
 * @author Grupo 11
 */
public class Alumno {

    private Integer legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    public Alumno(Integer legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getMateria() {
        return materias;
    }

    public void setMaterias(HashSet<Materia> materia) {
        this.materias = materia;
    }

    /*@Override
    public String toString() {
        return "Alumno{" + "numeroLegajo=" + legajo + ", apellido=" + apellido + ", nombre=" + nombre + ", materias=" + materias + '}';
    }*/
    public void agregarMateria(Materia m) {
        materias.add(m);
    }

    public int cantidadMaterias() {
        return materias.size();
    }

}
