import java.util.Scanner;

public class IT24100958Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get exam marks with input validation
        System.out.print("Enter exam marks (out of 100): ");
        int examMarks = input.nextInt();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        // Get lab submission marks with input validation
        System.out.print("Enter lab submission marks (out of 100): ");
        int labMarks = input.nextInt();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }

        // Get exam weight as a percentage with input validation
        System.out.print("Enter the percentage given for the exam (must add up to 100 with lab submission): ");
        double perExam = input.nextDouble();
        if (perExam < 0 || perExam > 100) {
            System.out.println("Invalid input for exam percentage. Terminating program.");
            return;
        }

        // Calculate lab submission weight as a percentage (100 - perExam)
        double perLab = 100.0 - perExam;

        // Calculate final marks using corrected variable case (FinalMarks -> finalMarks)
        double finalMarks = (examMarks * perExam / 100.0) + (labMarks * perLab / 100.0);

        System.out.println("\nFinal Exam Marks: " + finalMarks);

        input.close(); // Close the scanner to avoid resource leaks
    }
}