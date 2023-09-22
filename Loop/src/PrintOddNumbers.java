import java.util.Scanner;

public class PrintOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int num1 = sc.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int num2 = sc.nextInt();

        for (int i = num1; i < num2; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
