package tugas;

import java.util.Scanner;

/**
 * Anggota Kelompok : Firman Hakim, Ahmad Kabir Rifa'i, Muhammad Kemal Ma'ruf
 * Kelas : Reguler D
 * Deskripsi Program : program ini berisi proram menampilkan data nilai mahasiswa.
 */

public class Latihan47NilaiMahasiswa {
    private double QUIZ;
    private double UTS;
    private double UAS;

    public Latihan47NilaiMahasiswa(double QUIZ, double UTS, double UAS) {
        this.QUIZ = QUIZ;
        this.UTS = UTS;
        this.UAS = UAS;
    }
    public double hitungNilaiAkhir() {
        return (0.2 * QUIZ) + (0.3 * UTS) + (0.5 * UAS);
    }
    public char hitungIndeksNilai(double nilaiAkhir) {
        if (nilaiAkhir >= 80) {
            return 'A';
        } else if (nilaiAkhir >= 68) {
            return 'B';
        } else if (nilaiAkhir >= 56) {
            return 'C';
        } else if (nilaiAkhir >= 45) {
            return 'D';
        } else {
            return 'E';
        }
    }
    public String getKeterangan(char indeks) {
        switch (indeks) {
            case 'A':
                return "Sangat Baik";
            case 'B':
                return "Baik";
            case 'C':
                return "Cukup";
            case 'D':
                return "Kurang";
            case 'E':
                return "Sangat Kurang";
            default:
                return "Indeks tidak valid";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("QUIZ = ");
        double QUIZ = input.nextDouble();
        System.out.print("UTS = ");
        double UTS = input.nextDouble();
        System.out.print("UAS = ");
        double UAS = input.nextDouble();
        
        System.out.println(" ");

        Latihan47NilaiMahasiswa mahasiswa = new Latihan47NilaiMahasiswa(QUIZ, UTS, UAS);

        double nilaiAkhir = mahasiswa.hitungNilaiAkhir();
        char indeks = mahasiswa.hitungIndeksNilai(nilaiAkhir);
        String keterangan = mahasiswa.getKeterangan(indeks);

        System.out.println("Nilai Akhir = " + nilaiAkhir);
        System.out.println(" ");
        System.out.println("Indeks = " + indeks);
        System.out.println("Keterangan = " + keterangan);
    }
}
