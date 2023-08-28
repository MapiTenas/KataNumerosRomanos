import com.svalero.NumerosRomanos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumerosRomanosTest {
    @Test
    void numeroRomanosConversor() {

        assertEquals("I", new NumerosRomanos().convertir(1));
    }
}
