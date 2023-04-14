import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args){
        Scanner strNum = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a = strNum.nextDouble();
        System.out.println("Enter the value of b: ");
        double b = strNum.nextDouble();
        double x;
        if (a == 0){
            System.out.println("The equation does not have solution!");
        }else{
            x = -b/a;
            System.out.println("The solution of the equation is: " + x);
        }
    }
}