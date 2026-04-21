public class mainpolimorfisme {
    public static void main(String[] args) throws Exception {
        Integer I = 20;
        double B = (double) I;
        Integer C = (int) B;
        System.out.println("Integer I : " +I);
        System.out.println("Convert I menjadi real : " + B);
        System.out.println("Convert kembali menjadi Integer : " + C);

        String X = "1234";
        String Y = "5678";
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("String X : " + X + "\n" + "String Y : " + Y);
        System.out.println("Z : " + Z);
        
        String P = "12.34";
        String Q = "56.78";
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        
        System.out.println("String Q : " + Q + "\n" + "String Q : " + Q);
        System.out.println("D : " + D);
        
        String S = "2023";
        Integer A = Integer.parseInt(S);
        System.out.println(A);
        
        String T = A.toString();
        System.out.println(T);
        

        Mahasiswa M1 = new Mahasiswa();
        Mahasiswa M2 = new Mahasiswa("1234", "Devano", "");
        
        System.out.println("==M1==");
        M1.printInfo();
        System.out.println("==M2==");
        M2.printInfo();
        
        
        System.out.println("==setelah setprogramstudi==");
        M1.setProgramStudi(M2);
        System.out.println("==M1==");
        

        Anjing A1 = new Anjing("Blacky");

        String suaraAnjing = A1.Bersuara();
        String gerakAnjing = A1.Gerak();

        System.out.println("Suara Anjing: " + suaraAnjing);
        System.out.println("Gerak Anjing : " + gerakAnjing);


        

    }
} 