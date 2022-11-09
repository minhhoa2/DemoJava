/**
 * Bài tập  : nhập 1 số từ bàn phím đếm từ bán phím . Đếm từ 1 đến số đó .
 */
import java.util.Scanner;

public class vonglap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap so a " );
        int number  = sc.nextInt();
            for (int i = 1; i <= number; i++) {
                System.out.println(i);
            }
        }
    }
