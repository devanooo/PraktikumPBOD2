package No4;

public class Seminar {
    private int banyakPeserta;
    private int kapasitas = 100;
    private Civitasakademika[] peserta;

    public Seminar(){
        this.peserta = new Civitasakademika[kapasitas];
        this.banyakPeserta = 0;
    }

    public int countPeserta(){
        return banyakPeserta;
    }

    public void registrasi(Civitasakademika peserta){
        if(banyakPeserta < kapasitas){
            this.peserta[banyakPeserta] = peserta;
            this.banyakPeserta++;
        }
    }

    public void tampilPeserta(){
        for(int i = 0; i < banyakPeserta; i++){
            System.out.println("Nomor: " + peserta[i].getNomor() + "Nama : " + peserta[i].getNama());
        }
    }

    public int countMahasiswa(){
        int count = 0;
        for(int i = 0; i < banyakPeserta; i++){
            if(peserta[i] instanceof Mahasiswa){
                count++;
            }
        }
        return count;
    }
}
