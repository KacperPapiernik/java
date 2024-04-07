
public class Kwadrat {
    private double a;
    private String name = "Kwadrat";

    public double pole(double a) {
        return a*a;
    }
    public double obw(double a) {
        return 4*a;
    }
    public void wypisz(){
        System.out.println("Figura: " + name + ", a =: " + a + ", Pole: " + pole(a) + ", Obwód: " + obw(a));
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
