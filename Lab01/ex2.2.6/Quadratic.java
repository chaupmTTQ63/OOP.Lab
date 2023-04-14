import java.util.Scanner;
import java.lang.Math;

public class Quadratic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coefficients for the equation (ax^2 + bx + c = 0)");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a == 0){
            if (b == 0){
                System.out.println("The equation does not have the solution!");
            }else{
                double x = -c/b;
                System.out.println("The equation have one solution x= " + x);
            }
        }else{
            double delta = b*b - 4*a*c;
            if (delta < 0){
                System.out.println("The equation does not have solution!");
            }else if (delta == 0){
                double x = -b/(2*a);
                System.out.println("The equation have one solution x= " + x);
            }else{
                double x1 = (-b + Math.sqrt(delta))/(4*a);
                double x2 = (-b - Math.sqrt(delta))/(4*a);
                System.out.println("The equation have two solutions x1= " + x1 + " x2= " + x2);
            }
        }
    }
    
}
