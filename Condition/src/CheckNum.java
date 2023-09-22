import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Số nhập vào là số chẵn");
        } else {
            System.out.println("Số nhập vào là số lẻ");
        }
    }
}
