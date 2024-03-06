package hus.oop.lab4.composition.mypoint;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){

    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int[] getXY(){
        int xy[] = {x, y};
        return xy;
    }
}
