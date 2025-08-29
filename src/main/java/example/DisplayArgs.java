package main.java.example;

public class DisplayArgs {
    public static void main(String[] args) {
        // Check if any arguments were provided
        if (args.length > 0) {
            System.out.println("Command-line arguments provided:");
            // Iterate through the args array and print each argument
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }
    }
}