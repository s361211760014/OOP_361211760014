package lab8;

public class Triangle extends GraphicObject {
    private  double base;
    private  double height;


    @Override
    public void findArea() {
        double area = 0.5 * base * height;
        System.out.println("The area of Triangle : "+area);

    }
    //getter and setter

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}