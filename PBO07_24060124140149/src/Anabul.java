public abstract class Anabul {
    public String Nama;

    Anabul(){
        this.Nama = " ";
    }

    Anabul(String nama){
        this.Nama = nama;
    }
    
    public abstract String Gerak();

    public abstract String Bersuara();
    
    public void setNama(String nama) {
        Nama = nama;
    }
}
