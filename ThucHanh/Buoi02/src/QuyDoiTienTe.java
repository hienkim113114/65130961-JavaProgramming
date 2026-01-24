import java.util.Scanner;

public class QuyDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double USD_TO_VND = 23500;
        final double EUR_TO_VND = 27000;

        System.out.print("Nhập số tiền USD: ");
        double usd = sc.nextDouble();

        System.out.print("Nhập số tiền EUR: ");
        double eur = sc.nextDouble();

        double vndFromUsd = usd * USD_TO_VND;
        double vndFromEur = eur * EUR_TO_VND;

        System.out.println("USD sang VND: " + vndFromUsd + " VND");
        System.out.println("EUR sang VND: " + vndFromEur + " VND");

        sc.close();
    }
}
