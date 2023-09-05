package com.svalero;

public class NumerosRomanos {

    private final static int UNO = 1;
    private final static int DOS = 2;
    private final static int TRES = 3;
    private final static int CUATRO = 4;
    private final static int CINCO = 5;
    private final static int SEIS = 6;
    private final static int SIETE = 7;
    private final static int OCHO = 8;
    private final static int NUEVE = 9;
    private final static int DIEZ = 10;
    private final static int CIEN = 100;
    private final static int MIL = 1000;

    public static String convertir(int numeroArabe) {
        String numeroRomano = null;
        String unidadesRomanas;
        String decenasRomanas;
        String centenasRomanas;
        String millaresRomanos;

        if (numeroArabe < DIEZ) {
            unidadesRomanas = unidadesConversion(numeroArabe);
            numeroRomano = unidadesRomanas;
        } else if (numeroArabe < CIEN) {
            decenasRomanas = decenasConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(0))));
            unidadesRomanas = unidadesConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(1))));
            numeroRomano = decenasRomanas + unidadesRomanas;
        } else if (numeroArabe < MIL) {
            centenasRomanas = centenasConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(0))));
            decenasRomanas = decenasConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(1))));
            unidadesRomanas = unidadesConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(2))));
            numeroRomano = centenasRomanas + decenasRomanas + unidadesRomanas;
        } else {
            millaresRomanos = millaresConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(0))));
            centenasRomanas = centenasConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(1))));
            decenasRomanas = decenasConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(2))));
            unidadesRomanas = unidadesConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(3))));
            numeroRomano = millaresRomanos + centenasRomanas + decenasRomanas + unidadesRomanas;
        }
            return numeroRomano;
        }

        private static String unidadesConversion ( int unidades){
            String unidadesRomanas = "";
            if (unidades == UNO) {
                unidadesRomanas = "I";
            } else if (unidades == DOS) {
                unidadesRomanas = "II";
            } else if (unidades == TRES) {
                unidadesRomanas = "III";
            } else if (unidades == CUATRO) {
                unidadesRomanas = "IV";
            } else if (unidades == CINCO) {
                unidadesRomanas = "V";
            } else if (unidades == SEIS) {
                unidadesRomanas = "VI";
            } else if (unidades == SIETE) {
                unidadesRomanas = "VII";
            } else if (unidades == OCHO) {
                unidadesRomanas = "VIII";
            } else if (unidades == NUEVE) {
                unidadesRomanas = "IX";
            }
            return unidadesRomanas;
        }

        private static String decenasConversion ( int decenas){
            String decenasRomanas = "";
            if (decenas == UNO) {
                decenasRomanas = "X";
            } else if (decenas == DOS) {
                decenasRomanas = "XX";
            } else if (decenas == TRES) {
                decenasRomanas = "XXX";
            } else if (decenas == CUATRO) {
                decenasRomanas = "XL";
            } else if (decenas == CINCO) {
                decenasRomanas = "L";
            } else if (decenas == SEIS) {
                decenasRomanas = "LX";
            } else if (decenas == SIETE) {
                decenasRomanas = "LXX";
            } else if (decenas == OCHO) {
                decenasRomanas = "LXXX";
            } else if (decenas == NUEVE) {
                decenasRomanas = "XC";
            }
            return decenasRomanas;
        }

        private static String centenasConversion ( int centenas){
            String centenasRomanas = "";
            if (centenas == UNO) {
                centenasRomanas = "C";
            } else if (centenas == DOS) {
                centenasRomanas = "CC";
            } else if (centenas == TRES) {
                centenasRomanas = "CCC";
            } else if (centenas == CUATRO) {
                centenasRomanas = "CD";
            } else if (centenas == CINCO) {
                centenasRomanas = "D";
            } else if (centenas == SEIS) {
                centenasRomanas = "DC";
            } else if (centenas == SIETE) {
                centenasRomanas = "DCC";
            } else if (centenas == OCHO) {
                centenasRomanas = "DCCC";
            } else if (centenas == NUEVE) {
                centenasRomanas = "CM";
            }

            return centenasRomanas;

        }
        private static String millaresConversion(int millares) {
            String millaresRomanos = "";
            if (millares == UNO) {
                millaresRomanos = "M";
            } else if (millares == DOS) {
                millaresRomanos = "MM";
            } else if (millares == TRES){
                millaresRomanos = "MMM";
            }

            return millaresRomanos;
        }
}

