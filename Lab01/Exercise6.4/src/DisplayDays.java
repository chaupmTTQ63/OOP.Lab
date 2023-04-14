import java.util.Scanner;

public class DisplayDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        if (year <= 0) {
        	System.out.println("Invalid year");
        	System.exit(0);
        }
        System.out.println("Enter the month: ");
        String month = input.next();
        String[] arr = {"January", "March", "May","July","August",
                "October","December","Jan","Mar","May","Jul","Aug","Oct",
                "Dec","1","3","5","7","8","10","12","April","June","September",
                "November","Apr","Jun","Sep","Nov","4","6","9","11","February","Feb","2"};  
        boolean check = false;
        for (int m = 0; m < arr.length; m++) {
        	if (month.equals(arr[m])) {
        		check = true;
        		break;
        	}
        }
        if(check == false){
        	System.out.println("Invalid month");
        }
        String[] arr1 = {"January", "March", "May","July","August",
                "October","December","Jan","Mar","May","Jul","Aug","Oct",
                "Dec","1","3","5","7","8","10","12"};
        String[] arr2 = {"April","June","September","November","Apr",
                "Jun","Sep","Nov","4","6","9","11"};
        String[] arr3 = {"February","Feb","2"};
        boolean isLeapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        
        if (isLeapYear) {
            for (int i = 0; i < arr1.length; i++) {
                if (month.equals(arr1[i])) {
                    System.out.println("31");
                }
            }
            for (int j = 0; j < arr2.length; j++) {
                if (month.equals(arr2[j])) {
                    System.out.println("30");
                }
            }
            for (int k = 0; k < arr3.length; k++) {
                if (month.equals(arr3[k])) {
                    System.out.println("29");
                }
            }
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (month.equals(arr1[i])) {
                    System.out.println("31");
                }
            }
            for (int j = 0; j < arr2.length; j++) {
                if (month.equals(arr2[j])) {
                    System.out.println("30");
                }
            }
            for (int k = 0; k < arr3.length; k++) {
                if (month.equals(arr3[k])) {
                    System.out.println("28");
                }
            }
        }
    }
}
