/**
 * Description - Month
 * @author Klara Makek
 * @version 16.10.2022.
 * Course: ISTE-120
 * LAB-06
 */
/************** JAVADOC ************************/
public class Month {
    // initialize
    private int month;

    /**
     * month setter
     * 
     * @param month setter
     */
    public Month(int month) {
        this.month = month;
    }

    /**
     * getName string
     * 
     * @return string months + substring
     */
    public String getName() {
        return "January  February March    April    May      June     July     Agust    SeptemberOctober  November December "
                .substring((month - 1) * 9, ((month - 1) * 9 + 9));
    }

}
