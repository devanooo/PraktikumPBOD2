import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Latihan {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("Kentung","01");
        mahasiswaMap.put("Devano","02");
        mahasiswaMap.put("Vela","03");
        mahasiswaMap.put("Rama","04");

        mahasiswaMap.forEach((nama, nim) -> System.out.println("=======\nNama : " + nama + "\n" + "NIM : "+ nim ));
    }
}
