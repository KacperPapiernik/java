public class Main {
    public static void main(String[] args) {
//        Punkt[] punkty = new Punkt[]{
//                new Punkt(),
//                new Punkt(2.5,-3.45),
//                new Punkt(1,5.2)
//        };
//
//        for(Punkt item: punkty){
//            item.opis();
//        }
//        for(Punkt item: punkty){
//            item.zeruj();
//        }
//        for(Punkt item: punkty){
//            item.opis();
//        }
//        System.out.println();
        Okrag okrag = new Okrag();
        okrag.setPromien(5);
        Punkt punkt = new Punkt(1,1);
        System.out.println(okrag.wSrodku(punkt));

        System.out.println();

        Prostokat prostokat = new Prostokat(10,5,"Czerwony",punkt);
        System.out.println(prostokat.punkt.x +" "+ prostokat.punkt.y);
        prostokat.Przesun(3,5);
        System.out.println(prostokat.punkt.x +" "+ prostokat.punkt.y);

        System.out.println();
        Trojkat trojkat = new Trojkat(10,5,"Czarny",punkt);
        trojkat.opis();
    }
}