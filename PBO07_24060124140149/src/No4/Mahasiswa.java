package No4;

public class Mahasiswa extends Civitasakademika{ 
    private String nim;
    private Dosen dosenWali;

    public Mahasiswa(String nama, String nim){
        super(nama);
        this.nim = nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public String getNim() {
        return nim;
    }

    
    @Override
    public String getNomor() {
    
        return this.nim;
    }

    public void printInfoMahasiswa(){
        System.out.println("NIM : " + getNomor());
        System.out.println("Nama Mahasiswa : " + getNama());
        System.out.println("Dosen Wali : " + getDosenWali());
        

    }
}
