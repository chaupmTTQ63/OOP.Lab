import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			String ln = "";
			for (int j = 1; j <= (n-i); j++) {
				ln += " ";
			}
			for (int k = 1; k <= (2*i-1); k++) {
				ln += "*";
			}
			System.out.println(ln);
		}
	}
}
