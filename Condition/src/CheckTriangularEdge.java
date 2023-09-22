import java.util.Scanner;

public class CheckTriangularEdge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cạnh 1: ");
        float edge1 = sc.nextFloat();
        System.out.println("Cạnh 2: ");
        float edge2 = sc.nextFloat();
        System.out.println("Cạnh 3: ");
        float edge3 = sc.nextFloat();

        if (edge1 + edge2 > edge3 && edge2 + edge3 > edge1 && edge1 + edge3 > edge2) {
          if ((edge1 * edge1 == (edge2 * edge2) + (edge3 * edge3)) || (edge2 * edge2 == (edge1 * edge1) + (edge3 * edge3)) || (edge3 * edge3 == (edge1 * edge1) + (edge2 * edge2))) {
              System.out.println("Đây là tam giác vuông");
          } else if (edge1 == edge2 && edge2 == edge3) {
              System.out.println("Đây là tam giác đều");
          } else if (edge1 == edge2 || edge1 == edge3 || edge2 == edge3) {
              System.out.println("Đây là tam giác cân");
          } else if ((edge1 * edge1 > (edge2 * edge2) + (edge3 * edge3)) || (edge2 * edge2 > (edge1 * edge1) + (edge3 * edge3)) || (edge3 * edge3 > (edge1 * edge1) + (edge2 * edge2))) {
              System.out.println("Đây là tam giác tù");
          } else {
              System.out.println("Đây là tam giác nhọn");
          }
        } else {
            System.out.println("Không phải 3 cạnh của tam giác");
        }
    }
}
