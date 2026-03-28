package latihan;

public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Satrio","01-04-2006","Jl. Seroja",1500000,"19830203200604");
        Pengusaha pe1 = new Pengusaha("Adhy","01-01-2000","Jl.Air",5500000,"000-556-");
        Petani pt1 = new Petani("Nugraha","09-01-1977","Jl. Bunga 3 Tembalang",5000000, "Bogor"); //kurang asalkota 
        PNS p2 = new PNS("Panji","01-04-2010","Jl. Samiaji 2 Bogor",10000000,"198004212010041002");  //kurang alamat

        p2.setAlamat("Jl. Panorama 111 Tembalang");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        p1.cetakinfo();
        pe1.cetakinfo();
        pt1.cetakinfo();
    }
}
