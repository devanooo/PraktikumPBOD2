public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar B1 = new Persegi(10, "Red", "solid");
        BangunDatar P1 = new Persegi(10, "Hitam", "Solid");
        Persegi P2 = new Persegi(5, "Biru", "Solid");
        
        BangunDatar L1 = new Lingkaran(7.0, "Ungu", "Putus-putus");
        Lingkaran L2 = new Lingkaran (14.0, "Biru","Solid");
        
        B1.printInfo();
        P1.printInfo();
        P2.printInfo();
        L1.printInfo();
        L2.printInfo();
    }
}