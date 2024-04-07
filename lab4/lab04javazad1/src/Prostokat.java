
class Prostokat extends Figura {
	double wys=0, szer=0;
	
	Prostokat(double wys,double szer, String kolor, Punkt punkt){
		super(kolor,punkt);
		this.wys = wys;
		this.szer = szer;
			
	}
	Prostokat(float wys, float szer, String kolor){
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}

	void Przesun(float x, float y)
	{
		this.punkt.x=+x;
		this.punkt.y=+y;
	}

    double getPowierzchnia() {
        return (szer * wys);
    }
    void opis(){
		System.out.println("Wysokosc: " + wys + ", Szerokosc" + szer + ", Kolor: " + kolor + ", Punkt: " + punkt.x +" "+ punkt.y);
	}
    
}