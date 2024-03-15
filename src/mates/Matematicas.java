package mates;
import java.util.stream.IntStream;

/**
 * Clase Matematicas que contiene métodos relacionados con operaciones matemáticas.
 */
public class Matematicas {
    /**
     * Método que calcula una aproximación del valor de Pi utilizando el método de Montecarlo.
     * 
     * @param pasos El número de puntos que se generarán en el cuadrado unitario.
     * @return Una aproximación del valor de Pi.
     */
    public static double piLambda(long pasos) {
        /**
         * Se generan pasos puntos aleatorios en el cuadrado unitario y se cuentan los que caen dentro del círculo de radio 1.
         */
        long puntosDentroDelCirculo = IntStream.range(0, (int) pasos)
            .mapToObj(i -> new double[]{Math.random(), Math.random()})
            /**
             * Se filtran los puntos que caen dentro del círculo de radio 1.
             */
            .filter(punto -> punto[0] * punto[0] + punto[1] * punto[1] <= 1)
            /**
             * Se cuentan los puntos que han pasado el filtro.
             */
            .count();
            /**
             * Se devuelve la aproximación de Pi.
             */
        return 4 * (double) puntosDentroDelCirculo / pasos;
    }
}
