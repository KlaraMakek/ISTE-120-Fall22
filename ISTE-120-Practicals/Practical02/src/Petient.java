import java.util.EnumSet;

/**
 * Description - Practical 2 - Make a class and it's atributes for it
 * 
 * @author Klara Makek
 * @version 24.10.2022
 *          120 - Practical 2
 */
public class Petient {

    // constrctor
    private String name;
    private char gender;
    private double weight;
    private double height;

    // defoult
    public Petient() {
        name = "Unknown"; // name
        gender = 'F'; // gender
        weight = 0; // weight
        height = 0; // height
    }

    /**
     * for a name
     * 
     * @return name
     */
    public String getName() {
        if (name.length() == 0) {
            System.out.println("The imput is not corect!");
            return name;
        }
        return name;
    }

    // setter
    public String setName() {
        return "George Brown";
    }

    /**
     * gender
     * 
     * @return gender
     */
    public char getGender() {

        if (gender == 'F' && gender == 'M') {
            System.out.println("The imput is not corect!");
            return gender;
        }
        return gender;
    }

    // setter
    public char setGender() {
        return 'M';
    }

    /**
     * weight
     * 
     * @return weight
     */
    public double getWeight() {
        if (weight == 0.01) {
            System.out.println("The imput is not corect!");
            return -999.00;
        }
        return weight;
    }

    // setter
    public double setWeight() {
        return 98;
    }

    /**
     * height
     * 
     * @return height
     */
    public double getHight() {
        if (height == 0.01) {
            System.out.println("The imput is not corect!");
            return -999.00;
        }
        return height;
    }

    // setter
    public double setHight() {
        return 178;
    }

    /**
     * BMI
     * 
     * @return BMI
     */
    public double getBMI() {
        if (gender == 'F') {
            return (getWeight() * 0.95) / Math.pow((getHight() * 0.0095), 2);
        } else if (gender == 'M') {
            return (getWeight() * 1.02) / Math.pow((getHight() * 0.0102), 2);
        } else {
            System.out.println("The imput is not corect!");
            return -999.00;
        }

    }

}
