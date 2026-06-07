package No4;

public abstract class Civitasakademika {
    private String Nama;

    public Civitasakademika(String Nama){
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public abstract String getNomor();
}
