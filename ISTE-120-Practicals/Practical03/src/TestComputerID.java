import java.util.Scanner;

/**
 * Practical 3
 * 
 * @author Klara Makek
 * @version 14.11.2022.
 *          ISTE 120
 */
public class TestComputerID {
    public static void main(String[] args) {
        // initilize scaner
        Scanner i = new Scanner(System.in);
        // scanners and prints...

        System.out.print("Enter building code: ");
        String buidingCode = i.nextLine();
        while (buidingCode.length() != 3) {
            System.out.print("Code must be 3 caracters long.");
            buidingCode = i.nextLine();
        }
        System.out.print("Enter room number code: ");
        int roomNumber = i.nextInt();
        while (roomNumber < 1 || roomNumber > 999) {
            System.out.print("Room number must be in 1 .... 999 range.");
            roomNumber = i.nextInt();
        }

        i.nextLine();
        System.out.print("Enter IPAddress code: ");
        String IPAddress = i.nextLine();
        while (IPAddress.length() < 5 || IPAddress.length() > 20) {
            System.out.print("IPAddress must be betwen 5 and 20.");
            IPAddress = i.nextLine();
        }
        System.out.print("Enter computer type code: ");
        String computerType = i.nextLine();
        while (computerType != "PC" || computerType != "MAC" || computerType != "NOTEBOOK" || computerType != "SERVER") {
            System.out.print("Computer type be betwen MAC, NOTEBOOK, PC or SERVER");
            computerType = i.nextLine();
        }
        ComputerID comp1 = new ComputerID(null, 0, null, null);
        System.out.println(comp1.getBuidingCode() + ":" +comp1.buidingCode + ":" + comp1.getIPAddress()+"is a type" + comp1.getComputerType());

        ComputerID comp2= new ComputerID(null, 0, null, null);
        System.out.print(comp2.getComputerID());
    }
}
