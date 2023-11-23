package tugas10;

/**
 * Anggota Kelompok : Firman Hakim, Ahmad Kabir Rifa'i, Muhammad Kemal Ma'ruf
 * Kelas : Reguler D
 * Deskripsi Program : program ini berisi proram menampilkan 
 * inheritance class JumlahBilangan dan class selisihBilangan dari class Bilangan
 */

//Ketentuan : Isi konstruktor Bilangan()dengan x=3 dan y=4

class Bilangan {
    private int x;
    private int y;

    public Bilangan() {
        this.x = 3;
        this.y = 4;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class JumlahBilangan extends Bilangan {

    public void tampilHasilJumlah() {
        int hasilJumlah = getX() + getY();
        System.out.println("Hasil Perjumlahan : " + hasilJumlah);
    }
}

class SelisihBilangan extends Bilangan {

    public void tampilSelisih() {
        int selisih = getX() - getY();
        System.out.println("Hasil Selisih 3 - 4 : " + selisih);
    }
}

public class TesterBilangan {
    public static void main(String[] args) {
    	
        JumlahBilangan jumlahBilangan = new JumlahBilangan();
        jumlahBilangan.tampilHasilJumlah();

        SelisihBilangan selisihBilangan = new SelisihBilangan();
        selisihBilangan.tampilSelisih();
    }
}
