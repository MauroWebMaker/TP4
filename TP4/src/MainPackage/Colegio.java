package MainPackage;

import java.util.HashSet;

/*
 * 1. Crear las materias:  
    a. Web 2 de segundo año. Listo 
    b. Matemáticas de primer año.  Listo
    c. Laboratorio 1 de primer año  Listo
    2. Crear 2 alumnos.  Listo
    a. López Martin con legajo 1001.  Listo
    b. Martínez Brenda con legajo 1002.  Listo
    3. Inscribir a López en las 3 materias. Listo
    4. Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.  Listo
    5. Visualizar la cantidad de materias a las que está inscripto cada alumno. Listo
 *
 * @author Grupo 11
 */
public class Colegio {

    public static HashSet<Alumno> lsitaAlumnos = new HashSet<>();
    public static HashSet<Materia> lsitaMaterias = new HashSet<>();

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
