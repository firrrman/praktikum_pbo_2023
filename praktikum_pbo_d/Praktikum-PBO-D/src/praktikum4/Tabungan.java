package praktikum4;

public class Tabungan {
	public int saldo;
	public Tabungan(int iniSaldo) {
		saldo = iniSaldo;
	}
	public void ambilUang(int jumlah) {
		saldo = saldo - jumlah;
	}

}
