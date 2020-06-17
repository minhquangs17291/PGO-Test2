package Test;

public abstract class Vehical implements Action {
    private int tankCap;
    private boolean fullTank;
    private int numberOfPlace;
    public boolean checkEngine;

    public Vehical(int tankCap, int numberOfPlace) {
        this.tankCap = tankCap;
        this.numberOfPlace = numberOfPlace;
        this.checkEngine = false;
    }

    @Override
    public void start() throws EngineRunningException {
        if(this.checkEngine == true)
            throw new EngineRunningException();
        this.checkEngine = true;
    }

    @Override
    public void stop() throws EngineRunningException {
        if(this.checkEngine == false)
            throw new EngineRunningException();
        this.checkEngine = false;
    }

    public void refuel(int number) {
        if (number > this.tankCap)
            {
                this.fullTank = true;
                System.out.println("Can not refuel more than "+ this.tankCap + "litter");
            }
        else this.fullTank = false;
    }

    public boolean getCheckEngine(){
        return this.checkEngine;
    }
}
