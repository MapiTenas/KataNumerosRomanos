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
}
