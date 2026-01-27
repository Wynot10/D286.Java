public class Cars {
    private String make;
    private String model;
    private String color;
    private int year;


    // Constructor Overloading when declaring numerous constructors

    // No Argument Constructor used to set default values
    public Cars() {
        make = "Make of Car";
        model = "Model of Car";
        color = "Color of Car";
        year = -1;
    }

    // 1 Argument Constructor used to set default values
    // You can have as many declared constructors as long
    // as they do not have the same amount of argument lists
    public Cars(int year) {
        make = "Created with 4 argument constructor";
        model = "Model of Car";
        color = "Color of Car";
        year = -10;
    }


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


