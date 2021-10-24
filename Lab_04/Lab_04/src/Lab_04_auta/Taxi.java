package Lab_04_auta;

import java.util.Random;

public class Taxi extends Auto{
    float[] zarobki = new float[12];

    public Taxi() {
        Random zarobek = new Random();
        for (int i=0;i<12;i++) {
            zarobki[i] = zarobek.nextFloat();
            System.out.println(zarobki[i]);
        }
    }
    public float  srZarobki(){
        float sum = 0;
        float sredn = 0;
        for (int i=0;i<12;i++) {
            sum += zarobki[i];
        }
        sredn=sum/12;
        return sredn;
    }
}
