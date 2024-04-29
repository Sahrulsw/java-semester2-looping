import java.util.Scanner;

public class loopdowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int number;

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if (number > 0) {
                count++;
            }
        } while (number >= 0);

        System.out.println("You entered " + count + " positive numbers.");
    }
}