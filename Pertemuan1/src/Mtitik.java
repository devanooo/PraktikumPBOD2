    /*  
    Nama File   : MTitik.java
    Deskripsi   : berisi Main dan method dalam class Titik
    Pembuat     : Devano Trestanto
    Tanggal     : 20/02/2026
    */

public class Mtitik{
    public static void main(String[] args){
        Titik T1 = new Titik(); //membuat objek titik T1 (0,0)
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
    }
} 
