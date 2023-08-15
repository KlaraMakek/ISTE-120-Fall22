import java.util.Scanner;

/**
 * Description - Easter
 * @author Klara Makek
 * @version 16.10.2022.
 * Course: ISTE-120
 * LAB-06
 */
/************** JAVADOC ************************/
public class TestEaster {
    public static void main(String[] args) {
        // initialize scanner
        Scanner test = new Scanner(System.in);
        // print....
        System.out.print("Enter the year: ");
        // enter the year
        int year = test.nextInt();

        // initialize easter
        Easter easter = new Easter(year);
        // print...
        System.out.println("Month: " + easter.getEasterSundayMonth()
                + "\nDay: " + easter.getEasterSundayDay());
        // close
        test.close();

    }
}
