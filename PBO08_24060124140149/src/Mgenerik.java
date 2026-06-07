public class Mgenerik {
    public static void main(String[] args) {
        try{
            Datum<Kucing> D1;
            Datum<Kucing> D2;
            Datum<Anjing> D3;
            Datum<Integer> a;
            Datum<Integer> b;
            Datum<String> s1;
            Datum<String> s2;
            Data<Anabul> KelompokAnabul;
            Data<Kucing> KelompokKucing;
            
            D1 = new Datum<>();
            D2 = new Datum<>();
            D3 = new Datum<>();
            a = new Datum<>();
            b = new Datum<>();
            s1 = new Datum<>();
            s2 = new Datum<>();
            KelompokAnabul = new Data<>();
            KelompokKucing = new Data<>();


            D1.setIsi(new Anggora("Kucing", 40));
            D2.setIsi(new Kembangtelon("Yanto", 150));
            D3.setIsi(new Anjing("Anjing"));

            a.setIsi(6);
            b.setIsi(3);
            s1.setIsi("Nasi");
            s2.setIsi("Goreng");
            
                        /* Tukar Integer */
            
            System.out.println("\n");
            System.out.println("==Prosedur Tukar==");
            System.out.println("a = " + a.getIsi());
            System.out.println("b = " + b.getIsi());
            
            OperatorGenerik.Tukar(a, b);
            
            System.out.println("==Setelah Tukar==");
            System.out.println("a = " + a.getIsi());
            System.out.println("b = " + b.getIsi());
            
                    /* Tukar String */           
            
            System.out.println("\n");
            System.out.println("==Prosedur Tukar String==");
            System.out.println("s1 = " + s1.getIsi());
            System.out.println("s2 = " + s2.getIsi());
            
            OperatorGenerik.Tukar(s1, s2);
            
            System.out.println("==Setelah Tukar==");
            System.out.println("s1 = " + s1.getIsi());
            System.out.println("s2 = " + s2.getIsi());
            
                        /* Tukar Anabul */
            
            System.out.println("\n");
            System.out.println("==Prosedur Tukar Anabul==");
            System.out.println("Kucing 1 = " + D1.getIsi().getNama());
            System.out.println("Kucing 2 = " + D2.getIsi().getNama());
            
            OperatorGenerik.Tukar(D1,D2);

            System.out.println("==Setelah Tukar==");
            System.out.println("Kucing 1 = " + D1.getIsi().getNama());
            System.out.println("Kucing 2 = " + D2.getIsi().getNama());
            
                        /* Bobot2 */
            
            System.out.println("\n");
            System.out.println("==Bobot2==" + D1.getIsi().getBobot());
            
            double bbt2 = OperatorGenerik.Bobot2(D1.getIsi(), D2.getIsi());
            
            System.out.println("Kucing 1 = " + D1.getIsi().getBobot());
            System.out.println("Kucing 2 = " + D2.getIsi().getBobot());
            System.out.println("TotalBobot = " + bbt2);
            
            /* == Data == */
            KelompokAnabul.setIsi(1, new Anjing("Yono the Dog"));
            KelompokAnabul.setIsi(2, new Anjing("Raffi the Dog"));
            KelompokAnabul.setIsi(3, new Anggora("Ujang the anggoras", 165));
            
            //Kelompok Kucing
            KelompokKucing.setIsi(1, new Anggora("Kendal the kucing", 23));
            KelompokKucing.setIsi(2, new Kembangtelon("Zhafari the kembangtlons", 20));
            KelompokKucing.setIsi(3, new Kembangtelon("Odi the kembangtlons the second", 19));
            
            // GetIsi
            System.out.println("\n");
            System.out.println("GetIsi KelompokAnabul posisi 3: " + KelompokAnabul.getIsi(3).getNama());
            System.out.println("GetIsi KelompokAnabul posisi 1: " + KelompokAnabul.getIsi(1).getNama());
            
            System.out.println("\n");
            System.out.println("GetIsi KelompokKucing posisi 2: " + KelompokKucing.getIsi(2).getNama());
            System.out.println("GetIsi KelompokKucing posisi 3: " + KelompokKucing.getIsi(3).getNama());
            

        } catch(Exception e){
            System.out.println("error nih : " + e.getMessage());
        }
        



    }
}
