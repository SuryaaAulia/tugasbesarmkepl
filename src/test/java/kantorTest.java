import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;
import model.Kantor;
import model.Pegawai;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author mzaky
 */

public class KantorTest {

    private Kantor kantor;

    @Before
    public void setUp() {
        kantor = new Kantor("Zaky Corporation");
        kantor.tambahPegawai(new Pegawai("Angela", 33, 8000000));
        kantor.tambahPegawai(new Pegawai("Kevin", 38, 5000000));
        kantor.tambahPegawai(new Pegawai("Stanley", 51, 10000000));
    }

    @Test
    public void testTambahPegawai() {
        Pegawai pegawai = new Pegawai("Jim", 30, 7000000);
        kantor.tambahPegawai(pegawai);
        assertTrue(kantor.getDaftarPegawai().contains(pegawai));
    }

    @Test
    public void testHapusPegawai() {
        kantor.hapusPegawai("Angela");
        List<Pegawai> pegawai = kantor.getDaftarPegawai();
        for (Pegawai p : pegawai) {
            assertNotEquals("Angela", p.getNama());
        }
    }

    @Test
    public void testUrutkanSesuaiGaji() {
        kantor.urutkanSesuaiGaji();
        List<Pegawai> pegawai = kantor.getDaftarPegawai();
        assertEquals("Kevin", pegawai.get(0).getNama());
        assertEquals("Angela", pegawai.get(1).getNama());
        assertEquals("Stanley", pegawai.get(2).getNama());
    }

    @Test
    public void testUrutkanSesuaiNama() {
        kantor.urutkanSesuaiNama();
        List<Pegawai> pegawai = kantor.getDaftarPegawai();
        assertEquals("Angela", pegawai.get(0).getNama());
        assertEquals("Kevin", pegawai.get(1).getNama());
        assertEquals("Stanley", pegawai.get(2).getNama());
    }

    @Test
    public void testGetSesuaiUmur() {
        List<Pegawai> pegawai = kantor.getSesuaiUmur(38);
        assertEquals(1, pegawai.size());
        assertEquals("Kevin", pegawai.get(0).getNama());
    }

}
