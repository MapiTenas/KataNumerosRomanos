package com.svalero;

public class NumerosRomanos {
    public static String convertir(int numeroArabe) {
        String numeroRomano = null;
        String unidadesRomanas;
        String decenasRomanas;

        if (numeroArabe < 10) {
            unidadesRomanas = unidadesConversion(numeroArabe);
            numeroRomano = unidadesRomanas;
        } else if (numeroArabe < 100) {
            decenasRomanas = decenasConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(0))));
            unidadesRomanas = unidadesConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(1))));
            numeroRomano = decenasRomanas + unidadesRomanas;
        }

        if (numeroArabe == 100) {
            numeroRomano = "C";
        }

        if (numeroArabe == 200) {
            numeroRomano = "CC";
        }


        if (numeroArabe == 300) {
            numeroRomano = "CCC";
        }

        if (numeroArabe == 400) {
            numeroRomano = "CD";
        }

        if (numeroArabe == 500) {
            numeroRomano = "D";
        }

        if (numeroArabe == 600) {
            numeroRomano = "DC";
        }

        if (numeroArabe == 700) {
            numeroRomano = "DCC";
        }

        if (numeroArabe == 800) {
            numeroRomano = "DCCC";
        }

        if (numeroArabe == 1000) {
            numeroRomano = "M";
        }

        return numeroRomano;
    }

    private static String unidadesConversion(int unidades) {
        String unidadesRomanas = "";
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
        } else if (unidades == 9){
            unidadesRomanas = "IX";
        }
        return unidadesRomanas;
    }

    private static String decenasConversion(int decenas) {
        String decenasRomanas = "";
        if (decenas == 1) {
            decenasRomanas = "X";
        } else if (decenas == 2) {
            decenasRomanas = "XX";
        } else if (decenas == 3) {
            decenasRomanas = "XXX";
        } else if (decenas == 4) {
            decenasRomanas = "XL";
        } else if (decenas == 5) {
            decenasRomanas = "L";
        } else if (decenas == 6) {
            decenasRomanas = "LX";
        } else if (decenas == 7) {
            decenasRomanas = "LXX";
        } else if (decenas == 8) {
            decenasRomanas = "LXXX";
        } else if (decenas == 9) {
            decenasRomanas = "XC";
        }
        return decenasRomanas;
    }
}
