import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int year = SafeInput.getRangedInt(scanner, "Enter your birth year (1950-2010):", 1950, 2010);
            int month = SafeInput.getRangedInt(scanner, "Enter your birth month (1-12):", 1, 12);
            int day;
            switch (month) {
                case 2:
                    day = SafeInput.getRangedInt(scanner, "Enter your birth day (1-29):", 1, 29);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day = SafeInput.getRangedInt(scanner, "Enter your birth day (1-30):", 1, 30);
                    break;
                default:
                    day = SafeInput.getRangedInt(scanner, "Enter your birth day (1-31):", 1, 31);
            }

            int hours = SafeInput.getRangedInt(scanner, "Enter the hour of your birth (1-24):", 1, 24);
            int minutes = SafeInput.getRangedInt(scanner, "Enter the minutes of your birth (1-59):", 1, 59);

            System.out.println("You were born on " + year + "-" + month + "-" + day + " at " + hours + ":" + minutes);

            scanner.close();
        }
    }
}