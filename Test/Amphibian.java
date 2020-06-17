package Test;

public class Amphibian implements Working{

    public boolean x;

    public void swimming() {
        System.out.println("Flow");
    }

    @Override
    public void driving() {
        System.out.println("Goes");
    }

    @Override
    public void stoping() {
        System.out.println("Stop");
    }
}
