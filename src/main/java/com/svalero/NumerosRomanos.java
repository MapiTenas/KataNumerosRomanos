package com.svalero;

public class NumerosRomanos {

    final static int uno = 1;
    final static int dos = 2;
    final static int tres = 3;
    final static int cuatro = 4;
    final static int cinco = 5;
    final static int seis = 6;
    final static int siete = 7;
    final static int ocho = 8;
    final static int nueve = 9;
    final static int diez = 10;
    final static int cien = 100;
    final static int mil = 1000;

    public static String convertir(int numeroArabe) {
        String numeroRomano = null;
        String unidadesRomanas;
        String decenasRomanas;
        String centenasRomanas;
        String millaresRomanos;

        if (numeroArabe < diez) {
            unidadesRomanas = unidadesConversion(numeroArabe);
            numeroRomano = unidadesRomanas;
        } else if (numeroArabe < cien) {
            decenasRomanas = decenasConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(0))));
            unidadesRomanas = unidadesConversion(Integer.parseInt(String.valueOf(String.valueOf(numeroArabe).charAt(1))));
            numeroRomano = decenasRomanas + unidadesRomanas;
        } else if (numeroArabe < mil) {
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
            if (unidades == uno) {
                unidadesRomanas = "I";
            } else if (unidades == dos) {
                unidadesRomanas = "II";
            } else if (unidades == tres) {
                unidadesRomanas = "III";
            } else if (unidades == cuatro) {
                unidadesRomanas = "IV";
            } else if (unidades == cinco) {
                unidadesRomanas = "V";
            } else if (unidades == seis) {
                unidadesRomanas = "VI";
            } else if (unidades == siete) {
                unidadesRomanas = "VII";
            } else if (unidades == ocho) {
                unidadesRomanas = "VIII";
            } else if (unidades == nueve) {
                unidadesRomanas = "IX";
            }
            return unidadesRomanas;
        }

        private static String decenasConversion ( int decenas){
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

        private static String centenasConversion ( int centenas){
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
        private static String millaresConversion(int millares) {
            String millaresRomanos = "";
            if (millares == 1) {
                millaresRomanos = "M";
            } else if (millares == 2) {
                millaresRomanos = "MM";
            } else {
                millaresRomanos = "MMM";
            }

            return millaresRomanos;
        }
}

