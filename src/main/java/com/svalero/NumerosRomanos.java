package com.svalero;

public class NumerosRomanos {
    public static String convertir(int numeroArabe) {
        String numeroRomano = null;
        String unidadesRomanas;
        String decenasRomanas;
        String centenasRomanas;

        if (numeroArabe < 10) {
            unidadesRomanas = unidadesConversion(numeroArabe);
            numeroRomano = unidadesRomanas;
        } else if (numeroArabe < 100) {
            decenasRomanas = decenasConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(0))));
            unidadesRomanas = unidadesConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(1))));
            numeroRomano = decenasRomanas + unidadesRomanas;
        } else if (numeroArabe < 1000) {
            centenasRomanas = centenasConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(0))));
            decenasRomanas = decenasConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(1))));
            unidadesRomanas = unidadesConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(2))));
            numeroRomano = centenasRomanas + decenasRomanas + unidadesRomanas;
        }

        if (numeroArabe == 1000) {
            numeroRomano = "M";
        }

        if (numeroArabe == 2000) {
            numeroRomano = "MM";
        }

        if (numeroArabe == 3000) {
            numeroRomano = "MMM";
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
        } else if (unidades == 9) {
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

    private static String centenasConversion(int centenas) {
        String centenasRomanas = "";
        if (centenas == 1) {
            centenasRomanas = "C";
        } else if (centenas == 2) {
            centenasRomanas = "CC";
        } else if (centenas == 3) {
            centenasRomanas = "CCC";
        } else if (centenas == 4) {
            centenasRomanas = "CD";
        } else if (centenas == 5) {
            centenasRomanas = "D";
        } else if (centenas == 6) {
            centenasRomanas = "DC";
        } else if (centenas == 7) {
            centenasRomanas = "DCC";
        } else if (centenas == 8) {
            centenasRomanas = "DCCC";
        } else if (centenas == 9) {
            centenasRomanas = "CM";
        }

        return centenasRomanas;

    }
}
