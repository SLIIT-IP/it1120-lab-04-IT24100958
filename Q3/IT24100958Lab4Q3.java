import java.util.Scanner;

public class IT24100958Lab4Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();   


        if (number == 0) {
            System.out.println("The number is: zero");
        } else {
            
            String message = (number > 0) ? "The number is: positive" : "The number is: negative";
            System.out.println(message);
        }

        input.close();  
    }
}