package Figury;

public abstract class Figura {
    Punkt srodek;
    public abstract void przesun(int dx,int dy);
    public abstract void skaluj(int s);
    public abstract double pole();
    public abstract double obwod();


}
