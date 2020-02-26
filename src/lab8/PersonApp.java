package lab8;

public class PersonApp {

    public static void main(String[] args) {
        //create object
        Student std1 = new Student("361211760036",
                "Sukanya Srirak",
                "STD036",
                "Information Technology");
        Person p1 =new Person("123456789",
                "Sukanya Srirak");

        System.out.println(std1.getName());
        System.out.println(p1.getName());

        System.out.println(std1.toString());
        System.out.println(p1.toString());








    }
}