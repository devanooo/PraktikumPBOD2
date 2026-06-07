/* 
    Nama    : Devano Trestanto
    NIM     : 24060124140149
*/

public class Anjing extends Anabul {
    
    Anjing(){
        super();
    }

    Anjing(String Nama){
        super(Nama);
    }

    @Override
    public String Gerak(){
        return "Melata";
    }

    @Override
    public String Bersuara(){
        return "guk-guk";
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Gerak : " + this.Gerak());
        System.out.println("Bersuara : " + this.Bersuara());
    }

}
