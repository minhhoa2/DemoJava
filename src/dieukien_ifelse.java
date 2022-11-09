/**
 * Bài tập : viết 1 chương trình cho phép nhập 1 số nhỏ hơn 30 dung if,
 * else để in ra khoảng giá trị của số đó khoảng (<10 , <20 , <30)
 */
import java.util.Scanner;
public class dieukien_ifelse {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap diem so :");
            int marks = sc.nextInt();
            if (marks <= 10) {
                System.out.println("diem thuoc khoang nho hon 10");
            } else if (marks > 10 && marks <= 20) {
                System.out.println("diem thuoc khoang 10 den 20");
            } else if (marks > 20 && marks <= 30) {
                System.out.println("diem thuoc khoang 20 den 30");
            } else {
                System.out.println("gia tri khong hop le!");
            }
            System.out.println("MH xinh gai" );
        }
    }
