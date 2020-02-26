package lab7;

public class Mobile {
    //Attributes
    private int id;
    private String brand;
    private String generation;
    private int price;
    private String system;


    public Mobile (){}

    public Mobile(int id,String brand,String generation,int price,String system){
        this.id = id;
        this.brand = brand;
        this.generation = generation;
        this.price = price;
        this.system = system;
    }
    //Behavior คือ พฤติกรรมของวัตถุ
    public void call(){ System.out.println("Mobile call"); }
    public void message(){ System.out.println("Mobile message"); }
    public void internet(){ System.out.println("Mobile internet"); }


    public int getId(){ return this.id; }
    public void setId(int id ){
        this.id = id;
    }
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getGeneration(){
        return this.generation;
    }
    public void setGeneration(String generation){
        this.generation = generation;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getSystem(){
        return this.system;
    }
    public void setSystem(String system){
        this.system = system;
    }

}//class