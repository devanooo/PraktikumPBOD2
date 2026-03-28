package latihan;
import java.time.*;
public class PNS extends Manusia implements Pajak {
    String NIP;
    static int counterPNS = 0;

    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String NIP){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.NIP = NIP;
        counterPNS++;
    }

    public void setNIP(String nIP) {
        NIP = nIP;
    }

    public String getNIP() {
        return NIP;
    }
    
    public static int getCounterPNS() {
        return counterPNS;
    }
    
    @Override
    public void cetakinfo() {
        super.cetakinfo();
        System.out.println("NIP: "+ NIP);
    }
    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 9;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

}
