import java.util.Scanner;

public class Chatbot {

    public static String getResponse(String input) {

        input = input.toLowerCase();

        if (input.contains("hello")) {
            return "Hi! How can I help you?";
        }

        if (input.contains("course")) {
            return "This lab teaches chatbot development using Java.";
        }

        if (input.contains("bye")) {
            return "Goodbye!";
        }

        return "Sorry, I didn't understand that.";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Chatbot Started. Type 'exit' to quit.");

        while (true) {

            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Chatbot ended.");
                break;
            }

            String response = getResponse(userInput);
            System.out.println("Bot: " + response);
        }

        scanner.close();
    }
}