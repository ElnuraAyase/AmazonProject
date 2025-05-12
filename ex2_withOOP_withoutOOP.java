class Car {
    String brand;
    int speed;
    String type = "SUV";

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}


public void main() {
    Car myCar = new Car("Toyota", 120);

    System.out.println("Car Type: " + myCar.type);
    System.out.println("Car Brand: " + myCar.brand);
    System.out.println("Car Speed: " + myCar.speed + " km/h");
}


//

public class Main {
    public static void main(String[] args) {
        // Data stored in separate variables (no class/object)
        String carBrand = "Toyota";
        int carSpeed = 120;
        String carType = "SUV";

        // Behavior is just functions operating on data
        printCarDetails(carBrand, carSpeed, carType);
    }

    // A standalone function to print car details (not part of any object)
    public static void printCarDetails(String brand, int speed, String type) {
        System.out.println("Car Type: " + type);
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Speed: " + speed + " km/h");
    }
}
