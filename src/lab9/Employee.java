package lab9;

public class Employee {

    private int empID;
    private String name;
    private String position;
    private double sarary;
    //constructor

    public Employee(int empID, String name, String position, double sarary) {
        this.empID = empID;
        this.name = name;
        this.position = position;
        this.sarary = sarary;
    }


    //

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSarary() {
        return sarary;
    }

    public void setSarary(double sarary) {
        this.sarary = sarary;
    }

    //


    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", sarary=" + sarary +
                '}';
    }
}
