    /*  
    Nama File   : MTitik.java
    Deskripsi   : berisi Main dan method dalam class Titik
    Pembuat     : Devano Trestanto
    Tanggal     : 24/02/2026
    */

public class Mtitik{
    public static void main(String[] args){
        Titik T1 = new Titik(); //membuat objek titik T1 (0,0)
        Titik T2 = new Titik(3,5);
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.getAbsis();
        T1.geser(3, 4);
        T1.printTitik();
        T2.printTitik();
        
        System.out.println("Kuadran : " + T1.getKuadran());
        System.out.println("Get Jarak Pusat : " + T1.getJarakPusat());
        System.out.println("Get Jarak: " + T1.getJarak(T2));

        T1.refleksiX();
        T1.refleksiY();
        
        
        
    }
} 
