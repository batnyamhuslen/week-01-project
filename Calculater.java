import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Энгийн Тооцоолуур ===");


        System.out.println("Эхний тоо авах");
        double num1 =scanner.nextDouble();

        System.out.println("Хоёрдахь тоо авах");
        double num2 = scanner.nextDouble();

        System.out.println("Үйлдэл оруулна уу (+, -, *, /)");
        String op =scanner.next();

        double result = 0;
        boolean error = false;

        if (op.equals("+")) {
            result = num1 + num2;
        }
        else if (op.equals("-")) {
            result = num1 - num2;
        }
        else if (op.equals("*")) {
            result = num1 * num2;
        }
        else if (op.equals("/")) {
            if (num2 == 0) {
                System.out.println("Error: 0-д хуваах боломжгүй!");
                error = true;
            }
            else {
                result = num1 / num2;
            }
        }
        else {
            System.out.println("Error: Буруу үйлдэл оруулсан байна!");
            error = true;
        }
        if (!error) {
            System.out.println("Үр дүн:" + result);
        }
        scanner.close();

    }
}
