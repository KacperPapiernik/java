
public class Szescian {
    private double a;
    private String name = "Sześcian";

    public double pole(double a) {
        return a*a*6;
    }
    public double obj(double a) {
        return a*a*a;
    }
    public void wypisz(){
        System.out.println("Figura: " + name + ", a =: " + a + ", Pole: " + pole(a) + ", Obwód: " + obj(a));
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
