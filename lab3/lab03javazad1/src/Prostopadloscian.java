
public class Prostopadloscian {
    private double a,b,c;
    private String name = "Prostopadloscian";

    public double pole(double a, double b, double c) {
        return a*b*c;
    }
    public double obj(double a, double b, double c) {
        return 2*a*b+2*a*c+2*b*c;
    }
    public void wypisz(){
        System.out.println("Figura: " + name + ", a =: " + a + ", Pole: " + pole(a,b,c) + ", Obwód: " + obj(a,b,c));
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
