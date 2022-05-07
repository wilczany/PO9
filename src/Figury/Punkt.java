package Figury;

public class Punkt {

    int x;
    int y;
    public Punkt(int x,int y){
        this.x=x;
        this.y=y;
    }
    public Punkt(int xy){
        x=y=xy;
    }
    public void przesun(int dx,int dy){
        x+=dx;
        y+=dy;
    }
    //getters & setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
