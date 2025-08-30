
package MainPackage;

import java.util.HashSet;
/**
 *
 * @author Grupo 11
 */
public class Alumno {
    private int legajo;
    private String apellido, nombre;
    private HashSet<Materia> materia;

    public Alumno() {
    }

    
    public Alumno(int legajo, String apellido, String nombre, HashSet<Materia> materia) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materia = materia;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
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
        return materia;
    }

    public void setMaterias(HashSet<Materia> materia) {
        this.materia = materia;
    }
    
 /**
 *  public void agregarMateria(){
    }
    public void cantidadMaterias(){
    }
 * 
 */
}
