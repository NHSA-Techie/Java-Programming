import java.util.Scanner;

public class Gratutity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the subtotal");
        double subtotal = input.nextDouble();

        System.out.println("Enter the  gratutity fee rate");
        double gratutityRate = input.nextDouble();


        double gratutity = subtotal * (gratutityRate/100);

        double total = subtotal + gratutity;

        System.out.println("The gratutity is $"+ gratutity +" and the total is $" + total);




    


    }
}
