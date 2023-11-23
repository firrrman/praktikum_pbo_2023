package tugas10;

/**
 * Anggota Kelompok : Firman Hakim, Ahmad Kabir Rifa'i, Muhammad Kemal Ma'ruf
 * Kelas : Reguler D
 * Deskripsi Program : program ini berisi program menampilkan 
 * data nama karakter anime Detective Conan
 */

/**Ketentuan :
 * Harus mengimplementasi konsep inheritance
 * Harus mengimplementasi konsep polimorphism
*/

class DetectiveConan {
	protected String nama;
	protected String jenisKelamin;
	
	public DetectiveConan(String nama, String jenisKelamin) {
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
	}
	public void keterangan() {
		System.out.println("Nama : "+nama);
		System.out.println("Jenis Kelamin : "+jenisKelamin);
	}	
}
class ShinichiKudo extends DetectiveConan {
	private String pelajar;
	public ShinichiKudo(String nama, String jenisKelamin, String pelajar) {
		super(nama, jenisKelamin);
		this.pelajar = pelajar;	
	}
	public void keterangan() {
		super.keterangan();
		System.out.println(pelajar);
	}
}
class AiHabara extends DetectiveConan {
	private String namaAsli;
	public AiHabara(String nama, String jenisKelamin, String namaAsli) {
		super(nama, jenisKelamin);
		this.namaAsli = namaAsli;	
	}
	public void keterangan() {
		super.keterangan();
		System.out.println(namaAsli);
	}
}
class MitsuhikoTsuburaya extends DetectiveConan {
	private String hobi;
	public MitsuhikoTsuburaya(String nama, String jenisKelamin, String hobi) {
		super(nama, jenisKelamin);
		this.hobi = hobi;	
	}
	public void keterangan() {
		super.keterangan();
		System.out.println(hobi);
	}
}
class AyumiYoshida extends DetectiveConan {
	private String detektif;
	public AyumiYoshida(String nama, String jenisKelamin, String detektif) {
		super(nama, jenisKelamin);
		this.detektif = detektif;	
	}
	public void keterangan() {
		super.keterangan();
		System.out.println(detektif);
	}
}
class GentaKojima extends DetectiveConan {
	private String makan;
	public GentaKojima(String nama, String jenisKelamin, String makan) {
		super(nama, jenisKelamin);
		this.makan = makan;	
	}
	public void keterangan() {
		super.keterangan();
		System.out.println(makan);
	}
}
class HirosiAgasa extends DetectiveConan {
	private String cerdas;
	public HirosiAgasa(String nama, String jenisKelamin, String cerdas) {
		super(nama, jenisKelamin);
		this.cerdas = cerdas;	
	}
	public void keterangan() {
		super.keterangan();
		System.out.println(cerdas);
	}
}
class EriKisaki extends DetectiveConan {
	private String ibu;
	public EriKisaki(String nama, String jenisKelamin, String ibu) {
		super(nama, jenisKelamin);
		this.ibu = ibu;	
	}
	public void keterangan() {
		super.keterangan();
		System.out.println(ibu);
	}
}
class KogoroMouri extends DetectiveConan {
	private String ayah;
	public KogoroMouri(String nama, String jenisKelamin, String ayah) {
		super(nama, jenisKelamin);
		this.ayah = ayah;	
	}
	public void keterangan() {
		super.keterangan();
		System.out.println(ayah);
	}
}
class RanMouri extends DetectiveConan {
	private String cantik;
	public RanMouri(String nama, String jenisKelamin, String cantik) {
		super(nama, jenisKelamin);
		this.cantik = cantik;	
	}
	public void keterangan() {
		super.keterangan();
		System.out.println(cantik);
	}
}
class SonokoSuzuki extends DetectiveConan {
	private String kaya;
	public SonokoSuzuki(String nama, String jenisKelamin, String kaya) {
		super(nama, jenisKelamin);
		this.kaya = kaya;	
	}
	public void keterangan() {
		super.keterangan();
		System.out.println(kaya);
	}
}
class HeijiHattori extends DetectiveConan {
	private String rival;
	public HeijiHattori(String nama, String jenisKelamin, String rival) {
		super(nama, jenisKelamin);
		this.rival = rival;	
	}
	public void keterangan() {
		super.keterangan();
		System.out.println(rival);
	}
}
class KazuhaToyama extends DetectiveConan {
	private String romantis;
	public KazuhaToyama(String nama, String jenisKelamin, String romantis) {
		super(nama, jenisKelamin);
		this.romantis = romantis;	
	}
	public void keterangan() {
		super.keterangan();
		System.out.println(romantis);
	}
}
public class TesterDetectiveConan {
	public static void main(String[] args) {
		System.out.println("---DETECTIVE CONAN---");
		System.out.println();
		ShinichiKudo a = new ShinichiKudo("Conan Edogawa", "Laki Laki","Seorang Pelajar SMA Teitan Yang Berubah Menjadi Kecil");
		AiHabara b = new AiHabara("Ai Habara", "Perempuan", "Nama Asli Shiho Miyano");
		MitsuhikoTsuburaya c = new MitsuhikoTsuburaya("Mitsuhiko Tsuburaya", "Laki Laki", "Senang Membaca Buku Sains");
		AyumiYoshida d = new AyumiYoshida("Ayumi Yoshida", "Perempuan", "Anggota Detektif Cilik");
		GentaKojima e = new GentaKojima("Genta Kojima", "Laki Laki", "Hobi Makan");
		HirosiAgasa f = new HirosiAgasa("Hirosi Agasa", "Laki Laki", "Seorang Penemuan Yang Sangat Cerdas");
		EriKisaki g = new EriKisaki("Eri Kisaki", "Perempuan", "Ibu dari Ran Mouri dan Seorang Pengacara");
		KogoroMouri h = new KogoroMouri("Kogoro Mouri", "Laki Laki", "Ayah dari Ran Mouri dan Seorang Detektif Swasta");
		RanMouri i = new RanMouri("Ran Mouri", "Perempuan", "Kekasih Shinichi Kudo");
		SonokoSuzuki j = new SonokoSuzuki("Sonoko Suzuki", "Perempuan", "Anak Orang Kaya dan Sahabat Ran Mouri");
		HeijiHattori k = new HeijiHattori("Heiji Hattori", "Laki Laki", "Rival Shinichi Kudo(Conan Edogawa)");
		KazuhaToyama l = new KazuhaToyama("Kazuha Toyama", "Perempuan", "Teman Romantis Heiji Hattori");
		
		
		a.keterangan();
		System.out.println();
		b.keterangan();
		System.out.println();
		c.keterangan();
		System.out.println();
		d.keterangan();
		System.out.println();
		e.keterangan();
		System.out.println();
		f.keterangan();
		System.out.println();
		g.keterangan();
		System.out.println();
		h.keterangan();
		System.out.println();
		i.keterangan();
		System.out.println();
		j.keterangan();
		System.out.println();
		k.keterangan();
		System.out.println();
		l.keterangan();
		System.out.println();
		
	}
}
