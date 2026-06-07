import java.util.ArrayList;

public class Teman<T> {
    private int nbelm;
    private ArrayList<T> Lnama;
    

    public Teman(int nbelm){
        Lnama = new ArrayList<>();
        this.nbelm = 0;

        for(int i = 0; i< nbelm; i++){
            Lnama.add(null);
        }
    }

    public int getNbelm() {
        return nbelm;
    }

    public T getNama(int i){
        return Lnama.get(i);
    }

    public void addNama(T Nama){
        setNama(nbelm, Nama);
        nbelm++;
    }
    
    public void setNama(int index, T Nama){
        Lnama.set(index, Nama);
    }

    public void delNama(T Nama){
        for(int i = 0; i < nbelm; i++){
            if(getNama(i) == Nama){
                for(int j = i; j < nbelm-2; j++){
                    setNama(j, getNama(j+1));
                }
            }
        }        
        nbelm--;
    }

    public boolean isMember(T Nama){
        boolean ketemu = false;

        for(int i = 0; i < nbelm; i++){
            if(getNama(i) == Nama){
                ketemu = true;
            }
        }

        return ketemu;
    }

    public void gantiNama(T nama, T namabaru){
        if(isMember(nama)){
            for(int i = 0; i < nbelm; i++){
                if(getNama(i) == nama){
                    setNama(i, namabaru);
                }
            }
        }
    }

    public void showNama(){
        for(int i = 0; i <nbelm; i++){
            System.out.println(getNama(i));
        }
    }

    
    
}
