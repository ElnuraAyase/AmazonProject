package stringMethodsTest;

class Car {
    String brand;
    int speed;
    String type = "SUV";

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 120);

        System.out.println("Car Type: " + myCar.type);
        System.out.println("Car Brand: " + myCar.brand);
        System.out.println("Car Speed: " + myCar.speed + " km/h");
    }
}