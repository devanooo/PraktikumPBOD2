package No4;

public class Dosen extends Civitasakademika {
    private String nip;

    public Dosen(String nama, String nip){
        super(nama);
        this.nip = nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public String getNomor(){
        return this.nip;
    }
    
}
