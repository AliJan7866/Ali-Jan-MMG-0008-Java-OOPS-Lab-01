import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed in miles per hour: ");
        double mph = scanner.nextDouble();
        double kph = mph * 1.60934;
        System.out.println("Equivalent speed in kilometers per hour: " + kph);
    }
}
