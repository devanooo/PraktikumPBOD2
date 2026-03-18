/*
File : Persegi.java
Nama : Devano Trestanto
Tanggal : 10 Maret 2026
*/
public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(){
        super();
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4,warna,border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi : " + sisi);
    }

}
