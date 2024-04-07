
public class Main {
    public static void main(String[] args) {
        Budynek budynek1 = new Budynek();
        budynek1.nazwa = "Budynek 1";
        budynek1.rokBudowy = 2000;
        budynek1.liczbaPieter = 5;
        Budynek budynek2 = new Budynek();
        budynek2.nazwa = "Budynek 2";
        budynek2.rokBudowy = 1993;
        budynek2.liczbaPieter = 10;
        Budynek budynek3 = new Budynek();
        budynek3.nazwa = "Budynek 3";
        budynek3.rokBudowy = 1854;
        budynek3.liczbaPieter = 3;

        budynek1.wypisz();
        budynek1.ileLat();
        budynek2.wypisz();
        budynek2.ileLat();
        budynek3.wypisz();
        budynek3.ileLat();
    }
}