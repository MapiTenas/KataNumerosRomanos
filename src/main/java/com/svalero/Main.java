package com.svalero;
import java.util.Scanner;

public final class Main {
    private Main() { }

    /** Variable utilizada para identificar numeros menores que mil. */
    private static final int TRESMIL = 3000;

    /**
     * Método Main para usar el conversor en consola.
     * @param args para ejecutar metodo main
     */
    public static void main(final String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numeroArabe;
        do {
            System.out.print("Introduce un número para convertirlo "
                    + "a numeración romana:");
            numeroArabe = keyboard.nextInt();
            if (numeroArabe > TRESMIL) {
                System.out.println("Número mayor de 3000."
                        + "Cierre de programa.");
            } else {
                System.out.println(NumerosRomanos.convertir(numeroArabe));
            }
        } while (numeroArabe <= TRESMIL);
    }
}
