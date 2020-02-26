package lab7;

public class NoteBook {
    private String brand;
    private String model;
    private String cpu;
    private String gpu;
    private String ram;
    private String display;
    private String hdd;
    private String os;
    private double price;

    //constructor

    public NoteBook() {
    }

    public NoteBook(String brand, String model, String cpu, String gpu, String ram, String display, String hdd, String os, double price) {
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.display = display;
        this.hdd = hdd;
        this.os = os;
        this.price = price;
    }

    //getter and setter

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //toString() -> display data in object

    @Override
    public String toString() {
        return "NoteBook{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram='" + ram + '\'' +
                ", display='" + display + '\'' +
                ", hdd='" + hdd + '\'' +
                ", os='" + os + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}//class