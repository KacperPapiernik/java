import java.util.Scanner;

public class Run {
    // metoda runing która będzie odpowiadać za wyświetlenie logiki
    // tj. petla while w ktorej bedzie switch
    public void Runing() {
        int wybor;
        boolean prawda = true;
        while(prawda)
        {
            Menu();
            wybor = InputInt();
            switch (wybor) {
                case 1 -> menuKolo();
                case 2 -> menuKwadrat();
                case 3 -> menuProtokat();
                case 4 -> menuSzescian();
                case 5 -> menuProstopadloscian();
                case 6 -> menuKula();
                case 7 -> menuStozek();
                default -> prawda = podstawowaInstrukcja();
            }
        }
    }

    private void menuStozek() {
        Stozek stozek = new Stozek();
        System.out.println("Podaj r: ");
        double r = InputDouble();
        System.out.println("Podaj h: ");
        double h = InputDouble();
        System.out.println("Podaj l: ");
        double l = InputDouble();
        if(r > 0 && h > 0 && l > 0)
        {
            stozek.setR(r);
            stozek.setH(h);
            stozek.setL(l);
        }else {
            System.out.println("Podano liczbę ujemną zmieniam ją na liczbe dodatnią. r = " + Math.abs(r) + ", h = "+ Math.abs(h) + ", l = "+ Math.abs(l));
            stozek.setR(Math.abs(r));
            stozek.setH(Math.abs(h));
            stozek.setL(Math.abs(l));
        }

        stozek.wypisz();
    }

    private void menuKula() {
        Kula kula = new Kula();
        System.out.println("Podaj promień: ");
        double r = InputDouble();
        if(r > 0)
        {
            kula.setR(r);
        }else {
            System.out.println("Podano liczbę ujemną zmieniam ją na liczbe dodatnią. r = " + Math.abs(r));
            kula.setR(Math.abs(r));
        }

        kula.wypisz();
    }

    private void menuProstopadloscian() {
        Prostopadloscian prostopadloscian = new Prostopadloscian();
        System.out.println("Podaj a: ");
        double a = InputDouble();
        System.out.println("Podaj b: ");
        double b = InputDouble();
        System.out.println("Podaj c: ");
        double c = InputDouble();
        if(a > 0 && b > 0 && c > 0)
        {
            prostopadloscian.setA(a);
            prostopadloscian.setB(b);
            prostopadloscian.setC(c);
        }else {
            System.out.println("Podano liczbę ujemną zmieniam ją na liczbe dodatnią. a = " + Math.abs(a) + ", b = "+ Math.abs(b) + ", c = "+ Math.abs(c));
            prostopadloscian.setA(Math.abs(a));
            prostopadloscian.setB(Math.abs(b));
            prostopadloscian.setC(Math.abs(c));
        }

        prostopadloscian.wypisz();
    }

    private void menuSzescian() {
        Szescian szescian = new Szescian();
        System.out.println("Podaj a: ");
        double a = InputDouble();
        if(a > 0)
        {
            szescian.setA(a);
        }else {
            System.out.println("Podano liczbę ujemną zmieniam ją na liczbe dodatnią. a = " + Math.abs(a));
            szescian.setA(Math.abs(a));
        }

        szescian.wypisz();
    }

    private void menuProtokat() {
        Prostokat prostokat = new Prostokat();
        System.out.println("Podaj a: ");
        double a = InputDouble();
        System.out.println("Podaj b: ");
        double b = InputDouble();
        if(a > 0 && b > 0)
        {
            prostokat.setA(a);
            prostokat.setB(b);
        }else {
            System.out.println("Podano liczbę ujemną zmieniam ją na liczbe dodatnią. a = " + Math.abs(a) + ", b = "+ b);
            prostokat.setA(Math.abs(a));
            prostokat.setB(Math.abs(b));
        }

        prostokat.wypisz();
    }

    private void menuKwadrat() {
        Kwadrat kwadrat = new Kwadrat();
        System.out.println("Podaj a: ");
        double a = InputDouble();
        if(a > 0)
        {
            kwadrat.setA(a);
        }else {
            System.out.println("Podano liczbę ujemną zmieniam ją na liczbe dodatnią. a = " + Math.abs(a));
            kwadrat.setA(Math.abs(a));
        }

        kwadrat.wypisz();
    }

    private void menuKolo() {
        Kolo kolo = new Kolo();
        System.out.println("Podaj promień: ");
        double r = InputDouble();
        if(r > 0)
        {
            kolo.setR(r);
        }else {
            System.out.println("Podano liczbę ujemną zmieniam ją na liczbe dodatnią. r = " + Math.abs(r));
            kolo.setR(Math.abs(r));
        }

        kolo.wypisz();
    }
    private boolean podstawowaInstrukcja() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zła wartość, czy chcesz wyjść z programu ('Tak'/'Nie')?");
        String text = scanner.next();
        if(text.contains("Nie"))
        {
            return true;
        }
        else { return false; }

    }

    public void Menu() {
        System.out.println("Menu programu: Kalkulator figur");
        System.out.println("1. Oblicz Koło");
        System.out.println("2. Oblicz Kwadrat");
        System.out.println("3. Oblicz Prostokąt");
        System.out.println("4. Oblicz Sześcian");
        System.out.println("5. Oblicz Prostopadłościan");
        System.out.println("6. Oblicz Kule");
        System.out.println("7. Oblicz Stożek");
        System.out.println("Inna wartosc: Wyjscie z programu");
        System.out.println("Wpisz liczbę od 1 do 7: ");
    }
    public int InputInt()
    {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;

    }
    public double InputDouble() {
        Scanner scanner = new Scanner(System.in);
        double liczba = scanner.nextInt();
        return liczba;
    }
}
