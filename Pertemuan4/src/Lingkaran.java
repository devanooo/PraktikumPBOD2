/*
File : Lingkaran.java
Nama : Devano Trestanto
Tanggal : 10 Maret 2026
*/
public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        super();
        setJmlSisi(0); 
    }

    public Lingkaran(double diameter, String warna, String border) {  
        this.jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}