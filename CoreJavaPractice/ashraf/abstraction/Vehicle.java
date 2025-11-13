
package ashraf.abstraction;

abstract class Vehicle {
    abstract void  start();

    public void fuelType(){
        System.out.println("MOst car uses petrol or diesel as fuel type");
    }
}
class Car extends Vehicle{

    @Override
    void start() {
        System.out.println("Key is use to start the car");
    }
}


