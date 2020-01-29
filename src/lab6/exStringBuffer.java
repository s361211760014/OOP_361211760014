package lab6;

import java.util.StringTokenizer;

public class exStringBuffer {
    public static void main(String[] args) {

        // StringBuffer เป็นคลาส ที่มีเมธอคต่างๆ
        // ที่สามารถปรับปรุงแก้ไขข้อมูลที่เป็น Sting ได้มากกว่าคลาส Sting ทั่วไป

        StringBuffer strBuf = new StringBuffer("Hello");
        System.out.println(strBuf);
        //append() ใช้สำหรับต่อ String
        strBuf.append("Saiyai");
        System.out.println(strBuf);
        System.out.println(strBuf.reverse());
        strBuf.delete(0,6);
        System.out.println(strBuf);


        //StringTokenizer
        String s = "Rain poured down, poured down, poured down" +
                "To bring a closet, a bathroom, a bathroom" +
                "To wash a wet shirt to wet a towel to wash a wet towel" +
                "Keep the shirt wet Wet shirt Wet shirt";

        StringTokenizer tokenizer = new StringTokenizer(s);
        int countWord = tokenizer.countTokens();
        System.out.println("Word count from message: "+countWord);

        //word cutting
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}//class
