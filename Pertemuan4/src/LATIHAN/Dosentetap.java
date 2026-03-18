package LATIHAN;

public class Dosentetap extends Dosen{
    protected String NIDN;
    protected static final int BUP = 65;

    public Dosentetap(String NIP, String Nama, String TTL, String TMT, int GajiPokok, String Fakultas, String NIDN){
        super(NIP,Nama, TTL, TMT, GajiPokok,Fakultas);
        this.NIDN = NIDN;
    }

    public double getTunjangan(){
        return 0.02 * getMasaKerja().getYears();
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Tanggal Pensiun: " + formatTanggal(getTanggalPensiun(BUP)));
        System.out.println("Tunjangan : 2% x" + getMasaKerja().getYears() + " x " + getTunjangan() + " = Rp " + getTunjangan() * GajiPokok);
    }

}
