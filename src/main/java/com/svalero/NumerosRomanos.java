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



        return numeroRomano;
    }
}
