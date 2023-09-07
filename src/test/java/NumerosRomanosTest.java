import com.svalero.NumerosRomanos;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;


public class NumerosRomanosTest {
    @ParameterizedTest
    @CsvSource({"1, I", "2, II", "3, III", "4, IV", "5, V", "6, VI", "7, VII", "8, VIII", "9, IX"})
    void unidadesToNumerosRomanos(int numeroArabe, String numeroRomano) {
        assertEquals(numeroRomano, NumerosRomanos.convertir(numeroArabe));
    }
    @ParameterizedTest
    @CsvSource({"10, X", "20, XX", "30, XXX", "40, XL", "50, L", "60, LX", "70, LXX", "80, LXXX", "90, XC"})
    void decenasToNumerosRomanos(int input, String expectedOutput) {
        assertEquals(expectedOutput, NumerosRomanos.convertir(input));
    }
    @ParameterizedTest
    @CsvSource({"100, C", "110, CX", "200, CC", "300, CCC", "400, CD", "500, D", "600, DC", "700, DCC", "800, DCCC", "900, CM"})
    void centenasToNumerosRomanos(int input, String expectedOutput) {
        assertEquals(expectedOutput, NumerosRomanos.convertir(input));
    }
    @ParameterizedTest
    @CsvSource({"1000, M", "2000, MM", "3000, MMM"})
    void millaresToNumerosRomanos(int input, String expectedOutput) {
        assertEquals(expectedOutput, NumerosRomanos.convertir(input));
    }


}
