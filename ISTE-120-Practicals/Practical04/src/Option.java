/**
 * Practical 4 - Hospital
 * 
 * @author Klara Makek
 * @date 2.12.2022.
 *       ISTE 120 - Option
 */
public abstract class Option {
    String SURGICAL_WING = "S";
    String MATERNITY_WING = "M";
    String ORTHOPADIC_WING = "O";
    int TV = 1;
    int RADIO = 2;
    int TV_AND_RADIO = 3;
    int NO_TV_OR_RADIO = 4;
    int DEFOUT_BED_NUMBER = 2;
    int UNKNOWN = -1;
    double INITIAL_ROOM_PRICE = 1499.0;

    abstract double calculateRoomPrice();
}
