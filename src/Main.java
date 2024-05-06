import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola Mundo");

        String nombre = "Spiderman: into the spiderverse";
        int fechaDeLanzamiento = 2023;
        double evaluacion = 4.7;
        boolean incluidoEnStreamings = true;
        String sinopsis = """
                La segunda pelicula animada de miles morales
                """;
        double mediaEvaluacion = (4.5+3.7+5)/3;
        double mediaEvaluacionesUsuario=0;

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
        System.out.println("Nota media: " + mediaEvaluacion);
        for (int i = 0; i < 3; i++){
            System.out.println("Digite la nota a la pelicula " + nombre);
            double notaPelicula = sc.nextDouble();
            mediaEvaluacionesUsuario = mediaEvaluacionesUsuario + notaPelicula;
        }
        mediaEvaluacionesUsuario = mediaEvaluacionesUsuario/3;
        System.out.println("La media del usuario es: " + mediaEvaluacionesUsuario);
    }
}