public class FinalDemo {

    public static final String EMAIL="admin@techmaster.vn";
    public static void main(String[] args) {


        final String name = "bob ";

        final  String FIRST_NAME = "Anna";
        final int NUMBER;
        NUMBER = 10;

        System.out.println(name);
        System.out.println(FIRST_NAME);
        System.out.println(NUMBER);
        System.out.println(EMAIL);

//        NUMBER=11; không thay đổi giá trị hằng số khi đã khai báo
        System.out.println(sumTwoNamber(10,20));

    }
//    method final thì ko thể overide ( ghi đè )
    public static final int sumTwoNamber(int a , int b) {
        return a+b;



    }
}