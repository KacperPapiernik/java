
class Trojkat extends Figura
{
	double wys=0, podst=0;

	Trojkat(double wys, double podst, String kolor, Punkt punkt)
	{
		super(kolor,punkt);
		this.wys = wys;
		this.podst = podst;
	}
	Trojkat(float wys, float podst, String kolor)
	{
		super(kolor);
		this.wys = wys;
		this.podst = podst;
	}
	void opis(){
		System.out.println("Wysokosc: " + wys + ", Podstawa: " + podst + " Kolor: " + kolor + ", Punkt: " + punkt.x +" "+ punkt.y);
	}
}