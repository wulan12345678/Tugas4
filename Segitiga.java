package Tugas4;

public class Segitiga extends Bangundatar {
    int alas;
    int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }


    @Override
    public float luas(){
        return this.alas * this.tinggi;
    }
}
