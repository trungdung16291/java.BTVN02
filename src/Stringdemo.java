public class Stringdemo {
    public static void main(String[] args) {
//        khai báo kiểu literal
        String name = "Trung Dũng";
         String name1 = "Trung Dũng";


//         khai báo kiểu Object (new)
        String email = new String("trungdung16291@gmail.com");
        String email1 = new String("trungdung16291@gmail.com");

        System.out.println("name : " + name);
        System.out.println("email : " + email);

//        so sánh chuỗi
//        ==so sánh về mặt địa chỉ ô nhớ ( thường đc áp dụng với primative type)

        System.out.println(name == name1);   /*true*/
        System.out.println( email == email1);  /* false*/

//        equals so sánh về ký tự độ dài

//        phương thức String
        String text = "Xin chào các bạn";
        String text1 = "Xin chào các bạn";
        String text2 = "Xin cHào các bạn";


        System.out.println("In hoa : " + text.toLowerCase());
        System.out.println("In thường : " + text.toLowerCase());
        System.out.println("Độ dài : " + text.length());
        System.out.println("Cắt chuỗi :" + text.substring(0,8));
        System.out.println("Vị trí số 10 là ký tự :" + text.charAt(9));
        System.out.println("So sánh : " +text.equals(text1));
        System.out.println("So sánh không phân biệt hoa thường :" + text.equalsIgnoreCase(text2));



    }
}
