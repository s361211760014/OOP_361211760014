package lab4;

public class MethodEx {

    //1.No return No parameter :
    //2.No return 1 or more parameter :
    //3.Return 1 value, 1 or more parameter :
    public static void main(String[] args) {

        System.out.println("Hello from mail().");
        //calling method A()
        A();
        A();
        A();
        //calling method B()
        B("MIT","RUTS");
        //calling method C()
        //1.
        int summation = C(10,20);
        System.out.println("The summation of x and y : "+summation);
        //2.
        System.out.println("The summation of x and y (2): "+C(50,50));
    }//main

    public static void A() {
        System.out.println("Hello from A().");
    }//A
    public static void B(String msg, String msg2) {
        System.out.println("Hello from B().");
        System.out.println("Message: "+msg);
        System.out.println("Message2: "+msg2);


    }//B

    public static int C(int x, int y) {
        System.out.println("Hello from C().");
        int sum = x + y;
        return sum;
    }
}//class
