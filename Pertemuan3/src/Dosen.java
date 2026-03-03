    /*  
    Nama File   : Titik.java
    Deskripsi   : berisi atribut dan method dalam class Dosen
    Pembuat     : Devano Trestanto
    Tanggal     : 03/03/2026
    */

public class Dosen {
    /*konstruktor*/ 
        private String nip;
        private String nama;
        private String prodi;

    /*Method */

    Dosen(){
        nip = "0000";
        nama = "----";
        prodi = "----";
    }

    Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNip(String nip){
        this.nip = nip;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
