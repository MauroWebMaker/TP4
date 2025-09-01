# Trabajo Práctico 4 📚
- Institución: Universidad de La Punta (ULP)
- Materia: Laboratorio de Programación I
- Año: 2025
- Integrantes (comisión 1, grupo 11):
  
  - Mauricio Reta
  - Juan Cruz Rodriguez
  - Agustín Mazza
  - Jeremías Hoyo
  - Facundo Lopez Cozzella
  - Jeremías Sirur Flores

## Consigna
<p>Un <b>Alumno</b> tiene un número de legajo, un apellido, un nombre y una lista HashSet de materias en las
que está inscripto; para ello tiene un método <i><b>agregarMateria</b></i> que permite inscribir al Alumno en
una materia determinada (implementar de manera tal que no deje inscribir un alumno en dos
materias iguales.) y otro método <b>cantidadMaterias</b> que devuelve la cantidad de materias a las que
está inscripto el alumno.</p>

<p>La <b>Materia</b> tendrá un
idMateria, un nombre de la
materia y el año al que
pertenece, tiene además un
constructor que inicializa sus
propiedades y métodos get y
set para c/u de sus atributos.</p>

<img width="731" height="412" alt="imgParaElREADME4" src="https://github.com/user-attachments/assets/918d352a-9b81-41e9-bee4-66ce09052c9b"/>

## Actividades
<p>En el método main de una clase de nombre Colegio:</p>
<ol>
  <li>Crear las materias:
    <ul>Web 2 de segundo año.</ul>
    <ul>Matemáticas de primer año.</ul>
    <ul>Laboratorio 1 de primer año.</ul>
  </li>
  <li>Crear 2 alumnos 
    <ul>López Martín con legajo 1001.</ul>
    <ul>Martínez Brenda con legajo 1002.</ul>
  </li>
  <li>Inscribir a López en las 3 materias.</li>
  <li>Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.</li>
  <li>Visualizar la cantidad de materias a las que está inscripto cada alumno.</li>
  <li><span style="color: red;">CREAR EN LA VISTA PRINCIPAL 2 <b>HashSet</b> que serán <i>STATIC</i></span>.
    <ul><span style="color: light-blue;">HashSet <Alumno> A COMPARTIR con vista Alumnos y Vista Inscripción.</span></ul>
    <ul><span style="color: light-blue;">HashSet <Materia> A COMPARTIR con vista Materias y Vista Inscripción.</span></ul>
    <ul><span style="color: light-blue;">Al invocar el constructor de los JinternalFrame, pase los SET como argumentos, para cargarlos o mostrarlos.</span></ul>
  </li>
  <li>Crear un JFrame, luego arrastre un JDesktopPane, que llamaremos ”escritorio”.</li>
  <li>Para vistas internas y sugeridas de las funcionalidades utilice JInternalFrame (y que sean accedidas desde un menú principal): Alta de Materias, Alta de         Alumnos y Formulario de Inscripción.</li>
  <li>Arrastre una JMenuBar, y Utilice 4 JMenu, y JMenuItems para hacer un new de VistaAlumnos, VistaMaterias, V. Incripcion, y Salir.</li>
</ol>

<img width="556" height="96" alt="imgParaElREADME5" src="https://github.com/user-attachments/assets/73eb7b25-1165-4a72-b9e8-1b148a797227"/>
<img width="481" height="573" alt="imgParaElREADME6" src="https://github.com/user-attachments/assets/38fbe293-ad94-4087-b6aa-de8ae20c26db"/>


