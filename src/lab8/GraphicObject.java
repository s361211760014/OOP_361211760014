package lab8;

public abstract class GraphicObject {
    private double x;
    private double y;

    //abstract method
    public abstract  void findArea();

    //getter and setter

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}//class