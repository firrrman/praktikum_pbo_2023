package tugas;
import java.util.Scanner;

/**
 * Anggota Kelompok : Firman Hakim, Ahmad Kabir Rifa'i, Muhammad Kemal Ma'ruf
 * Kelas : Reguler D
 * Deskripsi Program : program ini berisi proram menampilkan kuat arus dan hambatan.
 */

public class Latihan44Baterai {
    private float kuatArus;
    private float hambatan;

    public Latihan44Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }
    public float getKuatArus() {
        return kuatArus;
    }
    public float getHambatan() {
        return hambatan;
    }
    public float hitungTegangan() {
        float tegangan = kuatArus * hambatan;
        return tegangan;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Hukum Ohm--");
        System.out.println(" ");

        System.out.print("Kuat Arus : ");
        float current = scanner.nextFloat();

        System.out.print("Hambatan : ");
        float resistance = scanner.nextFloat();

        Latihan44Baterai battery = new Latihan44Baterai(current, resistance);

        System.out.println("Voltage (V): " + battery.hitungTegangan() + " volt");
    }
}
