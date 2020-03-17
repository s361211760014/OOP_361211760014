package lab8_2;

public class Person {
    private String name;
    private String dateofBirth;

    public Person(String name, String dateofBirth) {
        this.name = name;
        this.dateofBirth = dateofBirth;
    }

    public void introduce(){
        System.out.println("My name is"+this.name);
        System.out.println("I was born in"+this.dateofBirth);
    }


    //getter and setter


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    //toString

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateofBirth='" + dateofBirth + '\'' +
                '}';
    }
}
