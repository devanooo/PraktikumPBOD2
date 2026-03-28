package latihan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;    
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
    "dd-MM-yyyy", new Locale("id", "ID"));

    private DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    public String formatTanggal(LocalDate tanggal){
        return tanggal.format(formatter);
    }

    public Manusia(){
        counterMns++;
    }

    public Manusia(String nama,String tmk, String alamat, double pendapatan){
        this.nama = nama;
        tgl_mulai_kerja = LocalDate.parse(tmk, inputFormatter);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public static void setCounterMns(int counterMns) {
        Manusia.counterMns = counterMns;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public String getAlamat() {
        return alamat;
    }
    public static int getCounterMns() {
        return counterMns;
    }
    public String getNama() {
        return nama;
    }
    public double getPendapatan() {
        return pendapatan;
    }
    public LocalDate getTgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }

    public void cetakinfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + formatTanggal(tgl_mulai_kerja));
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("Jumlah Mahasiswa: " + counterMns);
    }

    public abstract int hitungMasaKerja();
}
