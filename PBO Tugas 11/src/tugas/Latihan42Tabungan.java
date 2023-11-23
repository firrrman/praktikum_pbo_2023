package tugas;

import java.util.Scanner;

/**
 * Anggota Kelompok : Firman Hakim, Ahmad Kabir Rifa'i, Muhammad Kemal Ma'ruf
 * Kelas : Reguler D
 * Deskripsi Program : program ini berisi proram menampilkan data tabungan.
 */

public class Latihan42Tabungan {
    private int saldo;

    public Latihan42Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int ambilUang(int jumlah) {
            saldo -= jumlah;
            return jumlah;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--Penarikan Uang--");
        System.out.println(" ");

        System.out.print("Masukkan Saldo awal : ");
        int saldoAwal = input.nextInt();
        
        Latihan42Tabungan tabungan = new Latihan42Tabungan(saldoAwal);

        System.out.print("Jumlah Uang Yang Diambil : ");
        int jumlah = input.nextInt();

        int uangDiambil = tabungan.ambilUang(jumlah);
        
        System.out.println("Saldo Anda Sekarang : " + tabungan.saldo);
    }
}

