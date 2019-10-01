import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < numbers; i++) {
            String letters = scanner.next();
            int letter = letters.charAt(0);
            sum += letter;
        }
        System.out.println("The sum equals: " + sum);
    }
}
