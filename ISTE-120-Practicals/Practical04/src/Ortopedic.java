
/**
 * Practical 4 - Hospital
 * 
 * @author Klara Makek
 * @date 2.12.2022.
 *       ISTE 120 - Ortopedic
 */
public class Ortopedic extends Patient {
    private String disorder;
// constrctor
    public Ortopedic(String name, int id, int numberOFBEds, String disorder) {
        super(name, id, "O", numberOFBEds); // from the patient
        this.disorder = disorder;
    }
// prints....
    public String toString() {
        return String.format("Ortopedic %s\nThe patuient's ortopedic disorder is %s\nPrice $%.2f\n", super.toString(),
                disorder, calculateRoomPrice());
    }

}
