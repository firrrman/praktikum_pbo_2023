package tugas;
import java.util.Scanner;

/**
 * Anggota Kelompok : Firman Hakim, Ahmad Kabir Rifa'i, Muhammad Kemal Ma'ruf
 * Kelas : Reguler D
 * Deskripsi Program : program ini berisi proram menampilkan massa jenis kubus.
 */

public class Latihan41Kubus {
    private int sisi; 
    private int massa; 

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int hitungVolume() {
        return sisi * sisi * sisi;
    }

    public int hitungMassaJenis() {
        return massa / (sisi * sisi * sisi);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Latihan41Kubus kubus = new Latihan41Kubus();
        
        System.out.println("--Massa Jenis Kubus--");
        System.out.println(" ");

        
        System.out.print("Sisi = ");
        int sisi = input.nextInt();
        kubus.setSisi(sisi);

        System.out.print("Massa = ");
        int massa = input.nextInt();
        kubus.setMassa(massa);
        System.out.println(" ");
        
        System.out.println("Hasil Perhitungan");

        int volume = kubus.hitungVolume();
        int massaJenis = kubus.hitungMassaJenis();

        System.out.println("Volume = " + volume);
        System.out.println("Massa Jenis = " + massaJenis);
    }
}
