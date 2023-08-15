import java.util.Scanner;
import java.util.jar.Attributes.Name;

/**
 * Description - Practical 2 - Make a class and it's atributes for it
 * 
 * @author Klara Makek
 * @version 24.10.2022
 *          120 - Practical 2
 */
public class TestPetient {
    public static void main(String[] args) {
        // scanner
        Scanner in = new Scanner(System.in);

        // pareent cons 1
        Petient p1 = new Petient();
        // prints defolt
        System.out.printf("Name: %15s, Gender: %c, Height: %.1f kg, Wight: %.1f cm", p1.getName(), p1.getGender(),
                p1.getWeight(), p1.getHight());

        // prints name
        System.out.printf("\nName: %15s, Gender: %c, Height: %.1f kg, Wight: %.1f cm", p1.setName(), p1.setGender(),
                p1.setWeight(), p1.setHight());

        // pareent cons 2
        Petient p2 = new Petient();
        // scans and prints the atruibues
        System.out.print("\nEnter Name: ");
        String name = in.next();
        System.out.print("Enter Gender: ");
        char gender = in.next().charAt(0);
        System.out.print("Enter height: ");
        double height = in.nextDouble();
        System.out.print("Enter Weight: ");
        double weight = in.nextDouble();
        System.out.printf("\nPetiens name: %15s", name);
        System.out.printf("\nPetiens gender:", gender);
        System.out.printf("\nPetiens height: %,2.2f cm", height);
        System.out.printf("\nPetiens weight: %,2.2f kg", weight);
        System.out.printf("\nPetiens BMI: ", p2.getBMI());

    }

}
