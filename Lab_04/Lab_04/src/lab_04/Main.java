package lab_04;

import Lab_04_auta.Auto;
import Lab_04_auta.Taxi;

public class Main {
    public static void main(String[] args){
        //pkt 4
        Trojkat t1=new Trojkat(4,7);
        Prostokat p1=new Prostokat(4,6);
        Punkt pkt1=new Punkt(0,0);
        
        //System.out.println("Podstawa trojkata:"+t1.podst);
        //System.out.println("Wysokosc trojkata:"+t1.wys);
        
        //System.out.println("Szerokosc prostokata:"+p1.szer);
        //System.out.println("Wysokosc prostokata:"+p1.wys);
        
        //System.out.println("Punkt x:"+pkt1.x);
        //System.out.println("Punkt y:"+pkt1.y);
        

        p1.przesun(3,5);
        //System.out.println("Punkt x po przesunieciu prostokata:"+p1.punkt.x);
        //System.out.println("Punkt y po przesunieciu prostokata:"+p1.punkt.y);
        
        //z11
        Kwadrat k1=new Kwadrat(5,5);
        //System.out.println("Szerokosc kwadrata:"+k1.szer);
        //System.out.println("Wysokosc kwadrata:"+k1.wys);
        
        //z13 toString zamiast opis
        //System.out.println(t1.toString());
        //System.out.println(p1.toString());
        //System.out.println(pkt1.toString());
        //System.out.println(k1.toString());

        //samodzielnie zadanie

        Okrag o1=new Okrag();
        //System.out.println(o1.getPowierzchnia());
        //System.out.println(o1.getSrednica());
        //System.out.println(o1.getPromien());
        //System.out.println(o1.toString());

        Auto a1=new Auto();
        System.out.println(a1.srPrzebieg());

        Taxi tax1= new Taxi();
        System.out.println(tax1.srPrzebieg());
    }
}
