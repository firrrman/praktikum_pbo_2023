package tugas;

import java.util.Scanner;

/**
 * Anggota Kelompok : Firman Hakim, Ahmad Kabir Rifa'i, Muhammad Kemal Ma'ruf
 * Kelas : Reguler D
 * Deskripsi Program : program ini berisi proram menampilkan printer/cetak nama.
 */

public class Latihan45Printer {
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }
    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void cetak() {
        for (int i = 0; i < jmlCetak; i++) {
            System.out.println((i + 1) + ". " + nama);
        }
    }
    public static void main(String[] args) {
        Latihan45Printer printer = new Latihan45Printer();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda : ");
        String namaAnda = scanner.nextLine();
        printer.setNama(namaAnda);
        
        System.out.print("Mau Cetak Berapa Kali? : ");
        int jumlahCetak = scanner.nextInt();
        printer.setJmlCetak(jumlahCetak);
        
   	    System.out.println("Nama Anda : " +namaAnda);
	    System.out.println("Hasil : ");
        
        printer.cetak();
        scanner.close();

        
    }
}
