package tugas;

/**
 * Anggota Kelompok : Firman Hakim, Ahmad Kabir Rifa'i, Muhammad Kemal Ma'ruf
 * Kelas : Reguler D
 * Deskripsi Program : program ini berisi proram menampilkan calculator project.
 */


public class Latihan48Kalkulator {
    private double value1;
    private double value2;

    public double getValue1() {
        return value1;
    }
    public void setValue1(double value1) {
        this.value1 = value1;
    }
    public double getValue2() {
        return value2;
    }
    public void setValue2(double value2) {
        this.value2 = value2;
    }
    public void setNameProject() {
        System.out.println("Calculator Project");
    }
    public void setNoteProject(String note) {
        System.out.println("" + note);
    }
    public double add(double val1, double val2) {
        return val1 + val2;
    }
    public double subtract(double val1, double val2) {
        return val1 - val2;
    }
    public double multiplication(double val1, double val2) {
        return val1 * val2;
    }
    public double division(double val1, double val2) {
        if (val2 == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
        return val1 / val2;
    }
    public static void main(String[] args) {
        Latihan48Kalkulator Kalkulator = new Latihan48Kalkulator();
        Kalkulator.setNameProject();
        Kalkulator.setNoteProject("my project.");
        
        Kalkulator.setValue1(7.0);
        Kalkulator.setValue2(5.0);

        System.out.println("Value 1 = " + Kalkulator.getValue1());
        System.out.println("Value 2 = " + Kalkulator.getValue2());

        System.out.println("Result Addition is = " + Kalkulator.add(Kalkulator.getValue1(), Kalkulator.getValue2()));
        System.out.println("Result Subtraction is = " + Kalkulator.subtract(Kalkulator.getValue1(), Kalkulator.getValue2()));
        System.out.println("Result Multiple is = " + Kalkulator.multiplication(Kalkulator.getValue1(), Kalkulator.getValue2()));
        System.out.println("Result Division is = " + Kalkulator.division(Kalkulator.getValue1(), Kalkulator.getValue2()));
    }
}