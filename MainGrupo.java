package practica7;
import java.util.Scanner;

public class MainGrupo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Cantidad de grupos: ");
        int Grupos = scanner.nextInt();
        scanner.nextLine();

        Grupo[] grupos = new Grupo[Grupos];

        for (int i=0;i<Grupos;i++) {
            System.out.println();
            System.out.println("Datos del grupo " + (i+1) + ":");
            System.out.print("Clave del grupo: ");
            int claveGrupo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nombre de la materia: ");
            String nombreMateria = scanner.nextLine();

            System.out.print("Nombre del profesor: ");
            String nombreProfesor = scanner.nextLine();

            System.out.print("Cantidad de alumnos: ");
            int cantidadAlumnos = scanner.nextInt();

            Grupo grupo = new Grupo(claveGrupo, new Materia(nombreMateria), new Profesor(nombreProfesor), cantidadAlumnos);

            for (int j = 0; j < cantidadAlumnos; j++) {
                System.out.print("Nombre del alumno " + (j + 1) + ": ");
                String nombreAlumno = scanner.next();
                grupo.setAlumno(j, new Alumno(nombreAlumno));
            }

            grupos[i] = grupo;
        }

        System.out.println("Datos de los grupos: ");
        for (int i = 0; i < grupos.length; i++){
            grupos[i].imprimirDatosGrupo();
        }

        scanner.close();
    }
    
}
