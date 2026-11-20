package Model;

public class Persegi extends SegiEmpat {    
    super(panjang, lebar);
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    public double getSisi() {
        return sisi;
    }
    public double setSisi(double sisi) {
        this.sisi = sisi;
    }
    
}
