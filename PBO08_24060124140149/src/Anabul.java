/* 
    Nama    : Devano Trestanto
    NIM     : 24060124140149
*/

public abstract class Anabul {
    public String Nama;

    Anabul(){
        this.Nama = " ";
    }

    Anabul(String nama){
        this.Nama = nama;
    }
    
    public String getNama() {
        return Nama;
    }
    
    public abstract String Gerak();

    public abstract String Bersuara();
    
    public void setNama(String nama) {
        Nama = nama;
    }

    public void printInfo(){
        System.out.println("Nama : " + this.Nama);
    }
}
