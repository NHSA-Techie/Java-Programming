import java.util.Scanner;

public class BMImeasurement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = input.nextDouble();

        // Convert weight from pounds to kilograms
        double weight = weightPounds * 0.45359237;

        // Convert height from inches to meters
        double height = heightInches * 0.0254;

        // Calculate BMI
        double bmi = weight/ (height * height);

        System.out.printf("BMI is %.4f%n", bmi);
    }
}
