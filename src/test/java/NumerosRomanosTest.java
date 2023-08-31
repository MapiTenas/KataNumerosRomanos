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

    @Test
    void numeroRomanosConversor6() {

        assertEquals("VI", new NumerosRomanos().convertir(6));
    }

    @Test
    void numeroRomanosConversor7() {

        assertEquals("VII", new NumerosRomanos().convertir(7));
    }

    @Test
    void numeroRomanosConversor8() {

        assertEquals("VIII", new NumerosRomanos().convertir(8));
    }

    @Test
    void numeroRomanosConversor9() {

        assertEquals("IX", new NumerosRomanos().convertir(9));
    }

    @Test
    void numeroRomanosConversor10() {

        assertEquals("X", new NumerosRomanos().convertir(10));
    }

    @Test
    void numeroRomanosConversor20() {

        assertEquals("XX", new NumerosRomanos().convertir(20));
    }

    @Test
    void numeroRomanosConversor30() {

        assertEquals("XXX", new NumerosRomanos().convertir(30));
    }

    @Test
    void numeroRomanosConversor40() {

        assertEquals("XL", new NumerosRomanos().convertir(40));
    }


    @Test
    void numeroRomanosConversor50() {

        assertEquals("L", new NumerosRomanos().convertir(50));
    }

    @Test
    void numeroRomanosConversor60() {

        assertEquals("LX", new NumerosRomanos().convertir(60));
    }

    @Test
    void numeroRomanosConversor70() {

        assertEquals("LXX", new NumerosRomanos().convertir(70));
    }

    @Test
    void numeroRomanosConversor80() {

        assertEquals("LXXX", new NumerosRomanos().convertir(80));
    }

    @Test
    void numeroRomanosConversor100() {

        assertEquals("C", new NumerosRomanos().convertir(100));
    }

    @Test
    void numeroRomanosConversor500() {

        assertEquals("D", new NumerosRomanos().convertir(500));
    }

    @Test
    void numeroRomanosConversor1000() {

        assertEquals("M", new NumerosRomanos().convertir(1000));
    }

}
