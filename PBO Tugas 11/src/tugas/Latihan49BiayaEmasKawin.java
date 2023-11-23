package tugas;

/**
 * Anggota Kelompok : Firman Hakim, Ahmad Kabir Rifa'i, Muhammad Kemal Ma'ruf
 * Kelas : Reguler D
 * Deskripsi Program : program ini berisi proram menampilkan 
 * total biaya yang harus dikeluarkan oleh Hendi.
 */

public class Latihan49BiayaEmasKawin {
	private double hargaEmasPerGram;
	private double beratEmas;
	
	public Latihan49BiayaEmasKawin(double hargaEmasPerGram, double beratEmas) {
		this.hargaEmasPerGram = hargaEmasPerGram;
		this.beratEmas = beratEmas;
	}
	
	public double hitungTotalBiaya() {
		return hargaEmasPerGram * beratEmas;
	}
	public static void main(String[] args) {
		double hargaEmasPerGram = 570000;
		double beratEmas = 15.7;
		
		Latihan49BiayaEmasKawin hendi = new Latihan49BiayaEmasKawin(hargaEmasPerGram, beratEmas);
		
		double totalBiaya = hendi.hitungTotalBiaya();
		
		System.out.println("biaya yang harus dikeluarkan oleh Hendi adalah : Rp" + totalBiaya);
	}
}