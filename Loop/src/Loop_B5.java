import java.util.Scanner;

public class Loop_B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        int num = sc.nextInt();
        int total = 0;
        for (int i = 0; i < num; i++) {
            total += i*(i+1);
        }
        System.out.println("Tổng: " + total);
    }
}

class level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        int num = sc.nextInt();

        int total = 0;

        for (int i = 0; i < num; i++) {
            total += ((2 * i + 1)/(2 * i + 2));
        }
        System.out.println("Tổng: " + total);
    }
}
