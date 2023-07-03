import java.util.Scanner;

public class CylinderProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the radius of the scanner");
        double radius = input.nextDouble();

        System.out.println("Input the length of the cylinder");
        double length = input.nextDouble();


        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("The area is :" + area );
        System.out.println("The volume is :5" + volume);
        
    


    }
}

