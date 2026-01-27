import java.util.Scanner;

public class Lab1_Bai2_ChuviDT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double dai = sc.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double rong = sc.nextDouble();

        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNho = Math.min(dai, rong);

        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        System.out.println("Cạnh nhỏ của hình chữ nhật: " + canhNho);
    }
}
