import java.util.Scanner; 
public class Calculation{
	public static void main(String[] args){
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = number.nextDouble();
		System.out.println("Enter the second number: ");
		double num2 = number.nextDouble();
		double sum = num1 + num2;
		System.out.println("The sum of these two numbers: " + sum);
		double diff = num1 - num2;
		System.out.println("The difference these of two numbers: " + diff);
		double product = num1*num2;
		System.out.println("The production these of two numbers: " + product);
		if (num2 != 0){
			double quotient = num1/num2;
			System.out.println("The quotient of these two numbers: " + quotient);
		}



	}
}