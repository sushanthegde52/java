package lab8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GenericDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Number> numbers = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Integer");
            System.out.println("2. Add Double");
            System.out.println("3. Calculate Sum");
            System.out.println("4. Sort");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer: ");
                    int intValue = scanner.nextInt();
                    numbers.add(intValue);
                    break;
                case 2:
                    System.out.print("Enter a double: ");
                    double doubleValue = scanner.nextDouble();
                    numbers.add(doubleValue);
                    break;
                case 3:
                    double sum = calculateSum(numbers);
                    System.out.println("Sum: " + sum);
                    break;
                case 4:
                    sortList(numbers);
                    System.out.println("Sorted list: " + numbers);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static double calculateSum(List<? extends Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void sortList(List<? extends Number> numbers) {
        Collections.sort(numbers, (a, b) -> Double.compare(a.doubleValue(), b.doubleValue()));
    }
}