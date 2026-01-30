package House;

public class Houses {

    private int houseNumber;
    private String houseCity;
    private String houseStreet;
    private String houseState;

    public Houses() {
        this.houseNumber = -1;
        this.houseCity = null;
        this.houseStreet = null;
        this.houseState = null;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setHouseCity(String houseCity) {
        this.houseCity = houseCity;
    }

    public void setHouseStreet(String houseStreet) {
        this.houseStreet = houseStreet;
    }

    public void setHouseState(String houseState) {
        this.houseState = houseState;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getHouseCity() {
        return houseCity;
    }

    public String getHouseStreet() {
        return houseStreet;
    }

    public String getHouseState() {
        return houseState;
    }

    public void printHouse() {
        System.out.println("House: " + houseNumber + " " + houseCity + " " + houseStreet + " " + houseState);
    }
}
