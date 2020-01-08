package lab2;

import java.util.Scanner;

public class Basicjava2 {

    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.println("Your name is "+name);
//
//        System.out.println("Enter your email: ");
//        String email = sc.nextLine();
//        System.out.println("Your email is "+email);
//
//        System.out.println("Enter your age: ");
//        String age = sc.nextLine();
//        System.out.println("Your age is "+age);

        //input integer and floating
        System.out.println("Enter an number: ");
        int num =sc.nextInt();
        System.out.println("You entered number: "+num);

        System.out.println("Enter a real number: ");
        double d = sc.nextDouble();
        System.out.println(d);



    }


}//class
