package lab7;

public class MobileStore {
    public static void main(String[] args) {
        // create object สร้างวัตถุ
        //1. ใช้ default constructor
        Mobile mobile1 = new Mobile();

        mobile1.setId(1001);
        mobile1.setBrand("Wiko");
        mobile1.setGeneration("Sunny 4 Plus");
        mobile1.setPrice(2090);
        mobile1.setSystem("Android 9 Go");

        System.out.println(mobile1.getId());
        System.out.println(mobile1.getBrand());
        System.out.println(mobile1.getGeneration());
        System.out.println(mobile1.getPrice());
        System.out.println(mobile1.getSystem());


        //2. ใช้ constructor ที่มีการรับพารามิเตอร์
        // เป็นการสร้างวัตถุ พร้อมกับกำหนดข้อมูลให้กับวัตถุ
        Mobile mobile2 = new Mobile(2002,"Apple","iPhone 11 Pro", 35900, "ios 13");
        System.out.println(mobile2.getId());
        System.out.println(mobile2.getBrand());
        System.out.println(mobile2.getGeneration());
        System.out.println(mobile2.getPrice());
        System.out.println(mobile2.getSystem());

        Mobile mobile3 = new Mobile(3003,"Samsung","GalaxyE7", 11500, "Android 4.4");
        System.out.println(mobile3.getId());
        System.out.println(mobile3.getBrand());
        System.out.println(mobile3.getGeneration());
        System.out.println(mobile3.getPrice());
        System.out.println(mobile3.getSystem());


    }//main
}//class