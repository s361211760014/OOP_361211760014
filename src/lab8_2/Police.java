package lab8_2;

public class Police extends Person{
    private  String workCounty;

    public Police(String name, String dateofBirth,String workCounty) {
        super(name, dateofBirth);
        this.workCounty = workCounty;
    }

    public  void  introduce(){
        super.introduce();
        System.out.println("I work at"+this.workCounty);
    }
    //getter and setter

    public String getWorkCounty() {
        return workCounty;
    }

    public void setWorkCounty(String workCounty) {
        this.workCounty = workCounty;
    }
    //toString

    @Override
    public String toString() {
        return "Police{" +
                "workCounty='" + workCounty + '\'' +
                "} " + super.toString();
    }
}
