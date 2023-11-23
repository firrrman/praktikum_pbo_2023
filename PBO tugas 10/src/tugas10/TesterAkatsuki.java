package tugas10;

/**
 * Anggota Kelompok : Firman Hakim, Ahmad Kabir Rifa'i, Muhammad Kemal Ma'ruf
 * Kelas : Reguler D
 * Deskripsi Program : program ini berisi program menampilkan 
 * data Anggota Clan Akatsuki
 */

/**Ketentuan :
 * Harus mengimplementasi konsep inheritance
 * Harus mengimplementasi konsep polimorphism
*/

class Akatsuki {
	protected String nama;
	protected String desaAsal;
	
	public Akatsuki(String nama, String desaAsal) {
		this.nama = nama;
		this.desaAsal = desaAsal;
	}
	public void kekuatan() {
		System.out.println("Nama : "+nama);
		System.out.println("Desa Asal : "+desaAsal);
	}	
}
class Pain extends Akatsuki {
	private String mataRinnegan;
	public Pain(String nama, String desaAsal, String mataRinnegan) {
		super(nama, desaAsal);
		this.mataRinnegan = mataRinnegan;	
	}
	public void kekuatan() {
		super.kekuatan();
		System.out.println("kekuatan : "+mataRinnegan);
	}
}
class Konan extends Akatsuki {
	private String kertas;
	public Konan(String nama, String desaAsal, String kertas) {
		super(nama, desaAsal);
		this.kertas = kertas;	
	}
	public void kekuatan() {
		super.kekuatan();
		System.out.println("kekuatan : "+kertas);
	}
}
class Sasori extends Akatsuki {
	private String boneka;
	public Sasori(String nama, String desaAsal, String boneka) {
		super(nama, desaAsal);
		this.boneka = boneka;	
	}
	public void kekuatan() {
		super.kekuatan();
		System.out.println("kekuatan : "+boneka);
	}
}
class Deidara extends Akatsuki {
	private String ledakan;
	public Deidara(String nama, String desaAsal, String ledakan) {
		super(nama, desaAsal);
		this.ledakan = ledakan;	
	}
	public void kekuatan() {
		super.kekuatan();
		System.out.println("kekuatan : "+ledakan);
	}
}
class Orochimaru extends Akatsuki {
	private String ular;
	public Orochimaru(String nama, String desaAsal, String ular) {
		super(nama, desaAsal);
		this.ular = ular;	
	}
	public void kekuatan() {
		super.kekuatan();
		System.out.println("kekuatan : "+ular);
	}
}
class Obito extends Akatsuki {
	private String tembusPandang;
	public Obito(String nama, String desaAsal, String tembusPandang) {
		super(nama, desaAsal);
		this.tembusPandang = tembusPandang;	
	}
	public void kekuatan() {
		super.kekuatan();
		System.out.println("kekuatan : "+tembusPandang);
	}
}
class Jetsu extends Akatsuki {
	private String membelahTubuh;
	public Jetsu(String nama, String desaAsal, String membelahTubuh) {
		super(nama, desaAsal);
		this.membelahTubuh = membelahTubuh;	
	}
	public void kekuatan() {
		super.kekuatan();
		System.out.println("kekuatan : "+membelahTubuh);
	}
}
class Kisame extends Akatsuki {
	private String pedangSamehada;
	public Kisame(String nama, String desaAsal, String pedangSamehada) {
		super(nama, desaAsal);
		this.pedangSamehada = pedangSamehada;	
	}
	public void kekuatan() {
		super.kekuatan();
		System.out.println("kekuatan : "+pedangSamehada);
	}
}
class Itachi extends Akatsuki {
	private String mataSaringgan;
	public Itachi(String nama, String desaAsal, String mataSaringgan) {
		super(nama, desaAsal);
		this.mataSaringgan = mataSaringgan;	
	}
	public void kekuatan() {
		super.kekuatan();
		System.out.println("kekuatan : "+mataSaringgan);
	}
}
class Kakuzu extends Akatsuki {
	private String abadi;
	public Kakuzu(String nama, String desaAsal, String abadi) {
		super(nama, desaAsal);
		this.abadi = abadi;	
	}
	public void kekuatan() {
		super.kekuatan();
		System.out.println("kekuatan : "+abadi);
	}
}
class Hidan extends Akatsuki {
	private String santet;
	public Hidan(String nama, String desaAsal, String santet) {
		super(nama, desaAsal);
		this.santet = santet;	
	}
	public void kekuatan() {
		super.kekuatan();
		System.out.println("kekuatan : "+santet);
	}
}
public class TesterAkatsuki {
	public static void main(String[] args) {
		System.out.println("---AKATSUKI---");
		System.out.println();
		Pain pain = new Pain("Pain", "Amegakure", "Mata Rinnegan");
		Konan konan = new Konan("Konan", "Amegakure", "Kertas");
		Sasori sasori = new Sasori("Sasori", "Sunagakure", "Boneka");
		Deidara deidara = new Deidara("Deidara", "Iwagakure", "Ledakan");
		Orochimaru orochimaru = new Orochimaru("Orochimaru", "Konoha", "Ular");
		Obito obito = new Obito("Obito", "Konoha", "Tembus Pandang");
		Jetsu jetsu = new Jetsu("Jetsu", "Tidak ada", "Membelah Diri");
		Kisame kisame = new Kisame("Kisame", "Kirigakure", "Air");
		Itachi itachi = new Itachi("Itachi", "Konoha", "Mata Saringgan");
		Kakuzu kakuzu = new Kakuzu("Kakuzu", "Takigakure", "Abadi");
		Hidan hidan = new Hidan("Hidan", "Yugakure", "Santet");
		
		pain.kekuatan();
		System.out.println();
		konan.kekuatan();
		System.out.println();
		sasori.kekuatan();
		System.out.println();
		deidara.kekuatan();
		System.out.println();
		orochimaru.kekuatan();
		System.out.println();
		obito.kekuatan();
		System.out.println();
		jetsu.kekuatan();
		System.out.println();
		kisame.kekuatan();
		System.out.println();
		itachi.kekuatan();
		System.out.println();
		kakuzu.kekuatan();
		System.out.println();
		hidan.kekuatan();
		System.out.println();
	}
}
