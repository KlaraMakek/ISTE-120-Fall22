import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Practical 4 - Hospital
 * 
 * @author Klara Makek
 * @date 2.12.2022.
 *       ISTE 120 - Hospital/tester
 */
public class Hospital extends Patient {
    private static String FILE_NAME;

    public static void main(String[] args) {
        int surgical;
        int maternal;

        int surgicalCounter = 0;
        int materbnalCounter = 0;
        int ortopedicCounter = 0;

        // new array list
        ArrayList<Patient> patient = new ArrayList<Patient>();

        // the list
        Surgical pat1 = new Surgical("Harry T.Everyman", 345, 3, "Bowl Resection");
        Maternaty pat2 = new Maternaty("Martha G.Biggens", 20389, 2, "Thomas");
        Surgical pat3 = new Surgical("Hannah V.Watkings", 3453, 3, "Knee Replacment");
        Maternaty pat4 = new Maternaty("Jane C.Moris", 98234, 1, "Robert");
        Surgical pat5 = new Surgical("James X.Doherty", 11923, 2, "Hip Replacment");
        Ortopedic pat6 = new Ortopedic("Steve Donovan", 1121, 2, "Osteorthritis");
        // adding objects
        patient.add(pat1);
        patient.add(pat2);
        patient.add(pat3);
        patient.add(pat4);
        patient.add(pat5);
        patient.add(pat6);
/** 
        try {
            File file = new File(FILE_NAME);
            if (file.exists()) {
                System.out.println("Adding to the ");
            } else {
                System.out.println("asdasdsa");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
*/
        // to count the patient
        for (Patient x : patient) {
            System.out.println(x);
            if (x instanceof Surgical) {
                surgicalCounter++;
            }
            if (x instanceof Maternaty) {
                materbnalCounter++;
            }
            if (x instanceof Ortopedic) {
                ortopedicCounter++;
            }
        }
        System.out.print("Maternaty patinets: " + materbnalCounter + "\nSurgical patinets: " + surgicalCounter
                + "\nOrtopedic patinets: " + ortopedicCounter);
    }
}
