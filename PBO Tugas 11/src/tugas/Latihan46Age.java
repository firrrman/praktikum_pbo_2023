package tugas;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Anggota Kelompok : Firman Hakim, Ahmad Kabir Rifa'i, Muhammad Kemal Ma'ruf
 * Kelas : Reguler D
 * Deskripsi Program : program ini berisi proram menampilkan 
 * tahun kelahiran,tahun,umur, dan status umur
 */

public class Latihan46Age {
    private int yearBirth;
    private int yearNow;
    private String red = "\u001B[31m";

    public Latihan46Age(int yearNow) {
        this.yearNow = yearNow;
    }
    public int getYearBirth() {
        return yearBirth;
    }
    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
    public int getYearNow() {
        return yearNow;
    }
    public int hitungUmur() {
        return yearNow - yearBirth;
    }
    public String tandanyaKamu(int umur) {
        if (umur >= 0 && umur <= 5) {
            return red + "LAGI LUCU LUCUNYA";
        } else if (umur <= 10) {
            return red + "MASIH ANAK-ANAK";
        } else if (umur <= 13) {
            return red + "MASIH REMAJA";
        } else if (umur <= 19) {
            return red + "ALAY";
        } else if (umur <= 29) {
            return red + "LAGI GALAU NYARI JODOH";
        } else if (umur <= 35) {
            return red + "LAGI SIBUK NYARI UANG";
        } else if (umur <= 150) {
            return red + "SUDAH TUA";
        }  else {
            return red + "TIDAK TERDETEKSI DIKEHIDUPAN";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tahun kelahiran Anda: ");
        int tahunKelahiran = scanner.nextInt();
        System.out.println(" ");
        System.out.println("--Hasil Perhitungan Umur--");

        Calendar calendar = Calendar.getInstance();
        int tahunSekarang = calendar.get(Calendar.YEAR);

        Latihan46Age age = new Latihan46Age(tahunSekarang);
        age.setYearBirth(tahunKelahiran);
        int umur = age.hitungUmur();
        String statusUmur = age.tandanyaKamu(umur);

        System.out.println("Tahun Kelahiran Anda : " + tahunKelahiran);
        System.out.println("Hari Ini Tahun : " + tahunSekarang);
        System.out.println("Umur Kamu Sampai Hari Ini Adalah " + umur + " tahun");
        System.out.println("Status Umur : " + statusUmur);
        scanner.close();
    }
}
