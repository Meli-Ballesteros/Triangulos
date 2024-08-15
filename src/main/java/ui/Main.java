package ui;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.print("write a number a: ");
        a =sc.nextInt();
        System.out.print("write b number b: ");
        b=sc.nextInt();
        System.out.println("write c number c: ");
        c=sc.nextInt();

        if(a ==b & b == c){
            System.out.println("this is a triangle equilatero");

        } else if(a==b|| a==c || b==c){
            System.out.println("this is a triangle isosceles");
        }else{
            System.out.println("this is a triangle scalene");
        }






    }
}


