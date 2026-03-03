
public class MMahasiswa {
    public static void main(String[] args){
        Matakuliah PBO = new Matakuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        Matakuliah MBD = new Matakuliah("MBD", "Manajemen Basis Data", 3);
        kendaraan K1 = new kendaraan("F 1234 GAG", "motor");
        Mahasiswa M1 = new Mahasiswa();
        Dosen D1 = new Dosen("123","Andi", "informatika");

        M1.setNama("Jamal");
        M1.setNim("24060124140149");
        M1.setProdi("Informatika");

        M1.setKendaraan(K1);
        M1.setDosenwali(D1);
        M1.AddMatkul(MBD);
        M1.AddMatkul(PBO);
        M1.PrintDetailMhs();
        System.out.println(("Jumlah Mata Kuliah : " + M1.listMatkul.size()));
        System.out.println("Jumlah SKS Mata Kuliah: " + M1.JumlahSKS());
    }
}
