package com.svalero;

public class NumerosRomanos {
    public static String convertir (int numeroArabe) {
        String numeroRomano = null;
        String unidadesRomanas;

        if (numeroArabe <=10) {
            unidadesRomanas = unidadesConversion(numeroArabe);
            numeroRomano = unidadesRomanas;
        }

        if (numeroArabe == 10) {
            numeroRomano = "X";
        }

        if (numeroArabe == 20) {
            numeroRomano = "XX";
        }

        if (numeroArabe == 30) {
            numeroRomano = "XXX";
        }

        if (numeroArabe == 40) {
            numeroRomano = "XL";
        }

        if (numeroArabe == 50) {
            numeroRomano = "L";
        }

        if (numeroArabe == 60) {
            numeroRomano = "LX";
        }

        if (numeroArabe == 70) {
            numeroRomano = "LXX";
        }

        if (numeroArabe == 80) {
            numeroRomano = "LXXX";
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
    private static String unidadesConversion(int unidades) {
        String unidadesRomanas;
        if (unidades == 1) {
            unidadesRomanas = "I";
        } else if (unidades == 2) {
            unidadesRomanas = "II";
        } else if (unidades == 3) {
            unidadesRomanas = "III";
        } else if (unidades == 4) {
            unidadesRomanas = "IV";
        } else if (unidades == 5) {
            unidadesRomanas = "V";
        } else if (unidades == 6) {
            unidadesRomanas = "VI";
        } else if (unidades == 7) {
            unidadesRomanas = "VII";
        } else if (unidades == 8) {
            unidadesRomanas = "VIII";
        } else {
            unidadesRomanas = "IX";
        }
        return unidadesRomanas;
    }



}
