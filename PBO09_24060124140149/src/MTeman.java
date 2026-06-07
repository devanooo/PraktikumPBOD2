public class MTeman {
    public static void main(String[] args) {
        Teman<String> KoleksiTeman = new Teman<>(20);

        KoleksiTeman.addNama("Devano");
        KoleksiTeman.addNama("Vela");
        KoleksiTeman.addNama("Rama");
        KoleksiTeman.addNama("Lutpi");
        KoleksiTeman.addNama("Ali Maskam");
        KoleksiTeman.addNama("Atta");
        KoleksiTeman.addNama("Menza");
        KoleksiTeman.addNama("Nopal");
        KoleksiTeman.addNama("Azka");
        KoleksiTeman.addNama("Basil");
        KoleksiTeman.addNama("Perdi");
        KoleksiTeman.addNama("Dinduy");
        KoleksiTeman.addNama("Elza");
        KoleksiTeman.addNama("Marceng");
        KoleksiTeman.addNama("Ijat");
        KoleksiTeman.addNama("Hasta");
        KoleksiTeman.addNama("Ihsan");
        KoleksiTeman.addNama("opan");
        KoleksiTeman.addNama("Bayu");
        KoleksiTeman.addNama("Pe'i");


        System.out.println("ISmember bayu : " + KoleksiTeman.isMember("opan"));
        KoleksiTeman.showNama();
        


    }
}
