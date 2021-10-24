package Lab_04_auta;
import java.util.Random;

public class Auto {
    float[] przebieg = new float[12];

    public Auto() {
        Random wartosc = new Random();
        for (int i=0;i<12;i++) {
            przebieg[i] = wartosc.nextFloat();
            System.out.println(przebieg[i]);
        }
    }
    public float  srPrzebieg(){
       float suma = 0;
       float srednia = 0;
       for (int i=0;i<12;i++) {
            suma += przebieg[i];
        }
       srednia=suma/12;
       return srednia;
    }
}
