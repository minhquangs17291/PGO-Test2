package Test;


public class Carl extends Vehical {
    public int maxSpeed;
    public boolean checkEngine;

    @Override
    public boolean getCheckEngine() {
        return super.getCheckEngine();
    }

    public Carl(int tankCap, int numberOfPlace, int maxSpeed) {
        super(tankCap, numberOfPlace);
        this.maxSpeed = maxSpeed;
    }

    public void driving() {
        if (this.checkEngine == true) System.out.println("Driving...");
        else System.out.println("Stoping");

    }
}