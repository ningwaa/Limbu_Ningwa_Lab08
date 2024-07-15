import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ssnPattern = "\\d{3}-\\d{2}-\\d{4}";
        String ucStudentPattern = "[Mm]\\d{5}";
        String menuChoicePattern = "[OoSsVvQq]";

        String ssn = SafeInput.getRegExString(scanner, "Enter your SSN (e.g., 123-45-6789):", ssnPattern);
        String ucStudentID = SafeInput.getRegExString(scanner, "Enter your UC Student ID (e.g., M12345):", ucStudentPattern);
        String menuChoice = SafeInput.getRegExString(scanner, "Select a menu choice [OoSsVvQq]:", menuChoicePattern);

        System.out.println("Your SSN: " + ssn);
        System.out.println("Your UC Student ID: " + ucStudentID);
        System.out.println("Menu choice: " + menuChoice);

        scanner.close();
    }
}