public class Car {
    private String brand;
    private String model;
    private int year;

    
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
    }

    public static void main(String[] args) {
       
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic", 2021);

      
        System.out.println("Car 1:");
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: " + car1.getYear());
        car1.displayInfo();

        System.out.println("\nCar 2:");
        System.out.println("Brand: " + car2.getBrand());
        System.out.println("Model: " + car2.getModel());
        System.out.println("Year: " + car2.getYear());
        car2.displayInfo();
    }
}
