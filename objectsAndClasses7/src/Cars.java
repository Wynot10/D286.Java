public class Cars {
    private String make;
    private String model;
    private String color;
    private int year;


    // Constructor Overloading when declaring numerous constructors

    // No Argument Constructor used to set default values
    public Cars() {
        this.make = "Make of Car";
        this.model = "Model of Car";
        this.color = "Color of Car";
        this.year = -1;
    }

    // 1 Argument Constructor used to set default values
    // You can have as many declared constructors as long
    // as they do not have the same amount of argument lists
    public Cars(int year) {
        this.make = "Created with 4 argument constructor";
        this.model = "Model of Car";
        this.color = "Color of Car";
        this.year = -10;
    }


    public void setMake(String carMake) {
        this.make = carMake;
    }

    public void setModel(String carModel) {
        this.model = carModel;
    }

    public void setColor(String carColor) {
        this.color = carColor;
    }

    public void setYear(int carYear) {
        this.year = carYear;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public String printCars() {
        return make+" "+model+" "+color+" "+year;
    }

}


