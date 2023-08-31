import com.svalero.NumerosRomanos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumerosRomanosTest {
    @Test
    void numeroRomanosConversor1() {

        assertEquals("I", new NumerosRomanos().convertir(1));
    }

    @Test
    void numeroRomanosConversor2() {

        assertEquals("II", new NumerosRomanos().convertir(2));
    }

    @Test
    void numeroRomanosConversor3() {

        assertEquals("III", new NumerosRomanos().convertir(3));
    }

    @Test
    void numeroRomanosConversor4() {

        assertEquals("IV", new NumerosRomanos().convertir(4));
    }

    @Test
    void numeroRomanosConversor5() {

        assertEquals("V", new NumerosRomanos().convertir(5));
    }
}
