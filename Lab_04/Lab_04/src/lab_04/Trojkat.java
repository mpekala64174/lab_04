package lab_04;

class Trojkat extends Figura
{
    int wys=0;
    int podst=0;

    public Trojkat(int wys,int podst)
	{	
		this.wys = wys;
		this.podst = podst;		
	}
        //z7
        public Trojkat(int wys,int podst,String kolor) {
         super(kolor);
         this.wys = wys;
         this.podst = podst;	
    }

    @Override
    public String toString() {
        return "Trojkat{" + "wys=" + wys + ", podst=" + podst + '}';
    }
	
        
}