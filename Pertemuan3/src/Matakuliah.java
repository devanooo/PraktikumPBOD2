


public class Matakuliah {
    private String idMatkul;
    private String nama;
    private int SKS;

    Matakuliah(){
        idMatkul = "0";
        nama = "0";
        SKS = 0;
    }

    Matakuliah(String idMatkul, String nama, int SKS){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.SKS = SKS;
    }

    public String getIdMatkul() {
        return idMatkul;
    }
    public String getNama() {
        return nama;
    }
    public int getSKS() {
        return SKS;
    }
    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setSKS(int sKS) {
        SKS = sKS;
    }
}
