/* 
    Nama    : Devano Trestanto
    NIM     : 24060124140149
*/
public class Burung extends Anabul{
    Burung(){
        super();
    }

    Burung(String Nama){
        super(Nama);
    }

    @Override
    public String Gerak(){
        return "Terbang";
    }

    @Override
    public String Bersuara(){
        return "cuit";
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Gerak : " + this.Gerak());
        System.out.println("Bersuara : " + this.Bersuara());
    }

}
