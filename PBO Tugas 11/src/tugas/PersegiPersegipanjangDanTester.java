package tugas;
import java.util.Scanner;

/**
 * Anggota Kelompok : Firman Hakim, Ahmad Kabir Rifa'i, Muhammad Kemal Ma'ruf
 * Kelas : Reguler D
 * Deskripsi Program : program ini berisi proram menampilkan class persegi 
 * dan class Persegi panjang dengan menggunakan class tester.
 */

class Persegi {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    public double getSisi() {
        return sisi;
    }
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    public double hitungKeliling() {
        return 4 * sisi;
    }
    public double hitungLuas() {
        return sisi * sisi;
    }
}

class PersegiPanjang extends Persegi {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        super(lebar);
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    public double hitungLuas() {
        return panjang * lebar;
    }
}

public class PersegiPersegipanjangDanTester {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        double sisiPersegi = scanner.nextDouble();
        Persegi persegi1 = new Persegi(sisiPersegi);
        System.out.println("Keliling Persegi: " + persegi1.hitungKeliling());
        Persegi persegi2 = new Persegi(sisiPersegi);
        System.out.println("Luas Persegi: " + persegi2.hitungLuas());
        
        System.out.println(" ");

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjangPersegiPanjang = scanner.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebarPersegiPanjang = scanner.nextDouble();
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang1.hitungKeliling());
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang2.hitungLuas());
        scanner.close();
    }
}
