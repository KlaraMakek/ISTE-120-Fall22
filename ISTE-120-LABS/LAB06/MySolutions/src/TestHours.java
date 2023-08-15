
/**
 * Description - Times in 2 formats test
 * @author Klara Makek
 * @version 16.10.2022.
 * Course: ISTE-120
 * LAB-06
 */
/************** JAVADOC ************************/
import java.util.Scanner;

public class TestHours {
    public static void main(String[] args) {
        //initialize scanner
        Scanner time = new Scanner(System.in);
        // print...
        System.out.print("Enter the first time: ");
        // scans for the first time
        int minStart = time.nextInt();

        // printing...
        System.out.print("Enter the second time: ");
        // scan for the second number
        int minEnd = time.nextInt();

        // initializing
        Hours timeINT = new Hours(minStart, minEnd);
        // prints...
        System.out.printf("\nTime in hours and minutes: %d hours, %d minutes", timeINT.getHours(),
                timeINT.getMinutes());
        System.out.printf("\nTime in decimal: %.1f hours", timeINT.getDecimalTime());

        // close...
        time.close();

        //What happens if you enter a 0 or a 13 for the month number?
        //It's an error but it doesn't print error because I didn't set it to.
    }

}
