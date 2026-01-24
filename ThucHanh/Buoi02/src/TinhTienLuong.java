import java.util.Scanner;
public class TinhTienLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số giờ làm: ");
        int gioLam = sc.nextInt();

        System.out.print("Nhập lương theo giờ: ");
        double luongGio = sc.nextDouble();

        double tongLuong;

        if (gioLam <= 40) {
            tongLuong = gioLam * luongGio;
        } else {
            int gioVuot = gioLam - 40;
            tongLuong = 40 * luongGio + gioVuot * luongGio * 1.5;
        }

        System.out.println("Số giờ làm: " + gioLam);
        System.out.println("Lương theo giờ: " + luongGio);
        System.out.println("Tổng lương: " + tongLuong);

        sc.close();
    }
}
