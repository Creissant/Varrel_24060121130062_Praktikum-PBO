/**
 * File      : Lingkaran.java		22/03/23
 * Penulis   : Varrel / 24060121130062
 * Deskripsi : Kelas implementasi IArea berupa
 *             cara menghitung luas lingkaran
 *
 */

import static java.lang.Math.PI;

public class Lingkaran implements IArea{
    public double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI * jejari * jejari;
    }
    
}
