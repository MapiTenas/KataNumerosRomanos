package com.svalero;
import java.util.Map;

public final class NumerosRomanos {

    private NumerosRomanos() { }
    /**
     * @return una nueva instancia de la clase NumerosRomanos.
     */
    public static NumerosRomanos getInstance() {
        return new NumerosRomanos();
    }
    /** Mapa que contiene el valor de las unidades. */
    private static final Map<String, String> UNIDAD = Map.of(
            "0", "",
            "1", "I",
            "2", "II",
            "3", "III",
            "4", "IV",
            "5", "V",
            "6", "VI",
            "7", "VII",
            "8", "VIII",
            "9", "IX"
    );

    /** Mapa que contiene el valor de las decenas. */
    private static final Map<String, String> DECENA = Map.of(
            "0", "",
            "1", "X",
            "2", "XX",
            "3", "XXX",
            "4", "XL",
            "5", "L",
            "6", "LX",
            "7", "LXX",
            "8", "LXXX",
            "9", "XC"
    );

    /** Mapa que contiene el valor de las centenas. */
    private static final Map<String, String> CENTENA = Map.of(
            "0", "",
            "1", "C",
            "2", "CC",
            "3", "CCC",
            "4", "CD",
            "5", "D",
            "6", "DC",
            "7", "DCC",
            "8", "DCCC",
            "9", "CM"
    );

    /** Mapa que contiene el valor de los millares. */
    private static final Map<String, String> MILLAR = Map.of(
            "1", "M",
            "2", "MM",
            "3", "MMM"
    );

    /** Variable para obtener la posición cero. */
    private static final int CERO = 0;
    /** Variable para obtener la posición uno. */
    private static final int UNO = 1;
    /** Variable para obtener la posición dos. */
    private static final int DOS = 2;
    /** Variable para obtener la posición tres. */
    private static final int TRES = 3;

    /** Variable utilizada para identificar numeros menores que diez. */
    private static final int DIEZ = 10;
    /** Variable utilizada para identificar numeros menores que cien. */
    private static final int CIEN = 100;
    /** Variable utilizada para identificar numeros menores que mil. */
    private static final int MIL = 1000;

    /** Método de conversión de números arabes a números romanos.
     * @param numeroArabe numero a convertir
     * @return resultado de la conversion a numero romano
     * */
    public static String convertir(final int numeroArabe) {
        String numeroRomano;
        String unidades;
        String decenas;
        String centenas;
        String millares;

        if (numeroArabe < DIEZ) {
            unidades = UNIDAD.get(String.valueOf(numeroArabe));
            numeroRomano = unidades;
        } else if (numeroArabe < CIEN) {
            decenas = DECENA.get(String.valueOf(getNumero(numeroArabe, CERO)));
            unidades = UNIDAD.get(String.valueOf(getNumero(numeroArabe, UNO)));
            numeroRomano = decenas + unidades;
        } else if (numeroArabe < MIL) {
            centenas = CENTENA.get(String.valueOf(
                    getNumero(numeroArabe, CERO)
            ));
            decenas = DECENA.get(String.valueOf(getNumero(numeroArabe, UNO)));
            unidades = UNIDAD.get(String.valueOf(getNumero(numeroArabe, DOS)));
            numeroRomano = centenas + decenas + unidades;
        } else {
            millares = MILLAR.get(String.valueOf(getNumero(numeroArabe, CERO)));
            centenas = CENTENA.get(String.valueOf(getNumero(numeroArabe, UNO)));
            decenas = DECENA.get(String.valueOf(getNumero(numeroArabe, DOS)));
            unidades = UNIDAD.get(String.valueOf(getNumero(numeroArabe, TRES)));
            numeroRomano = millares + centenas + decenas + unidades;
        }
            return numeroRomano;
        }

        private static int getNumero(final int numero, final int posicion) {
            char numeroChar = String.valueOf(numero).charAt(posicion);
            return Integer.parseInt(String.valueOf(numeroChar));
        }

}
