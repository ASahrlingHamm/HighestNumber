import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A number, please");
        int a = scanner.nextInt();
        System.out.println("Another number, please");
        int b = scanner.nextInt();

        System.out.println("The highest number is " + Math.max(a, b));

    }
}