public class Stozek {
    private double r,h,l;
    private String name = "Stozek";

    public double pole(double r, double l) {
        return Math.PI * Math.pow(r,2) + Math.PI * r * l;
    }
    public double obj(double r, double h) {
        return 1/3 * Math.PI * Math.pow(r,2) * h;
    }
    public void wypisz(){
        System.out.println("Figura: " + name + ", promień: " + r + ", Pole Koła: " + pole(r,l) + ", Obwód koła " + obj(r,h));
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
}
