import java.util.Scanner;
public class ComputeAreawithinput {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner input = new Scanner(System.in);
        //prompt user to enter the input
        System.out.println("Enter a number for radius:");

        double radius = input.nextDouble();
        double area = 3.14 *radius * radius;
        System.out.println(" The area for the circle of radius"+ radius + " is " + area);

    }
    
}
