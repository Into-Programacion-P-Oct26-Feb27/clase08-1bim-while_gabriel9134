
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int limite = 3;
        int contador = 1;
        double suma_total = 0;

        double promedio_final;
        double calificacion;

        String cadena_final = "Las notas ingresadas son:\n";

        System.out.println("Ingrese las notas de los estudiantes de su materia");

        while (contador <= limite) {
            System.out.printf("Ingrese calificación número %d\n", contador);
            calificacion = entrada.nextDouble();

            cadena_final = String.format("%s%.1f\n",
                    cadena_final, calificacion);

            suma_total = suma_total + calificacion;
            //contador
            contador = contador + 1;
        }

        cadena_final = String.format("%sLa suma de notas es: %.1f\n",
                cadena_final, suma_total);

        promedio_final = suma_total / limite;

        cadena_final = String.format("%sPromedio es: %.2f\n",
                cadena_final, promedio_final);


        // System.out.printf("El promedio final es: %f\n", promedio_final);
        System.out.printf("%s\n", cadena_final);

    }
}
/*
pilas con ese camabio 
*/
