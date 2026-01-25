import java.util.Scanner;

public class QuyDoiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số USD: ");
        double usd = scanner.nextDouble();

        System.out.print("Nhập số EUR: ");
        double eur = scanner.nextDouble();

        double vndFromUSD = usd * 23500;
        double vndFromEUR = eur * 27000;

        System.out.printf("USD → VND: %,.0f%n", vndFromUSD);
        System.out.printf("EUR → VND: %,.0f%n", vndFromEUR);

        scanner.close();
    }
}
