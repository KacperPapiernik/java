public class Kula {
    private double r;
    private String name = "Kula";

    public double pole(double r) {
        return 4/3 * Math.PI * Math.pow(r,3);
    }
    public double obj(double r) {
        return 4 * Math.PI * Math.pow(r,2);
    }
    public void wypisz(){
        System.out.println("Figura: " + name + ", promień: " + r + ", Pole Koła: " + pole(r) + ", Obwód koła " + obj(r));
    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
