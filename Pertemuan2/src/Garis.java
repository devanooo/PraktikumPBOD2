    /*  
    Nama File   : Garis.java
    Deskripsi   : berisi atribut dan method dalam class Garis
    Pembuat     : Devano Trestanto
    Tanggal     : 02/03/2026
    */


public class Garis {
    /*kontstruktor*/
    Titik awal;
    Titik akhir;
    static int counterGaris = 0;
   /*method */

   Garis(Titik awal, Titik akhir){
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
   }

   public Garis(){
        awal = new Titik(0,0);
        akhir = new Titik(1,1);
   }
    
   static int getCounterGaris(){
        return counterGaris;
   }
   public Titik getTawal(){
        return this.awal;
   }

   public Titik getTakhir(){
        return this.akhir;
   }

   public double getPanjangGaris(){
        return getTawal().getJarak(getTakhir());
   }

   public double getGradien(){
          return Math.abs(getTakhir().getOrdinat() - getTawal().getOrdinat()) 
          / Math.abs(getTakhir().getAbsis() - getTawal().getAbsis());
   }

   public Titik getTitikTengah(){
          Titik tengah = new Titik(((getTawal().getAbsis() + getTakhir().getAbsis())/2),
                                   ((getTawal().getOrdinat() + getTakhir().getOrdinat())/2));
          return tengah;
   }

   public boolean isSejajar(Garis G){
          return getGradien() == G.getGradien();
   }

   public boolean isTegakLurus(Garis G){
          return getGradien() * G.getGradien() == -1;
   }

   public void PrintGaris(){
     System.out.println(getTawal());
     System.out.println(getTakhir());
   }

   public void PrintPersamaan(){
     double m = getGradien();
     double c = getTawal().getOrdinat() - getGradien() * getTawal().getAbsis();
     System.out.println("y = " + m + "x + " + c);
   }
}
