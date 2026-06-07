import java.util.ArrayList;

/**
 * File: LambdaList.java
 * Deskripsi: Implementasi lambda pada List, digunakan sebagai parameter
 *            pada method.
 */

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Kentung");
        mahasiswaList.add("Arel");
        mahasiswaList.add("Devano");
        mahasiswaList.add("rama");
        mahasiswaList.add("Kendal");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
