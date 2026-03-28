package latihan;

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    String asal_kota;
    static int counterPetani = 0;

    public Petani(String Nama, String tmk, String alamat, double Pendapatan, String asal_kota){
        super(Nama, tmk, alamat, Pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public String getAsal_kota() {
        return asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja() {

        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 1;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakinfo() {
        super.cetakinfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}
