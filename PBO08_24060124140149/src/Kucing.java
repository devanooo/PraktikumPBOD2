/* 
    Nama    : Devano Trestanto
    NIM     : 24060124140149
*/

public class Kucing extends Anabul {
    private double bobot;

    Kucing(){
        
    }

    Kucing(String Nama, double bobot){
        super(Nama);
        this.bobot = bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public String Gerak(){
        return "Melata";
    }

    @Override
    public String Bersuara(){
        return "Meong";
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Gerak : " + this.Gerak());
        System.out.println("Bersuara : " + this.Bersuara());
    }
}
