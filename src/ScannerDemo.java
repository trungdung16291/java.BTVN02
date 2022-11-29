import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
//        khởi tạo đối tượng scanner

        Scanner sc = new Scanner(System.in);

//        nhập tên
        System.out.println("Nhập tên :");
        String name = sc.nextLine();

        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();



        System.out.println("Nhập tuổi :");
        int age = Integer.parseInt(sc.nextLine());

        // cách 1 : khắc phucj lỗi trôi lệnh

//        int age = Integer.parseInt(scanner.nextLine());

//        cách 2

//        int age = sc.nextInt();
//        sc.nextLine();

        System.out.println("Nhập email:");
        String email =sc.nextLine();

//        println : tự động xuống dòng

//        System.out.println("Tên tôi là : " +name + ".Địa chỉ là : " + address
//        + " . Năm nay toi " + age + "tuổi"
//        + ".email của tôi là :" +email);

        System.out.println("Tên :" + name);
        System.out.println("tuổi :" + age);
        System.out.println("Email :" + email);
        System.out.println(" Địa chỉ :" + address);


//        print : ko tự động xuống dòng

        System.out.print("Tên :" + name +"/n");
        System.out.print("tuổi :" + age +"/n");
        System.out.print("Email :" + email+"/n");
        System.out.print(" Địa chỉ :" + address+"/n");

//printf : In theo định dạng

        System.out.printf("Tên : %s/n" ,name);
        System.out.printf("Tên : %d/n", age);
        System.out.printf("Tên : %s/n" ,email);
        System.out.printf("Tên : %s/n" ,address);



        System.out.printf("%-20s %-18s %-18s\n", "Họ tên", "Email", "Số điện thoại");
        System.out.printf("%-20s %-18s %-18d\n", "Bùi Văn Hiên", "hien@gmail.com", 25);
        System.out.printf("%-20s %-18s %-18d\n", "Nguyễn Thị Thu Hằng", "hien@gmail.com", 27);
        System.out.printf("%-20s %-18s %-18d\n", "Bùi Phương Loan", "hien@gmail.com", 18);

//        %- là căn lề trái..k có - là căn lề phải


    }
}
