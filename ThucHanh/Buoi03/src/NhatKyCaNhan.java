import java.io.*;
import java.util.Scanner;

public class NhatKyCaNhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập nội dung nhật ký: ");
        String content = scanner.nextLine();

        // Ghi file
        try (FileWriter writer = new FileWriter("nhatky.txt", true)) {
            writer.write(content + "\n");
            System.out.println("Đã lưu nhật ký!");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
        }

        // Đọc file
        System.out.println("\n=== NỘI DUNG NHẬT KÝ ===");
        try (BufferedReader reader = new BufferedReader(new FileReader("nhatky.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file!");
        }

        scanner.close();
    }
}
