/**
 * Practical 4 - Hospital
 * 
 * @author Klara Makek
 * @date 2.12.2022.
 *       ISTE 120 - Patient
 */
public class Patient extends Option {

    // atributes
    private String name;
    private int id;
    private String wing;
    private int tv_radio;
    private int numberOFBEds;

    // constructor
    public Patient() {
        name = "undifined";
        id = UNKNOWN;
        wing = "undifined";
        tv_radio = UNKNOWN;
        numberOFBEds = UNKNOWN;
    }

    // parametarised constructor
    public Patient(String name, int id, String wing, int numberOFBEds) {
        this.name = name;
        this.id = id;
        this.wing = wing;
        this.numberOFBEds = numberOFBEds;

                // if tv radio is the request then is the output else its the other output
                if (wing.equals(SURGICAL_WING)) {
                    if (numberOFBEds > DEFOUT_BED_NUMBER) {
                        this.tv_radio = TV;
                    } else {
                        this.tv_radio = RADIO;
                    }
                }
                // if tv radio is the request then is the output else its the other output
                if (wing.equals(MATERNITY_WING)) {
        
                    if (numberOFBEds > DEFOUT_BED_NUMBER) {
                        this.tv_radio = TV_AND_RADIO;
                    } else
                        this.tv_radio = TV;
                }
                // if tv radio is the request then is the output else its the other output
                if (wing.equals(ORTHOPADIC_WING)) {
                    if (numberOFBEds > DEFOUT_BED_NUMBER) {
                        this.tv_radio = RADIO;
                    } else {
                        this.tv_radio = NO_TV_OR_RADIO;
                    }
                }
    }

    // calculates the room price
    @Override
    double calculateRoomPrice() {
        double tv_radio_factor = 0;
        double wing_factor = 0;
        // if tv radio is the request then is the output
        if (tv_radio == TV_AND_RADIO) {
            tv_radio_factor = 2;
        }
        // if tv radio is the request then is the output
        if (tv_radio == TV) {
            tv_radio_factor = 1.5;
        }
        // if tv radio is the request then is the output
        if (tv_radio == RADIO) {
            tv_radio_factor = 1.2;
        }
        // if tv radio is the request then is the output
        if (tv_radio == NO_TV_OR_RADIO) {
            tv_radio_factor = 1;
        }
        // if tv radio is the request then is the output
        if (wing.equals(SURGICAL_WING)) {
            wing_factor = 2.5;
        }
        // if tv radio is the request then is the output
        if (wing.equals(MATERNITY_WING)) {
            wing_factor = 1.5;
        }
        // if tv radio is the request then is the output
        if (wing.equals(ORTHOPADIC_WING)) {
            wing_factor = 1.1;
        }
 // return the calculation
        return INITIAL_ROOM_PRICE * tv_radio_factor * wing_factor;
    }

    public String toString() {
        String TR = " ";
        // if tv radio is the request then the output prints in the toString
        if (tv_radio == TV_AND_RADIO) {
            TR = "with TV and radio";

        } // if tv radio is the request then the output prints in the toString
        else if (tv_radio == TV) {
            TR = "with TV";

        } // if tv radio is the request then the output prints in the toString
        else if (tv_radio == RADIO) {
            TR = "with radio";

        }else{
            TR = "Has no TV or radio";
        }
        String text = String.format(
                "Patient %d : %s is in the wing %s\nThis is the room with %d number of beds and %s.", id, name, wing,
                numberOFBEds, TR);
        return text;// return text
    }
}
