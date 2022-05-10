import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChargeurMagasinTest {

    @Test
    public void test2_chargerMagasin_exception() {
        boolean exception = false;
        try {
            ChargeurMagasin chargeurMagasin = new ChargeurMagasin("rep_faux");
            Magasin magasin = chargeurMagasin.chargerMagasin();
        } catch (FileNotFoundException e){
            exception = true;
        }
        assertEquals(true, exception);
    }
}
