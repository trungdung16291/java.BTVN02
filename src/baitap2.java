import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);

        System.out.println("nhập vào 1 chuỗi bất kỳ từ bàn phím");
        String name = sc.nextLine();
        System.out.print("1. In ra chuỗi in hoa của chuỗi vừa nhập: "+name.toUpperCase()+ "\n");
        System.out.print("2. In ra chuỗi in thường của chuỗi vừa nhập: "+name.toLowerCase()+ "\n");
        System.out.print("3. Đếm số ký tự trong chuỗi: "+name.length()+ "\n");
        System.out.print("4. In ra ký tự cuối cùng trong chuỗi: " +name.charAt(name.length()-1)+ "\n");
        System.out.print("5. In ra 5 ký tự đầu tiên của chuỗi: "+name.substring(0,5)+ "\n");

        if (name.contains("hello")==true){
            System.out.println("6.Kiểm tra chuỗi vừa nhập có chứa chuỗi “hello” hay không? in ra true nếu chứa, ngược lại thì in ra false nếu không chứa: true");

        }else {
            System.out.println("Kiểm tra chuỗi vừa nhập có chứa chuỗi “hello” hay không? in ra true nếu chứa, ngược lại thì in ra false nếu không chứa : false");
        }
// bài dự đoán kết quả
        int a =10;
        int b=20;


        System.out.println(a +"-" +b);

        int c = a++; // a = 11 , c = 10
        System.out.println(+ a + ","+ c );
        int d = ++a; // a=12 , d=12
        System.out.println(a +"," +d);

        int e = a++ + ++b; // a=13 , b=21 , e =33
        System.out.println(a +"," +b + "," + e);
        int f = ++a + ++b; // a=14 , b=22 , f=36
        System.out.println(a + "," +b + "," +f);
//        hoán đổi vị trí a==b,b==a

        int x=10;
        int y=20;
        int z;
        System.out.println(z=x);
        System.out.println(x=y);
        System.out.println(y=z);
    }

}
