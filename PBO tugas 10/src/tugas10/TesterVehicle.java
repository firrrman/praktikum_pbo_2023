package tugas10;

/**
 * Anggota Kelompok : Firman Hakim, Ahmad Kabir Rifa'i, Muhammad Kemal Ma'ruf
 * Kelas : Reguler D
 * Deskripsi Program : program ini berisi program menampilkan 
 * data Bicycle dan Skateboard
 */

//Ketentuan : Kontstruktor Bicycle dan Skateboard menampilkan tampilan ke layar nama class mereka sendiri

class Vehicle {
    private String brand;
    private String model;

    public Vehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class Bicycle extends Vehicle {
	private int gearCount;

    public Bicycle() {
        System.out.println("Bicycle");
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }
}

class Skateboard extends Vehicle {
    private double boardLength;

    public Skateboard() {
        System.out.println("Skateboard");
        
    }

    public double getBoardLength() {
        return boardLength;
    }

    public void setBoardLength(double boardLength) {
        this.boardLength = boardLength;
    }
}

public class TesterVehicle {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setBrand("Trek Bike");
        bicycle.setModel("7.4Fx");
        bicycle.setGearCount(23);

        System.out.println("Brand: " + bicycle.getBrand());
        System.out.println("Model: " + bicycle.getModel());
        System.out.println("Jumlah Gear: " + bicycle.getGearCount());
        System.out.println();

        Skateboard skateboard = new Skateboard();
        skateboard.setBrand("Ally Skate");
        skateboard.setModel("Rocket");
        skateboard.setBoardLength(54.5);

        System.out.println("Brand: " + skateboard.getBrand());
        System.out.println("Model: " + skateboard.getModel());
        System.out.println("Panjangnya Board: " + skateboard.getBoardLength());
    }
}

