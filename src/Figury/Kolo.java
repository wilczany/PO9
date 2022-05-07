package Figury;

public class Kolo extends  Figura{
    Punkt srodek;
    int r;
    Kolo(Punkt srodek,int r){
        this.srodek=new Punkt(srodek.getX(),srodek.getY());
    }
    public void przesun(int dx,int dy){
        srodek.przesun(dx,dy);
    }
    public void skaluj(int s){
        r=r*s;
    }
    public double pole(){
        double area=Math.PI*Math.pow(r,2);
        return area;
    }
    public double obwod(){
        double per=Math.PI*r*2;
        return per;

    }
}
