public class Okrag extends Figura {
    private double promien;
    Punkt punkt;

    public Okrag() {
        this.promien = 0;
        this.punkt = new Punkt(0,0);
    }

    public Okrag(String kolor, double promien, Punkt punkt) {
        super(kolor);
        this.promien = promien;
        this.punkt = punkt;
    }

    public double getPowierzchnia()
    {
        return Math.PI * Math.pow(promien,2);
    }
    public double getSrednica(){
        return 2*promien;
    }
    public void setPromien(double p)
    {
        promien = p;
    }
    public double getPromien()
    {
        return promien;
    }
    public String wSrodku(Punkt punkt){
        if (Math.pow(this.punkt.x-punkt.x,2)+Math.pow(this.punkt.y-punkt.y,2) <= Math.pow(promien,2)) {
            return "Punkt znajduje się";
        }
        else {
            return "Nie znajduje się";
        }
    }
    public void opis(){
        System.out.println("promien: " + promien + ", punkt: " + punkt.x +" "+ punkt.y);
    }
}
