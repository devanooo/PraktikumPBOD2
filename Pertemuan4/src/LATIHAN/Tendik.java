package LATIHAN;

public class Tendik extends Pegawai{
    
    protected static final int BUP = 55;
    public String bidang;

    
    public Tendik(String NIP, String Nama, String TTL, String TMT, int GajiPokok, String bidang){
        super(NIP,Nama,TTL,TMT,GajiPokok);
        this.bidang = bidang;
    }

    public double getTunjangan(){
        return 0.01 * getMasaKerja().getYears();
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Bidang : " + bidang);
        System.out.println("Tunjangan : " + getTunjangan());
    }
}
