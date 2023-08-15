/**
 * Description - Easter
 * @author Klara Makek
 * @version 16.10.2022.
 * Course: ISTE-120
 * LAB-06
 */
/************** JAVADOC ************************/
// initializing
public class Easter {
    private int year;
    private int month;
    private int day;

    // setter easter
    public Easter(int year) {
        this.year = year;
        calculate();
    }

    // math calculations
    public void calculate() {
        int a = year % 19;
        int b = year / 100;
        int c = year % 100;
        int d = b / 4;
        int e = b % 4;
        int g = (8 * b + 13) / 25;
        int h = (19 * a + b - d - g + 15) % 30;
        int j = c / 4;
        int k = c % 4;
        int m = (a + 11 + h) / 319;
        int r = (2 * e + 2 * j - k - h + m + 32) % 7;
        // month and day calculations
        month = (h - m + r + 90) / 25;
        day = (h - m + r + month + 19) % 32; // i do need to be carful with +/-
    }

    /**
     * Month for easter
     * 
     * @return month
     */
    public int getEasterSundayMonth() {
        return month;
    }

    /**
     * Day for easter
     * 
     * @return day
     */
    public int getEasterSundayDay() {
        return day;
    }
}
