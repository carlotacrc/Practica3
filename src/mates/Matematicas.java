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
        long puntosDentroDelCirculo = IntStream.range(0, (int) pasos)
            .mapToObj(i -> new double[]{Math.random(), Math.random()})
            .filter(punto -> punto[0] * punto[0] + punto[1] * punto[1] <= 1)
            .count();
        return 4 * (double) puntosDentroDelCirculo / pasos;
    }
}
