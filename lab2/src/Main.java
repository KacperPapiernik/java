import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Zadanie 1
        /*
        System.out.println("Wpisz ile studentów: ");
        int ile = scanner.nextInt();
        grupa(ile);
         */
        // Zadanie 2
        //zlicz();
        // Zadanie 3
        /*
        int n;
        System.out.println("Wpisz ile liczb: ");
        n = scanner.nextInt();
        parzyste(n);
         */
        // Zadanie 4
        /*
        int n;
        System.out.println("Wpisz ile liczb: ");
        n = scanner.nextInt();
        przedzial(n);
         */
        // Zadanie 5
        /*
        System.out.println("Podaj słowo: ");
        String slowo;
        slowo = scanner.next();
        if (palindrom(slowo)){
            System.out.println("Jest");
        }else {
            System.out.println("Nie jest");
        }
         */
    }
    
    public static void przedzial(int n) {
        Scanner scanner = new Scanner(System.in);
        int i = 0,liczba,suma = 0;
        while (i < n)
        {
            System.out.println("Podaj liczbe: z (-10,45)");
            liczba = scanner.nextInt();
            if(liczba > -10 && liczba < 45 ){
               i++;
               if(liczba % 2 == 0){
                   suma = suma + liczba;
               }
            }
        }
        System.out.println("Suma: " + suma);
    }
    public static boolean palindrom(String slowo) {
        int dlugosc = slowo.length();
        for(int i = 0; i < dlugosc/2; i++) {
            if(slowo.charAt(i) != slowo.charAt(dlugosc - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void parzyste(int n) {
        Scanner scanner = new Scanner(System.in);
        int parzyste = 0, liczba;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbe: ");
            liczba = scanner.nextInt();
            if(liczba % 2 == 0){
                parzyste = parzyste + liczba;
            }
        }
        System.out.println("Suma: " + parzyste);
    }
    public static void zlicz() {
        Scanner scanner = new Scanner(System.in);
        double dodatnie = 0,ujemne = 0,sumaDodatnie = 0,sumaUjemne = 0,liczba;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Wpisz liczbe " + i + ": ");
            liczba = scanner.nextDouble();
            if(liczba >= 0) {
                dodatnie++;
                sumaDodatnie = sumaDodatnie + liczba;
            }else {
                ujemne++;
                sumaUjemne = sumaUjemne + liczba;
            }
        }
        System.out.println("Ilosc dodatnich: " + dodatnie + ", ilosc ujemnych: " + ujemne);
        System.out.println("Suma dodatnich: " + sumaDodatnie + ", suma ujemnych: " + sumaUjemne);
    }
    public static void grupa(int ile) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        double suma = 0,punkty;
        while(i < ile)
        {
            System.out.println("Wpisz ile punktów: ");
            punkty = scanner.nextDouble();
            suma = suma + punkty;
            i++;
        }
        System.out.println("Srednia punktów to: " + (suma/ile));
    }
}