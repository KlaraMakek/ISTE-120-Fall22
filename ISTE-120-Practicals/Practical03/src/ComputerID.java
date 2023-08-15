import java.lang.reflect.Array;

/**
 * Practical 3
 * 
 * @author Klara Makek
 * @version 14.11.2022.
 *          ISTE 120
 */
public class ComputerID {
    String buidingCode;
    String computerType;
    String IPAddress;
    int roomNumber;

    public ComputerID(String buidiString, int roomNumber, String IPAddress, String computerType) {
        buidingCode = "None";
        roomNumber = -1;
        IPAddress = "127.0.0.1";
        computerType = "PC";
    }

    /**
     * gets buidingCode
     * 
     * @return buidingCode
     */
    public String getBuidingCode() {
        return buidingCode;
    }

    /**
     * sets buidingCode
     * 
     * @param buidingCode
     */
    public void setBuidingCode(String buidingCode) {
        this.buidingCode = buidingCode;
    }

    /**
     * gets computerType
     * 
     * @return computerType
     */
    public String getComputerType() {
        return computerType;
    }

    /**
     * sets computerType
     * 
     * @param computerType
     */
    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }

    /**
     * gets IPAddress
     * 
     * @return IPAddress
     */
    public String getIPAddress() {
        return IPAddress;
    }

    /**
     * sets IPAddress
     * 
     * @param iPAddress
     */
    public void setIPAddress(String iPAddress) {
        IPAddress = iPAddress;
    }

    /**
     * gets roomNumber
     * 
     * @return roomNumber
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * sets roomNumber
     * 
     * @param roomNumber
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    /*
     * public void getComputerID(){
     * return computerID;
     * }
     */
    public void setComputerID(String subStrings, String roomNumber) {
        String[] comp = subStrings.split(":");
        buidingCode = comp[0];
        roomNumber = comp[1];
        IPAddress = comp[2];

    }
    public boolean getComputerID(){
        System.out.println(getBuidingCode() + getRoomNumber() + getIPAddress());
        return true;
    }
}
