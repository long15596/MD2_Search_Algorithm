import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ 1: ");
        double num1 = sc.nextDouble();
        System.out.println("Nhập số thứ 2: ");
        double num2 = sc.nextDouble();
        System.out.println("Nhập số thứ 3: ");
        double num3 = sc.nextDouble();

        double max = num1;

        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }

        System.out.println("Số lớn nhất là: " + max);
    }
}
