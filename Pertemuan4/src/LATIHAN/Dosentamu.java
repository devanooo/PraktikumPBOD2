package LATIHAN;

import java.time.LocalDate;

public class Dosentamu extends Dosen{
    protected String NIDK;
    protected LocalDate tanggalBerakhir;

    public Dosentamu(String NIP, String Nama, String TTL, String TMT, int GajiPokok, String Fakultas, String NIDK, LocalDate tanggalBerakhir){
        super(NIP, Nama,TTL,TMT, GajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.tanggalBerakhir = tanggalBerakhir;
    }

    public double getTunjangan(){
        return 0.025 * GajiPokok;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Tanggal Berakhir: " + formatTanggal(tanggalBerakhir));
        System.out.println("Tunjangan : " + getTunjangan());
    }
}
