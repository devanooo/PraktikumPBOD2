package LATIHAN;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Pegawai {
    protected String NIP;
    protected String Nama;
    protected LocalDate TTL;
    protected LocalDate TMT; //terhitung mulai tanggal
    protected int GajiPokok;
    
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
    "d MMMM yyyy", new Locale("id", "ID"));
        
    public Pegawai(String NIP, String Nama, String TTL, String TMT, int GajiPokok ){
        this.NIP = NIP;
        this.Nama = Nama;
        this.TTL = LocalDate.parse(TTL,formatter);
        this.TMT = LocalDate.parse(TMT, formatter);
        this.GajiPokok = GajiPokok;
    }

    public Period getMasaKerja(){
        return Period.between(TMT, LocalDate.now());
    }

    public String getMasaKerjaDetail(){
        Period x = getMasaKerja();
        return x.getYears() + " Tahun " + x.getMonths()+ " Bulan";
    }

    public String formatTanggal(LocalDate tanggal){
        return tanggal.format(formatter);
    }

    public LocalDate getTanggalPensiun(int BUP) {
    LocalDate pensiun = TTL.plusYears(BUP);
    return pensiun.plusMonths(1).withDayOfMonth(1);
    }

    public void printInfo(){
        System.out.println("Nama : "+ Nama);
        System.out.println("NIP: "+ NIP);
        System.out.println("TTL : "+ formatTanggal(TTL));
        System.out.println("TMT : "+ formatTanggal(TMT));
        System.out.println("Gaji Pokok : Rp "+ GajiPokok +",00" );
        System.out.println("Masa Kerja: " + getMasaKerjaDetail());
        
    }

}  
