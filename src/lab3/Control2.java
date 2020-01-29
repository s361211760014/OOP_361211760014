package lab3;

import java.util.Scanner;

public class Control2 {
    public static void main(String[] args) {

        //if-else -> เป็นคำสั่งที่เลือกทำอย่างใดอย่างหนึ่ง
        //โครงสร้างคำสั่ง if-else
        //  if (เงื่อนไข) {
        //  คำสั่งของ if เมื่อเงื่อนไขเป็นจริง;
        //  }else{
        //  คำสั่งของ if  เมื่อเงื่อนไขเป็นเท็จ;
        // }

        Scanner SC = new Scanner(System.in);
        System.out.print("How old are you? : ");
        int age =SC.nextInt();

        if (age > 60) {
            System.out.println("Your are old (คุณแก่แล้ว).");
        } else {
            System.out.println("You are not old yet. (คุณยังไม่แก่)");
        }


    }//main
}//class