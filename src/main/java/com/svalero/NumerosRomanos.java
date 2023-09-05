package com.svalero;

public class NumerosRomanos {

    private final static int CERO = 0;
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
            decenasRomanas = decenasConversion(getNumeroConversion(numeroArabe, CERO));
            unidadesRomanas = unidadesConversion(getNumeroConversion(numeroArabe, UNO));
            numeroRomano = decenasRomanas + unidadesRomanas;
        } else if (numeroArabe < MIL) {
            centenasRomanas = centenasConversion(getNumeroConversion(numeroArabe, CERO));
            decenasRomanas = decenasConversion(getNumeroConversion(numeroArabe, UNO));
            unidadesRomanas = unidadesConversion(getNumeroConversion(numeroArabe, DOS));
            numeroRomano = centenasRomanas + decenasRomanas + unidadesRomanas;
        } else {
            millaresRomanos = millaresConversion(getNumeroConversion(numeroArabe, CERO));
            centenasRomanas = centenasConversion(getNumeroConversion(numeroArabe, UNO));
            decenasRomanas = decenasConversion(getNumeroConversion(numeroArabe, DOS));
            unidadesRomanas = unidadesConversion(getNumeroConversion(numeroArabe, TRES));
            numeroRomano = millaresRomanos + centenasRomanas + decenasRomanas + unidadesRomanas;
        }
            return numeroRomano;
        }

        private static int getNumeroConversion(final int numero, final int posicion) {
            int res = Integer.parseInt(String.valueOf(String.valueOf(numero).charAt(posicion)));
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

