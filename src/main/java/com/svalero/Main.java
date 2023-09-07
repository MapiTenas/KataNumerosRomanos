package com.svalero;
import java.util.Scanner;

public final class Main {
    private Main() { }

    /**
     * Método Main para usar el conversor en consola.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numeroArabe;
        do {
            System.out.print("Introduce un número para convertirlo "
                    + "a numeración romana:");
            numeroArabe = keyboard.nextInt();
            if (numeroArabe > 3000) {
                System.out.println("Número erroneo.");
            } else {
                System.out.println(NumerosRomanos.convertir(numeroArabe));
            }
        } while (numeroArabe <= 3000);
    }
}