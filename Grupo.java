package practica7;

public class Grupo {
    private int claveGrupo;
    private Materia materia;
    private Profesor profesor;
    private Alumno[] alumnos;

    public Grupo(int claveGrupo, Materia materia, Profesor profesor, int cantidadAlumnos) {
        this.claveGrupo = claveGrupo;
        this.materia = materia;
        this.profesor = profesor;
        this.alumnos = new Alumno[cantidadAlumnos];
    }

    public void setAlumno(int index, Alumno alumno) {
        if (index>=0 && index<alumnos.length) {
            alumnos[index] = alumno;
        }
    }

    public void imprimirDatosGrupo() {
        System.out.println();
        System.out.println("CLave del grupo: " + claveGrupo);
        System.out.println("Nombre de la materia: " + materia.getNombreMateria());
        System.out.println("Nombre del profesor: " + profesor.getNombreProfesor());
        System.out.println("Alumnos:");

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + alumnos[i].getNombreAlumno());
        }
    }
    
}
