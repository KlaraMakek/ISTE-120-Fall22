/**
 * Description - Times in 2 formats
 * @author Klara Makek
 * @version 16.10.2022.
 * Course: ISTE-120
 * LAB-06
 */
/************** JAVADOC ************************/
public class Hours {
    // initialize
    private int minStart;
    private int minEnd;

    /**
     * starter
     * 
     * @param minStart makes the if statement so if the number is bigger or lager
     *                 it's error
     * @param minEnd   makes the if statement so if the number is bigger or lager
     *                 it's error
     */
    public Hours(int minStart, int minEnd) {
        if (minStart < 0 || minStart > 2359) {
            System.out.println("Error, out side of range.");
            System.exit(0);
        }
        ;
        if (minEnd < 0 || minEnd > 2359) {
            System.out.println("Error, out side of range.");
            System.exit(0);
        }
        ;
        // convert to minutes
        this.minEnd = (minEnd / 100) * 60 + (minEnd % 100);
        this.minStart = (minStart / 100) * 60 + (minStart % 100);
    }

    /**
     * how many hours it past in between
     * 
     * @return hours
     */
    public int getHours() {
        return Math.abs((minEnd - minStart) / 60);
    }

    /**
     * how many minutes past
     * 
     * @return minutes
     */
    public int getMinutes() {
        return Math.abs((minEnd - minStart) % 60);
    }

    /**
     * the time with hours and minutes
     * 
     * @return time
     */
    public double getDecimalTime() {
        return (getHours() + ((double) getMinutes() / 60));
    }

    /**
     * print....
     */
    public String toString() {
        return "Time:" + minStart + " " + minEnd;
    }
}
