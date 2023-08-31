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

        if (numeroArabe == 3) {
            numeroRomano = "III";
        }

        if (numeroArabe == 4) {
            numeroRomano = "IV";
        }

        if (numeroArabe == 5) {
            numeroRomano = "V";
        }

        if (numeroArabe == 6) {
            numeroRomano = "VI";
        }

        if (numeroArabe == 7) {
            numeroRomano = "VII";
        }

        if (numeroArabe == 8) {
            numeroRomano = "VIII";
        }

        if (numeroArabe == 9) {
            numeroRomano = "IX";
        }

        if (numeroArabe == 10) {
            numeroRomano = "X";
        }

        if (numeroArabe == 50) {
            numeroRomano = "L";
        }

        if (numeroArabe == 100) {
            numeroRomano = "C";
        }

        if (numeroArabe == 500) {
            numeroRomano = "D";
        }

        if (numeroArabe == 1000) {
            numeroRomano = "M";
        }



        return numeroRomano;
    }
}
