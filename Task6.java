import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value in Dollars: ");
        double dollars = scanner.nextDouble();
        double rupees = dollars * 280.71;
        System.out.println("Value in Rupees: " + rupees);
        System.out.println("BUILD SUCCESSFULLY (total time: 4 seconds)");
    }
}
