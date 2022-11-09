/**
 * Bài tập : viết 1 chương trình cho phép nhập 1 số nhỏ hơn 30 sử dụng switch case để xem nó thuộc khoảng nào ( <10 , <20 , <30) .
 * Và phân biệt được nếu không sử dụng break thì sẽ ra sao ?
 */
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap so a " );
        int a  = sc.nextInt();

        int number = a/10;

        switch (number) {
            case 0:
                System.out.println("so nay be hon 10");

            case 1:
                System.out.println("so nay be hon 20 ");
                break;
            case 2:
                System.out.println("so nay be hon 30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }
    }
}
