package tugas;

import java.util.Scanner;

public class Coba1{
	private int angka1;
	private int angka2;
	
	public int getAngka1() {
		return angka1;
	}
	public void setAngka1(int angka1) {
		this.angka1 = angka1;
	}
	public int getAngka2() {
		return angka2;
	}
	public void setAngka2(int angka2) {
		this.angka2 = angka2;
	}
	
	public int tambah() {
		return angka1 + angka2;
	}
	public int kurang() {
		return angka1 - angka2;
	}
	public int kali() {
		return angka1 * angka2;
	}
	public int bagi() {
		return angka1 / angka2;
	}
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("NAMA : FIRMAN HAKIM");
        System.out.println("KELAS : REGULER D");
        System.out.println("NPM : 221106042873");
        System.out.println("");
        System.out.println("----TUGAS PRAKTIKUM----");
        System.out.println("");

        Coba1 coba1 = new Coba1();

        System.out.println("--PERTAMBAHAN--");
        System.out.print("Masukan Angka 1 : ");
        int angka1 = input.nextInt();
        System.out.print("Masukan Angka 2 : ");
        int angka2 = input.nextInt();
        coba1.angka1 = angka1;
        coba1.angka2 = angka2;
        System.out.println("Hasilnya adalah : " + coba1.tambah());
        System.out.println("");

        System.out.println("--PENGURANGAN--");
        System.out.print("Masukan Angka 1 : ");
        int angka11 = input.nextInt();
        System.out.print("Masukan Angka 2 : ");
        int angka22 = input.nextInt();
        coba1.angka1 = angka11;
        coba1.angka2 = angka22;
        System.out.println("Hasilnya adalah : " + coba1.kurang());
        System.out.println("");

        System.out.println("--PERKALIAN--");
        System.out.print("Masukan Angka 1 : ");
        int angka111 = input.nextInt();
        System.out.print("Masukan Angka 2 : ");
        int angka222 = input.nextInt();
        coba1.angka1 = angka111;
        coba1.angka2 = angka222;
        System.out.println("Hasilnya adalah : " + coba1.kali());
        System.out.println("");

        System.out.println("--PEMBAGIAN--");
        System.out.print("Masukan Angka 1 : ");
        int angka1111 = input.nextInt();
        System.out.print("Masukan Angka 2 : ");
        int angka2222 = input.nextInt();
        coba1.angka1 = angka1111;
        coba1.angka2 = angka2222;
        System.out.println("Hasilnya adalah : " + coba1.bagi());
        System.out.println("");
    }
	
	
	
	
}