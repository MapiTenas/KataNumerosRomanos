package com.svalero;

public class NumerosRomanos {
    public static String convertir (int numeroArabe) {
        String numeroRomano = null;

        if (numeroArabe == 1) {
            numeroRomano = "I";
        }

        if (numeroArabe == 2) {
            numeroRomano = "II";
        }

        return numeroRomano;
    }
}
