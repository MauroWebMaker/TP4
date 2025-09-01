package MainPackage;

import java.util.HashSet;

/*
 * @author Grupo 11
 */
public class Colegio {

    public static HashSet<Alumno> listaAlumnos = new HashSet<>();
    public static HashSet<Materia> listaMaterias = new HashSet<>();

    public static void main(String[] args) {

        Materia web2 = new Materia(101, 2, "Web2");
        Materia matematicas = new Materia(102, 1, "Matematicas");
        Materia lab1 = new Materia(103, 1, "Laboratorio1");

        Alumno alumno1 = new Alumno(1001, "Lopez", "Mattin");
        Alumno alumno2 = new Alumno(1002, "Martinez", "Brenda");

        alumno1.agregarMateria(lab1);
        alumno1.agregarMateria(matematicas);
        alumno1.agregarMateria(web2);

        alumno2.agregarMateria(lab1);
        alumno2.agregarMateria(matematicas);
        alumno2.agregarMateria(web2);

        alumno2.agregarMateria(lab1);

        System.out.println("Alumno/a " + alumno1.getApellido() + ", " + alumno1.getNombre()
                + " esta inscripto en " + alumno1.cantidadMaterias() + " materias.");

        System.out.println("Alumno/a " + alumno2.getApellido() + ", " + alumno2.getNombre()
                + " esta inscripto en " + alumno2.cantidadMaterias() + " materias.");

    }
}
