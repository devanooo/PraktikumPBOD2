import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<Matakuliah> listMatkul;
    private Dosen Dosenwali;
    private kendaraan Kendaraan;

    Mahasiswa(){
        nim = "0";
        nama = "-";
        prodi = "-";
        listMatkul = new ArrayList<>();
    }

    Mahasiswa(String nim, String nama, String prodi, ArrayList<Matakuliah> listMatkul, Dosen Dosenwali, kendaraan Kendaraan){
        this.nim = nim;
        this.nama =nama;
        this.prodi = prodi;
        this.listMatkul = listMatkul;
        this.Dosenwali = Dosenwali;
        this.Kendaraan = Kendaraan;
        
    }

    public void AddMatkul(Matakuliah newMatkul){
        listMatkul.add(newMatkul);
    }
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public Dosen getDosenwali() {
        return Dosenwali;
    }
    public kendaraan getKendaraan() {
        return Kendaraan;
    }
    public ArrayList<Matakuliah> getListMatkul() {
        return listMatkul;
    }
    public void setDosenwali(Dosen dosenwali) {
        Dosenwali = dosenwali;
    }
    public void setKendaraan(kendaraan kendaraan) {
        Kendaraan = kendaraan;
    }
    public void setListMatkul(ArrayList<Matakuliah> listMatkul) {
        this.listMatkul = listMatkul;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void PrintDetailMhs(){
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("Dosen Wali: " + Dosenwali.getNama());
        System.out.println("Kendaraan: " + Kendaraan.getJenis());

        int i;
        for(i = 0; i<listMatkul.size();i++){
            System.out.println("Matkul - " + (i + 1) + " :" + listMatkul.get(i).getNama());
        }

    }

    public int JumlahSKS(){
       int jmlSks = 0; 
       for(int i = 0; i < listMatkul.size();i++){
            jmlSks += listMatkul.get(i).getSKS();
        }

        return jmlSks;
    }
}
