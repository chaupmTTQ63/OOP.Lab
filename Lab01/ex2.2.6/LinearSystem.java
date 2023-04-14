import java.util.Scanner;

public class LinearSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the coefficients of the first equation (ax + by = c): ");
        double a1 = input.nextDouble();
        double b1 = input.nextDouble();
        double c1 = input.nextDouble();
        
        System.out.print("Enter the coefficients of the second equation (dx + ey = f): ");
        double a2 = input.nextDouble();
        double b2 = input.nextDouble();
        double c2 = input.nextDouble();

        if (a1*b2 - a2*b1 == 0) {
            if (c1*b2 - c2*b1 == 0 && a1*c2 - a2*c1 == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        } else {
            double x = (c1*b2 - c2*b1) / (a1*b2 - a2*b1);
            double y = (a1*c2 - a2*c1) / (a1*b2 - a2*b1);
            
            System.out.println("The solution of the linear system is:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

    }
    
}
