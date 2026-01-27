public class Cars {
    private String make;
    private String model;
    private String color;
    private int year;

    public void setMake(String carMake) {
        make = carMake;
    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public void setColor(String carColor) {
        color = carColor;
    }

    public void setYear(int carYear) {
        year = carYear;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String printCars() {
        return make+" "+model+" "+color+" "+year;
    }

}


