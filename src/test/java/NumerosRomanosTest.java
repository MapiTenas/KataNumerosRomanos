import com.svalero.NumerosRomanos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumerosRomanosTest {
    @Test
    void numeroRomanosConversor1() {

        assertEquals("I", NumerosRomanos.getInstance().convertir(1));
    }

    @Test
    void numeroRomanosConversor2() {

        assertEquals("II", NumerosRomanos.getInstance().convertir(2));
    }

    @Test
    void numeroRomanosConversor3() {

        assertEquals("III", NumerosRomanos.getInstance().convertir(3));
    }

    @Test
    void numeroRomanosConversor4() {

        assertEquals("IV", NumerosRomanos.getInstance().convertir(4));
    }

    @Test
    void numeroRomanosConversor5() {

        assertEquals("V", NumerosRomanos.getInstance().convertir(5));
    }

    @Test
    void numeroRomanosConversor6() {

        assertEquals("VI", NumerosRomanos.getInstance().convertir(6));
    }

    @Test
    void numeroRomanosConversor7() {

        assertEquals("VII", NumerosRomanos.getInstance().convertir(7));
    }

    @Test
    void numeroRomanosConversor8() {

        assertEquals("VIII", NumerosRomanos.getInstance().convertir(8));
    }

    @Test
    void numeroRomanosConversor9() {

        assertEquals("IX", NumerosRomanos.getInstance().convertir(9));
    }

    @Test
    void numeroRomanosConversor10() {

        assertEquals("X", NumerosRomanos.getInstance().convertir(10));
    }

    @Test
    void numeroRomanosConversor20() {

        assertEquals("XX", NumerosRomanos.getInstance().convertir(20));
    }

    @Test
    void numeroRomanosConversor30() {

        assertEquals("XXX", NumerosRomanos.getInstance().convertir(30));
    }

    @Test
    void numeroRomanosConversor40() {

        assertEquals("XL", NumerosRomanos.getInstance().convertir(40));
    }


    @Test
    void numeroRomanosConversor50() {

        assertEquals("L", NumerosRomanos.getInstance().convertir(50));
    }

    @Test
    void numeroRomanosConversor60() {

        assertEquals("LX", NumerosRomanos.getInstance().convertir(60));
    }

    @Test
    void numeroRomanosConversor70() {

        assertEquals("LXX", NumerosRomanos.getInstance().convertir(70));
    }

    @Test
    void numeroRomanosConversor80() {

        assertEquals("LXXX", NumerosRomanos.getInstance().convertir(80));
    }

    @Test
    void numeroRomanosConversor90() {

        assertEquals("XC", NumerosRomanos.getInstance().convertir(90));
    }

    @Test
    void numeroRomanosConversor100() {

        assertEquals("C", NumerosRomanos.getInstance().convertir(100));
    }

    @Test
    void numeroRomanosConversor200() {

        assertEquals("CC", NumerosRomanos.getInstance().convertir(200));
    }

    @Test
    void numeroRomanosConversor300() {

        assertEquals("CCC", NumerosRomanos.getInstance().convertir(300));
    }

    @Test
    void numeroRomanosConversor400() {

        assertEquals("CD", NumerosRomanos.getInstance().convertir(400));
    }

    @Test
    void numeroRomanosConversor500() {

        assertEquals("D", NumerosRomanos.getInstance().convertir(500));
    }

    @Test
    void numeroRomanosConversor600() {

        assertEquals("DC", NumerosRomanos.getInstance().convertir(600));
    }

    @Test
    void numeroRomanosConversor700() {

        assertEquals("DCC", NumerosRomanos.getInstance().convertir(700));
    }

    @Test
    void numeroRomanosConversor800() {

        assertEquals("DCCC", NumerosRomanos.getInstance().convertir(800));
    }

    @Test
    void numeroRomanosConversor900() {

        assertEquals("CM", NumerosRomanos.getInstance().convertir(900));
    }

    @Test
    void numeroRomanosConversor1000() {

        assertEquals("M", NumerosRomanos.getInstance().convertir(1000));
    }

    @Test
    void numeroRomanosConversor2000() {

        assertEquals("MM", NumerosRomanos.getInstance().convertir(2000));
    }

    @Test
    void numeroRomanosConversor3000() {

        assertEquals("MMM", NumerosRomanos.getInstance().convertir(3000));
    }


}
