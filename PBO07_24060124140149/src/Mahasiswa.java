public class Mahasiswa {
    public String NIM;
    public String Nama;
    public String Programstudi;

    Mahasiswa(){
        NIM = "-999";
        Nama = " ";
        Programstudi = "n/a";
    }

    Mahasiswa(String NIM, String Nama, String Programstudi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }
    public void setProgramStudi(){
        this.Programstudi = "Kosong";
    }
    public void setProgramStudi(String x){
        this.Programstudi = x;
    }

    public void setProgramStudi(Mahasiswa mhslain){
        this.Programstudi = mhslain.Programstudi;
    }

    public void setNIM(String Nim) {
        NIM = Nim;
    }

    public void setNama(String nama) {
        Nama = nama;
    }
    
    public void setProgramstudi(String programstudi) {
        Programstudi = programstudi;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }
    public String getProgramstudi() {
        return Programstudi;
    }

    public void printInfo(){
        System.out.println("NIM: " + this.NIM);
        System.out.println("Nama: " + this.Nama);
        System.out.println("Program Studi: " + this.Programstudi);
    }
}
