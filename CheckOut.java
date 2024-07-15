import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCost = 0.0;
        boolean continueShopping = true;

        while (continueShopping) {
            double itemPrice = SafeInput.getRangedDouble(scanner, "Enter the price of your item ($0.50 - $9.99):", 0.50, 9.99);
            totalCost += itemPrice;

            continueShopping = SafeInput.getYNConfirm(scanner, "Do you have more items to add?");
        }

        System.out.printf("Total cost: $%.2f%n", totalCost);

        scanner.close();
    }
}
