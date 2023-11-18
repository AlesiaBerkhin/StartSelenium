package oop;

public class Formula1 extends SportCar implements Movable{

    private double length;

    @Override
    public void sendSOS() {
        System.out.println("SOS from formula1" );
    }
}
