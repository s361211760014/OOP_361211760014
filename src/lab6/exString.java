package lab6;

public class exString {
    //String เป็นข้อมูลชนิดข้อความ แตในภาษาจาวา String เป็นคลาส
    //ดังการประกาศตัวแปรชนิด String (เป็นการประกาศ Oject ของคลาส)
    //จึงสามารถเรียกใช้เมธอคต่างๆ ที่อยู่ในคลาส String ได้
    public static void main(String[] args) {
        String msg = "Hello, Saiyai !!!";

        // length() ใช้ในการนับจำนวนตัวอักษรในข้อความ ส่งค่ากลับมาเป็นจำนวนเต็ม (int)
        int len = msg.length();
        System.out.println(len);

        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        System.out.println(msg.charAt(5)); //แสดงตัวอักษรตำแหน่งที่ 5 ของข้อความ

        // concatenating String คือ การต่อข้อความ
        // 1.ใช้เครื่องหมาย +
        String msg2 = "RUTS";
        String msgcon = msg + msg2;
        System.out.println(msgcon);
        //2.ใช้ concat()
        String msgCon2 = msg.concat(msg2);
        System.out.println(msgCon2);


        // compare String คือ การเปรียบเทียบข้อความ 2 ข้อความ
        String m1 = "Saiyai RUTS";
        String m2 = "Saiyai";

        //
        if (m1 == m2) {
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

        System.out.println(m1==m2? "Yes":"No");

        //2. equals() การทำงานจะเหมือนกับการใช้เครื่องหมาย
        if (m1.equals(m2)) {
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
        System.out.println(m1.equals(m2)?"Yes":"No");

        //3. compareTo() ถ้าข้อความเหมือนเป็น 0,

        int x = m1.compareTo(m2);
        System.out.println(x);







    }//main
}//class
