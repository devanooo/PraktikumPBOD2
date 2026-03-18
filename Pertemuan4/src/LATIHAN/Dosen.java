package LATIHAN;

public class Dosen extends Pegawai{
    protected int Tunjangan;
    protected String Fakultas;

    public Dosen(String NIP, String Nama, String TTL, String TMT, int GajiPokok, String Fakultas){
        super(NIP, Nama, TTL, TMT, GajiPokok);
        this.Fakultas = Fakultas;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas ; "+ Fakultas);
        
    }

}
