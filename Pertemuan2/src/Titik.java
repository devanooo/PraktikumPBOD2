    /*  
    Nama File   : Titik.java
    Deskripsi   : berisi atribut dan method dalam class Titik
    Pembuat     : Devano Trestanto
    Tanggal     : 24/02/2026
    */

public class Titik{
    /******Atribut******/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /******Method******/
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    static int getCounterTitik(){
        return counterTitik;
    }
    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }
    
    //mengeset nilai absis dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset nilai ordinat dengan nilai baru x
    void setOrdinat(double y){
        ordinat = y;
    }
    
    //menggeser nilai absis dan rdinat titik masing masing sejauh x dan y;
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //getkuadran
    int getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        }
        else if (absis < 0 && ordinat > 0){
            return 2;
        }
        else if (absis  < 0 && ordinat < 0){
            return 3;
        }
        else 
            return 4;
    }

    //getJarakPusat
    double getJarakPusat(){
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    //getjarak(T: titik)
    double getJarak(Titik T){
        double selisihx = (absis - T.absis);
        double selisihy = (ordinat - T.ordinat);

        return Math.sqrt((selisihx * selisihx) + (selisihy * selisihy));
    }
    //refleksiX
    void refleksiX(){
        ordinat = -ordinat;
    }
    //refleksi Y
    void refleksiY(){
        absis = -absis;
    }

    Titik getRefleksiX(){
        return new Titik(this.absis,-this.ordinat);
    }
    Titik getRefleksiY(){
        return new Titik(-this.absis, this.ordinat);
    }

    //mencetak kordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

}