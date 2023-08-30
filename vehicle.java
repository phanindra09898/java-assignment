public class Vehicle
{
    int speed;

    public void speedUp() {
       
        speed += 10;
        System.out.println("Vehicle speed increased by 10 units.");
    }
}


class Car extends Vehicle {
    @Override
    public void speedUp() {
        
        speed += 20;
        System.out.println("Car speed increased by 20 units.");
    }
}

class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        speed += 5;
        System.out.println("Bicycle speed increased by 5 units.");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Car myCar = new Car();
        Bicycle myBicycle = new Bicycle();

        myCar.speedUp();
        myBicycle.speedUp();

        System.out.println("Car Speed: " + myCar.speed);
        System.out.println("Bicycle Speed: " + myBicycle.speed);
    }
}
