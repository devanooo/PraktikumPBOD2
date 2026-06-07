

public class Data<T> {
    private T[] wadah;
    private int nbelm;

    public Data(){
        this.wadah = (T[]) new Object[100];   
        this.nbelm = 0;
    }

    public T getIsi(int posisi) {
        if (posisi < 1 || posisi > 100) {
            throw new IllegalArgumentException("Parameter harus dalam rentang 1..100.");
        }

        return wadah[posisi - 1];
    }

    public void setIsi(int posisi, T obj) {
        if (posisi < 1 || posisi > 100) {
            throw new IllegalArgumentException("Parameter harus dalam rentang 1..100.");
        }

        this.wadah[posisi - 1] = obj;
        this.nbelm++;
    }

    public int getSize(){
        return this.nbelm;
    }


   
}
