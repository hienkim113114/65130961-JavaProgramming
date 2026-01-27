import java.util.Scanner;

public class Lab1_Bai3_TheTich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh khối lập phương: ");
        double canh = sc.nextDouble();

        double theTich = Math.pow(canh, 3);

        System.out.println("Thể tích khối lập phương: " + theTich);
    }
}
