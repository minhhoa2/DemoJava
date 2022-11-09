/**
 * Bài 7 : Nhập 1 số từ bàn phím nhỏ hơn 10 . in  số đó ra dạng chữ .
 */
import java.util.Scanner;

public class switch_case_bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap so a " );
        int number  = sc.nextInt();

        switch (number) {
            case 0:
                System.out.println("day la so khong");
                break;
            case 1:
                System.out.println("day la so mot ");
                break;
            case 2:
                System.out.println("day la so hai ");
                break;
            default:
                System.out.println("khong phai so mot hai ba");
        }
    }
}
