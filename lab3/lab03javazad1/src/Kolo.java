// klasa kolo
// r = promien
// settery i gettery
// metoda pole oraz obwod

public class Kolo {
    private double r;
    private String name = "Koło";

    public double pole(double r) {
        return Math.PI * Math.pow(r,2);
    }
    public double obw(double r) {
        return 2 * Math.PI * r;
    }
    public void wypisz(){
        System.out.println("Figura: " + name + ", promień: " + r + ", Pole Koła: " + pole(r) + ", Obwód koła " + obw(r));
    }
//    public void view1()
//    {
//        System.out.format("Figura %s, promień r = %.2f, pole: %.2f, obwód: %.2f", name,r,pole(r),obw(r));
//    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
