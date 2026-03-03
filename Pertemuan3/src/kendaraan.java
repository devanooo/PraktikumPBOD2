

public class kendaraan {
    private String noPlat;
    private String jenis;
    

    kendaraan(){
        jenis = "-";
        noPlat = "0";
    }

    kendaraan(String noPlat, String jenis){
        this.jenis = jenis;
        this.noPlat = noPlat;
    }   

    public String getJenis() {
        return jenis;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

}
