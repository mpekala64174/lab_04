package lab_04;

public class Okrag extends Figura {
    Punkt srodek;
    int promien;

    public Okrag() {
        this.srodek= new Punkt(1,2);
        this.promien = 5;
    }
    public float getPowierzchnia(){
        return promien*promien*3.14f;
    }
    public int getSrednica(){
        return promien*2;
    }
    public int getPromien(){
        return promien;
    }
    @Override
    public String toString() {
        return "Figura{" + "punkt=" + srodek + ", promien=" + promien + '}';
    }
}
