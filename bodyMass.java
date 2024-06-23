import java.util.Scanner;

public class bodyMass {
    public static void main(String[] args) {

        // Getting Height Measurement from User
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Height:");
        double height = input.nextDouble();

        // Receiving kilograms from the user

        System.out.print("Enter Your Weight:");
        double weight = input.nextDouble();

        // Clear End of Line Before Reading Input
        input.nextLine();

        // Getting Gender from User
        System.out.print("Enter Your Gender:");
        String gender = input.nextLine();

        double result = weight / (height * height);
        System.out.println("Body Mass index:" + result);

        if (result < 25) {
            System.out.println("You Are Weak...");
        } else if (result < 30) {
            System.out.println("You Are Fatty ...");
        } else if (result < 35) {
            System.out.println("Obese Onset...");
        } else {
            System.out.println(" You Are Obese, Contact Your Doctor Immediately!!!");
        }
    }
}
