package com.svalero;

public class NumerosRomanos {
    /** Variables usadas por el programa */
    private static final int CERO = 0;
    private static final int UNO = 1;
    private static final int DOS = 2;
    private static final int TRES = 3;
    private static final int CUATRO = 4;
    private static final int CINCO = 5;
    private static final int SEIS = 6;
    private static final int SIETE = 7;
    private static final int OCHO = 8;
    private static final int NUEVE = 9;
    private static final int DIEZ = 10;
    private static final int CIEN = 100;
    private static final int MIL = 1000;

    public static String convertir(final int numeroArabe) {
        String numeroRomano = null;
        String unidades;
        String decenas;
        String centenas;
        String millares;

        if (numeroArabe < DIEZ) {
            unidades = unidadesConversion(numeroArabe);
            numeroRomano = unidades;
        } else if (numeroArabe < CIEN) {
            decenas = decenasConversion(getNumero(numeroArabe, CERO));
            unidades = unidadesConversion(getNumero(numeroArabe, UNO));
            numeroRomano = decenas + unidades;
        } else if (numeroArabe < MIL) {
            centenas = centenasConversion(getNumero(numeroArabe, CERO));
            decenas = decenasConversion(getNumero(numeroArabe, UNO));
            unidades = unidadesConversion(getNumero(numeroArabe, DOS));
            numeroRomano = centenas + decenas + unidades;
        } else {
            millares = millaresConversion(getNumero(numeroArabe, CERO));
            centenas = centenasConversion(getNumero(numeroArabe, UNO));
            decenas = decenasConversion(getNumero(numeroArabe, DOS));
            unidades = unidadesConversion(getNumero(numeroArabe, TRES));
            numeroRomano = millares + centenas + decenas + unidades;
        }
            return numeroRomano;
        }

        private static int getNumero(final int numero, final int posicion) {
            char numeroChar = String.valueOf(numero).charAt(posicion);
            int res = Integer.parseInt(String.valueOf(numeroChar));
            return res;
        }

        private static String unidadesConversion(final int unidades) {
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

        private static String decenasConversion(final int decenas) {
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

        private static String centenasConversion(final int centenas) {
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
        private static String millaresConversion(final int millares) {
            String millaresRomanos = "";
            if (millares == UNO) {
                millaresRomanos = "M";
            } else if (millares == DOS) {
                millaresRomanos = "MM";
            } else if (millares == TRES) {
                millaresRomanos = "MMM";
            }

            return millaresRomanos;
        }
}

