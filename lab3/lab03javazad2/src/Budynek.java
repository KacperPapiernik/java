import java.time.LocalDate;

public class Budynek {
    String nazwa;
    int rokBudowy, liczbaPieter;

    public void wypisz() {
        System.out.println("Nazwa budynku: " + nazwa + ", Rok budowy: " + rokBudowy + ", Liczba Pięter: " + liczbaPieter);
    }
    public void ileLat() {
        System.out.println("Budynek ma " + ((LocalDate.now()).getYear() - rokBudowy) + " lat");
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getRokBudowy() {
        return rokBudowy;
    }

    public void setRokBudowy(int rokBudowy) {
        this.rokBudowy = rokBudowy;
    }

    public int getLiczbaPieter() {
        return liczbaPieter;
    }

    public void setLiczbaPieter(int liczbaPieter) {
        this.liczbaPieter = liczbaPieter;
    }
}
