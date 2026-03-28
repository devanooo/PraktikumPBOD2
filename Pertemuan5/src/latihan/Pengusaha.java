package latihan;

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak{
    String NPWP;
    static int counterPengusaha = 0;

    public Pengusaha(String nama, String tmk, String alamat, int pendapatan, String NPWP){
        super(nama, tmk, alamat, counterMns);
        this.NPWP = NPWP;
        counterPengusaha++;
    }

    public void setNPWP(String nPWP) {
        NPWP = nPWP;
    }

    public String getNPWP() {
        return NPWP;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 4;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakinfo() {
        super.cetakinfo();
        System.out.println("NPWP : " + NPWP);
    }
}


