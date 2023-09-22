import java.util.Scanner;

public class BanhDaNem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Số nem cần rán: ");
        int n = sc.nextInt();

        if (n >= 1 && n <= 9){
            System.out.println("Rán 1 lần");
        }

        if (n > 9) {
            int i = n / 9;
            System.out.println("Cần " + Math.ceil(i) + " để rán hết chỗ nem");
    }
}
}

