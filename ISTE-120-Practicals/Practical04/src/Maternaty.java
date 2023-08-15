/**
 * Practical 4 - Hospital
 * 
 * @author Klara Makek
 * @date 2.12.2022.
 *       ISTE 120 - Maternaty
 */
public class Maternaty extends Patient {
    private String childsName;

    // constructor
    public Maternaty(String name, int id, int numberOFBEds, String childsName) {
        super(name, id, "M", numberOFBEds); // from patient
        this.childsName = childsName;
    }

    // prints....
    public String toString() {
        return String.format("Materty %s\nThe chosen name for the child is %s.\nPrice $%.2f\n", super.toString(),
                childsName, calculateRoomPrice());
    }

}
