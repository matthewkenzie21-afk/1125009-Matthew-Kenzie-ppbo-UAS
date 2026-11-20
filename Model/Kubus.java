package Model;

public class Kubus extends Balok {
    super(panjang, lebar, tinggi);
    
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

}
