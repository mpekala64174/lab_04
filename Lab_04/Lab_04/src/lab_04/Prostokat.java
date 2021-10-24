package lab_04;
class Prostokat extends Figura { //z5
	int wys=0;
	int szer=0;
	
	Prostokat(int wys,int szer){
		
	this.wys = wys;
	this.szer = szer;
			
	}

    int getPowierzchnia() {
        return (szer * wys);
    }
 //z6
    public Prostokat(int wys,int szer,String kolor) { //przeciazony konstruktor
        super(kolor); //wywoluje konstruktor klasy bazowej
        this.wys = wys;
	this.szer = szer;
    }
  //z8
    public void przesun(int x, int y){
        this.punkt.x+=x;
        this.punkt.y+=y;			
    }

    @Override
    public String toString() {
        return "Prostokat{" + "wys=" + wys + ", szer=" + szer + '}';
    }
    
    
    
}