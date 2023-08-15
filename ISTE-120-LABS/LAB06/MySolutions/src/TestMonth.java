import java.util.Scanner;

/**
 * Description - Months Test
 * @author Klara Makek
 * @version 16.10.2022.
 * Course: ISTE-120
 * LAB-06
 */
/************** JAVADOC ************************/
public class TestMonth {
    public static void main(String[] args) {
        // initializing scanner
        Scanner scan = new Scanner(System.in);
        // print...
        System.out.print("Enter the number of the month: ");
        // entering the month
        int month = scan.nextInt();
        // setter
        Month newMonth = new Month(month);
        // printing....
        System.out.println("The month is: " + newMonth.getName());
        // close
        scan.close();
    }

}
