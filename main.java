import java.util.Scanner;

public class TextInputValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "";

        try {
            System.out.print("Insert text: ");
            text = sc.nextLine();

            if (text.trim().isEmpty()) {
                throw new IllegalArgumentException("Text input cannot be blank");
            }

            System.out.println("Text: " + text);
        } catch (Exception e) {
            System.out.println("Error, insert a string (text) please.");
        } finally {
            System.out.println("The program has finished.");
            sc.close();
        }
    }
}
