/*
File : BangunDatar.java
Nama : Devano Trestanto
Tanggal : 10 Maret 2026
*/


public class BangunDatar {
    protected int jmlSisi;
    protected String Warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
    }
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.Warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String warna) {
        Warna = warna;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna : " + Warna);
        System.out.println("Border : " + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}




