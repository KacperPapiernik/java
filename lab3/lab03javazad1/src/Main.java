import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Run run = new Run();
        Run run = new Run();
        run.Runing();
    }

    // Lab 03

    // Pomocne

    public static int Losuj(int a, int b)
    {
        Random random = new Random();
        int liczba = random.nextInt(b-a+1)+a;
        return liczba;
    }
    public static double InputDouble()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        double liczba = input.nextDouble();
        return liczba;
    }
    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = input.nextInt();
        return liczba;
    }
    public static String InputString()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz tekst: ");
        String liczba = input.next();
        return liczba;
    }
}