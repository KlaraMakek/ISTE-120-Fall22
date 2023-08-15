/**
 * Practical 4 - Hospital
 * 
 * @author Klara Makek
 * @date 2.12.2022.
 *       ISTE 120 - Surgical
 */
public class Surgical extends Patient {
    private String procedure;

    // constrctor
    public Surgical(String name, int id, int numberOFBEds, String procedure) {
        super(name, id, "S", numberOFBEds); // from the patient
        this.procedure = procedure;
    }

    // prints....
    public String toString() {
        return String.format("Surgical %s\nThe patient's procedure is %s\nPrice: $%.2f\n", super.toString(), procedure,
                calculateRoomPrice());
    }
}
