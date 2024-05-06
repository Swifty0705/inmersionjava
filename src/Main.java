import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inmersión Java Alura Latam");

        String nombre = "Spiderman: into the spiderverse";
        int iterador=0;
        int fechaDeLanzamiento = 2023;
        double evaluacion = 4.7;
        boolean incluidoEnStreamings = true;
        String sinopsis = """
                La segunda pelicula animada de miles morales
                """;
        int cantidadUsuarios;
        double mediaEvaluacionesUsuario=0;
        ArrayList<Double> notaUsuarios = new ArrayList<Double>();

        System.out.println(nombre);
        System.out.println(sinopsis);
        System.out.println("Fecha: " +fechaDeLanzamiento);
        System.out.println("Evaluación :" + evaluacion);
        System.out.print("Esta en una app?: ");
        if(incluidoEnStreamings){
            System.out.println("si");
        }else{
            System.out.println("no");
        }

        System.out.println("Digite la cantidad de usuarios que calificaran "+ nombre);
        cantidadUsuarios = sc.nextInt();

        while(iterador<cantidadUsuarios){
            System.out.println("Digite la calificación " + (iterador + 1) + " de la pelicula: " + nombre );
            notaUsuarios.add(sc.nextDouble());
            iterador = iterador + 1;
        }

        System.out.println("las calificaciones de los usuarios son: ");
        for (Double notaUsuario : notaUsuarios){
            mediaEvaluacionesUsuario = mediaEvaluacionesUsuario + notaUsuario;
            System.out.println(notaUsuario);
        }
        System.out.println("Media de notas: " + (mediaEvaluacionesUsuario/cantidadUsuarios));
    }
}