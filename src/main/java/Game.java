public class Game {
    public static String fizzBuzz(int a) {
        if (a % 3 == 0) {
            return "fizz";
        }
        if (a % 5 == 0) {
            return "Buzz";
        }

        return Integer.toString(a);
    }
}
