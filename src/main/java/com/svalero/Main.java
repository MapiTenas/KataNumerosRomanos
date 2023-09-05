package com.svalero;
import java.util.Scanner;

public final class Main {
    private Main() { }

    /**
     * Método Main para usar el conversor en consola.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Introduce un número para convertirlo "
                + "a numeración romana:");
        int numeroArabe = keyboard.nextInt();
        System.out.println(NumerosRomanos.convertir(numeroArabe));

    }
}