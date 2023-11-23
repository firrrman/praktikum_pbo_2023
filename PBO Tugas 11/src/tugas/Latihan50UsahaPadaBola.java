package tugas;

/**
 * Anggota Kelompok : Firman Hakim, Ahmad Kabir Rifa'i, Muhammad Kemal Ma'ruf
 * Kelas : Reguler D
 * Deskripsi Program : program ini berisi proram menampilkan energi kinetik dan usaha pada bola.
 */

public class Latihan50UsahaPadaBola {
    private double massaBola;
    private double kecepatanAkhir;

    public Latihan50UsahaPadaBola(double massaBola, double kecepatanAkhir) {
        this.massaBola = massaBola;
        this.kecepatanAkhir = kecepatanAkhir;
    }
    public double hitungEnergiKinetikAkhir() {
        return 0.5 * massaBola * Math.pow(25, 2);
    }
    public double hitungUsaha() {
        double energiKinetikAwal = 0;
        double energiKinetikAkhir = hitungEnergiKinetikAkhir();
        double perubahanEnergiKinetik = energiKinetikAkhir - energiKinetikAwal;
        return perubahanEnergiKinetik;
    }
    public static void main(String[] args) {
        double massa = 0.145;
        double kecepatan = 25.0;

        Latihan50UsahaPadaBola bola = new Latihan50UsahaPadaBola(massa, kecepatan);

        double energiKinetikAkhir = bola.hitungEnergiKinetikAkhir();

        double usaha = bola.hitungUsaha();

        System.out.println("Massa bola : " + massa + " kg");
        System.out.println("Kecepatan akhir : " + kecepatan + " m/s");
        System.out.println(" ");
        System.out.println("Jawab : ");
        System.out.println("a. Energi Kinetik Akhir : " + energiKinetikAkhir + " joule");
        System.out.println("b. Usaha yang dilakukan : " + usaha + " joule");
    }
}

