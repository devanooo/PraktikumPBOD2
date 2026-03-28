package LATIHAN;

public class MPegawai {
    public static void main(String[] args) {
        Dosentetap yanto = new Dosentetap("001", "Yanto", "5 Mei 1990", "1 Januari 2015", 5000000, "Informatika", "12345");

        yanto.printInfo();
        System.out.println("\n");

        Dosentamu ahmad = new Dosentamu("001", "Yanto", "19 Maret 2005", "2 Maret 2015", 20000000, "Fakultas Ikan", "201312", java.time.LocalDate.of(2026, 12, 2));

        System.out.println("\n");
        ahmad.printInfo();

        Tendik PakBadrul = new Tendik("003", "Badrul", "20 Maret 1988", "1 Februari 2012", 3000000, "Akademik");
        
        System.out.println("\n");
        PakBadrul.printInfo();
    }
}
 