import java.util.Scanner;

public class pra01 {
    public static void main(String[] args) {
        int a =10;
        int b=20;


        System.out.println(a +"-" +b);

        int c = a++; // a = 11 , c = 10
        System.out.println(a + "," +c);
         int d = ++a; // a=12 , d=12
        System.out.println(a +"," +d);

        int e = a++ + ++b; // a=13 , b=21 , e =33
        System.out.println(a +"," +b + "," + e);
        int f = ++a + ++b; // a=14 , b=22 , f=36
        System.out.println(a + "," +b + "," +f);

        int x =11;
        int y=21;
        int z;
        System.out.println(z=x);
        System.out.println(x=y);
        System.out.println(y=z);



    }





}
