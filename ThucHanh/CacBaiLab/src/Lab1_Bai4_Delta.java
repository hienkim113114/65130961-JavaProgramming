import java.util.Scanner;

public class Lab1_Bai4_Delta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập c: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        System.out.println("Delta = " + delta);

        if (delta >= 0) {
            System.out.println("Căn delta = " + Math.sqrt(delta));
        } else {
            System.out.println("Delta âm, không có căn bậc hai thực");
        }
    }
}
