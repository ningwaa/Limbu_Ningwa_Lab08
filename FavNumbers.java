import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favoriteInteger = 0;
        double favoriteDouble = 0;
        favoriteInteger = SafeInput.getInt(in, "Enter your favorite integer ");
        favoriteDouble = SafeInput.getDouble(in, "Enter your favorite double ");
        System.out.println("\n Your favorite integer is: " + favoriteInteger);
        System.out.println("\n Your favorite double is: " + favoriteDouble);
    }

}
