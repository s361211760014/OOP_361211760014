package lab8_2;

public class Sheriff extends Person{
    private  String workState;


    public Sheriff(String name, String dateofBirth,String workState) {
        super(name, dateofBirth);
        this.workState = workState;
    }
    public  void  introduce(){
        super.introduce();
        System.out.println("I work at"+this.workState);
    }

    //getter and setter

    public String getWorkState() {
        return workState;
    }

    public void setWorkState(String workState) {
        this.workState = workState;
    }

    //toString

    @Override
    public String toString() {
        return "Sheriff{" +
                "workState='" + workState + '\'' +
                "} " + super.toString();
    }
}

