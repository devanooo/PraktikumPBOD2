package No4;

public class MCivitasAkademika {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("Dr. Budi", "301");
        Dosen d2 = new Dosen("Dr. Siti", "302");

        Mahasiswa m1 = new Mahasiswa("Saburo", "1001");
        Mahasiswa m2 = new Mahasiswa("Adit", "1002");
        Mahasiswa m3 = new Mahasiswa("Al", "1003");
        Mahasiswa m4 = new Mahasiswa("Umar", "1004");
        Mahasiswa m5 = new Mahasiswa("KENDAL", "1005");

        m1.setDosenWali(d2);
        m2.setDosenWali(d1);
        m3.setDosenWali(d2);
        m4.setDosenWali(d2);
        m5.setDosenWali(d1);

        System.out.println("Data Mahasiswa");
        m1.printInfoMahasiswa();
        m2.printInfoMahasiswa();
        m3.printInfoMahasiswa();
        m4.printInfoMahasiswa();
        m5.printInfoMahasiswa();
        
        Seminar seminar1 = new Seminar();
        
        seminar1.registrasi(m1);
        seminar1.registrasi(m2);
        seminar1.registrasi(m3);
        seminar1.registrasi(m4);
        seminar1.registrasi(m5);
        
        System.out.println("Total Peserta : " + seminar1.countPeserta());
        
        System.out.println("\nDaftar Peserta : ");
        seminar1.tampilPeserta();

        System.out.println("\nJumlah Peserta Kategori Mahasiswa: " + seminar1.countMahasiswa());
        
    }
}
