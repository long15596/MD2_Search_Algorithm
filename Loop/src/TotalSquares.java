import java.util.Scanner;

public class TotalSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        double num1 = sc.nextDouble();
        System.out.println("Nhập số thứ hai: ");
        double num2 = sc.nextDouble();
        double sum = 0;
        for (double i = num1; i < num2; i++) {
            sum += Math.pow(i,2);
        }
        System.out.println("Tổng bình phương các số: " + sum);
    }
}
