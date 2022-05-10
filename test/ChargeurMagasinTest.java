import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ChargeurMagasinTest {

    @Test
    public void testChargerMagasin() throws FileNotFoundException {
        ChargeurMagasin chargeur = new ChargeurMagasin("musicbrainzSimple/");
        Magasin magasin = chargeur.chargerMagasin();
        assertEquals(12, magasin.getNombreCds());
    }


}
