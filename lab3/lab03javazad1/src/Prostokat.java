
public class Prostokat {
    private double a,b;
    private String name = "Prostokąt";

    public double pole(double a, double b) {
        return a*b;
    }
    public double obw(double a, double b) {
        return 2*a+2*b;
    }
    public void wypisz(){
        System.out.println("Figura: " + name + ", a =: " + a + ", Pole: " + pole(a,b) + ", Obwód: " + obw(a,b));
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
