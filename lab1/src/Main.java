import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Zadanie 1
        /*
        double a,b,c;
        System.out.println("Wpisz a:");
        a = scanner.nextDouble();
        System.out.println("Wpisz b:");
        b = scanner.nextDouble();
        System.out.println("Wpisz c:");
        c = scanner.nextDouble();

        kwadratowe(a,b,c);
        */
        // Zadanie 2
        /*
        System.out.println("Wpisz x:");
        double x = scanner.nextDouble();
        System.out.println("Wartosc x: " + funkcjaA(x) );
        System.out.println("Wartosc x: " + funkcjaB(x) );
        System.out.println("Wartosc x: " + funkcjaC(x) );
         */
        // Zadanie 3
        /*
        double x,y,z;
        System.out.println("Wpisz x:");
        x = scanner.nextDouble();
        System.out.println("Wpisz y:");
        y = scanner.nextDouble();
        System.out.println("Wpisz z:");
        z = scanner.nextDouble();

        sortuj(x,y,z);
         */
        // Zadanie 4
        /*
        boolean deszcz,autobus;
        System.out.println("Czy pada deszcz? ('Tak'/'Nie'): ");
        String tekstDeszcz = scanner.next();
        if(tekstDeszcz.contains("Tak"))
        {
            deszcz = true;
        } else if (tekstDeszcz.contains("Nie")) {
            deszcz = false;
        }else {
            System.out.println("nie ma takiej odpowiedzi");
            return;
        }

        System.out.println("Czy jest autobus? ('Tak'/'Nie'): ");
        String tekstAutobus = scanner.next();
        if(tekstAutobus.contains("Tak"))
        {
            autobus = true;
        } else if (tekstAutobus.contains("Nie")) {
            autobus = false;
        }else {
            System.out.println("nie ma takiej odpowiedzi");
            return;
        }
        dzien(deszcz, autobus);
         */
        // Zadanie 5
        /*
        boolean znizka,podwyzka;
        System.out.println("Czy jest zniżka? ('Tak'/'Nie'): ");
        String czyZnizka = scanner.next();
        if(czyZnizka.contains("Tak"))
        {
            znizka = true;
        } else if (czyZnizka.contains("Nie")) {
            znizka = false;
        }else {
            System.out.println("nie ma takiej odpowiedzi");
            return;
        }

        System.out.println("Czy otrzymałeś podwyżkę? ('Tak'/'Nie'): ");
        String czyPodwyzka = scanner.next();
        if(czyPodwyzka.contains("Tak"))
        {
            podwyzka = true;
        } else if (czyPodwyzka.contains("Nie")) {
            podwyzka = false;
        }else {
            System.out.println("nie ma takiej odpowiedzi");
            return;
        }
        samochod(znizka,podwyzka);
         */
        // Zadanie 6
        /*
        System.out.println("Co chcesz zrobic ? ('Dodawanie'/'Odejmowanie'/'Mnozenie'/'Dzielenie'/'Reszta'): ");
        String coRobic = scanner.next();
        double a,b;
        System.out.println("Wpisz a:");
        a = scanner.nextDouble();
        System.out.println("Wpisz b:");
        b = scanner.nextDouble();
        System.out.println("Wartosc: " + kalkulator(coRobic,a,b));
         */
    }

    public static double kalkulator(String coRobic, double a, double b) {
        switch (coRobic) {
            case "Dodawanie":
                return a+b;
            case "Odejmowanie":
                return a-b;
            case "Mnozenie":
                return a*b;
            case "Dzielenie":
                return a/b;
            case "Reszta":
                return b%a;
            default:
                System.out.println("Nie ma takiej odpowiedzi");
                return 0;
        }
    }
    public static void samochod(boolean znizka, boolean podwyzka) {
        if(znizka == false || podwyzka)
        {
            System.out.println("Możesz kupić samochód ! Zniżki na samochód nie ma");
        }
        if(znizka == false || podwyzka == false)
        {
            System.out.println("Zakup samochód trzeba odłożyć na później... Zniżki na samochód nie ma");
        }
        if(znizka || podwyzka)
        {
            System.out.println("Możesz kupić samochód !");
        }
    }
    public static void dzien(boolean deszcz, boolean autobus) {
        if(deszcz && autobus)
        {
            System.out.println("Wez parasol, Dostaniesz się na uczelnie");
            return;
        }
        if(deszcz && autobus == false)
        {
            System.out.println("Nie dostaniesz się na uczelnię");
            return;
        }
        if(deszcz == false && autobus)
        {
            System.out.println("Dostaniesz się na uczelnie, Miłego dnia i pięknej pogody");
            return;
        }
    }
    public static void sortuj(double x, double y, double z) {
        double tym;
        if (x > y)
        {
            tym = x;
            x = y;
            y = tym;
            }
        if (x > z)
        {
            tym = x;
            x = z;
            z = tym;
        }
        if (y > z)
        {
            tym = y;
            y = z;
            z = tym;
        }
        System.out.println("x: " + x + " y: " + y + " z: " + z);
    }
    public static double funkcjaA(double x) {
        if(x>0)
        {
            return 2*x;
        } else if (x == 0) {
            return 0;
        }else
        {
            return -3*x;
        }
    }
    public static double funkcjaB(double x) {
        if(x>=1)
        {
            return x*x;
        }else {
         return x;
        }
    }
    public static double funkcjaC(double x) {
        if(x>2)
        {
            return 2+x;
        } else if (x == 2) {
            return 8;
        } else {
            return x-4;
        }
    }
    public static void kwadratowe(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if(delta > 0)
        {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Delta wieksza od 0 i równanie ma dwa rozwiazania: " + x1 +" "+ x2);
        }
        else if(delta == 0)
        {
            double x = -b / (2 * a);
            System.out.println("Delta rowna 0 i równanie ma jedno rozwiązanie: " + x);
        }
        else
        {
            System.out.println("Delta mniejsza od 0");
        }
    }
}