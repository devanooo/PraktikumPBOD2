public class Anjing extends Anabul {
    public String Nama;
    
    Anjing(){
        super();
    }

    Anjing(String Nama){
        super();
    }

    @Override
    public String Gerak(){
        return "Melata";
    }

    @Override
    public String Bersuara(){
        return "guk-guk";
    }

    public void setNama(String nama) {
        Nama = nama;
    }


}
