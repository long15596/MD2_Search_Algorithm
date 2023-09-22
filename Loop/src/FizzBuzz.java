import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int num1 = sc.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
         if (i == 15){
             System.out.println("fizzbuzz");
         } else if (i % 3 == 0) {
             System.out.println("fizz");
         } else if (i % 5 == 0) {
             System.out.println("buzz");
         }
        }
    }
}
