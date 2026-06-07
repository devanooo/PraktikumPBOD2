package Piaraan;

public class Mpiaraan {
    public static void main(String[] args) {
        Piaraan p = new Piaraan();

        p.enqueueAnabul(new Kucing("Kendal",2));
        p.enqueueAnabul(new Kucing("Ody",30));
        p.enqueueAnabul(new Kucing("Aryo",40));
        p.enqueueAnabul(new Anjing("Rama"));
        p.enqueueAnabul(new Burung("Joni"));
        p.enqueueAnabul(new Kembangtelon("Kembangtelon", 3));

        System.out.println("==ShowAnabul==");
        p.showAnabul();
        
        System.out.println("==ShowJenisAnabul==");
        p.showJenisAnabul();
        
        System.out.println("Nbelm : " + p.getNbelm());
        
        System.out.println("\nAnabul terdepan: " + p.getAnabul().getNama());

        System.out.println("==Dequeue==");
        
        Anabul keluar = p.dequeueAnabul();
        System.out.println("Dequeue: " + keluar.getNama());
        
        System.out.println("==Setelah Dequeue==");

        p.showAnabul();
    }
}
