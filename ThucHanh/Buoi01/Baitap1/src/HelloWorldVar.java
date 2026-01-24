import java.util.List;
public class HelloWorldVar {
    public static void main(String[] args) {
        var message = "Hello, World with var!";
        var number = 42;
        var list = List.of("Java", "Modern", "Features");

        System.out.println(message);
        System.out.println("Number: " + number);
        System.out.println("List: " + list);
    }
}
