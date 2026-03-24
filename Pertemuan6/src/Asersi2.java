class Lingkaran{
    private double jarijari;
    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }

    public double hitungkeliling(){
        double keliling = 2 * Math.PI *jarijari;
        return keliling;
    }
}


public class Asersi2 {
    public static void main(String[] args) {
        double jarijari = 0;
        assert(jarijari>0):"Jari jari tidak boleh nol";
        Lingkaran L1 = new Lingkaran(jarijari);
        double kelilingLingkaran = L1.hitungkeliling();
        System.out.println("Keliling lingkaran : " + kelilingLingkaran);
    }
}
