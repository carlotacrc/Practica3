package aplicacion;

import mates.Matematicas;

/**
 * Clase principal que contiene el método main para ejecutar la aplicación.
 */
public class Principal {
    /**
     * Método principal que imprime el valor de PI calculado de forma recursiva.
     * 
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        System.out.println("El número PI es " + Matematicas.piLambda(10000));
    }
}