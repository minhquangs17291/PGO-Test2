package Test;

public class Ship extends Vehical {

    public Ship(int tankCap, int numberOfPlace) {
        super(tankCap, numberOfPlace);
    }

    public void swiming(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("The Ship is Swimming to (" + x+ "," + y +")");
        } else System.out.println("Can not found target coordinates");
    }


}
