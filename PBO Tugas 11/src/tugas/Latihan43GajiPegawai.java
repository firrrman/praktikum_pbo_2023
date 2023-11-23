package tugas;

/**
 * Anggota Kelompok : Firman Hakim, Ahmad Kabir Rifa'i, Muhammad Kemal Ma'ruf
 * Kelas : Reguler D
 * Deskripsi Program : program ini berisi proram menampilkan data gaji karyawan.
 */

public class Latihan43GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public int getUangTransport() {
        return uangTransport;
    }
    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }
    public int getUangTunjangan() {
        return uangTunjangan;
    }
    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }
    public int getGajiPokok() {
        return gajiPokok;
    }
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    public int getTotalGaji() {
        return totalGaji;
    }
    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    public int hitungTotalGaji() {
        return uangTunjangan + uangTransport + gajiPokok;
    }
    public void tampilData() {
    	System.out.println("--Data Gaji Karyawan--");
    	System.out.println(" ");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Uang Tunjangan: Rp." + uangTunjangan);
        System.out.println("Uang Transport: Rp." + uangTransport);
        System.out.println("Gaji Pokok: Rp." + gajiPokok);
        System.out.println("Total Gaji: Rp." + totalGaji);
    }
    public static void main(String[] args) {
        Latihan43GajiPegawai pegawai = new Latihan43GajiPegawai();

        pegawai.setNama("Firman Hakim");
        pegawai.setAlamat("kp gunung leutik rt02");
        pegawai.setUangTunjangan(500000);
        pegawai.setUangTransport(300000);
        pegawai.setGajiPokok(2000000);
        int totalGaji = pegawai.hitungTotalGaji();
        pegawai.setTotalGaji(totalGaji);
        pegawai.tampilData();
    }
}
