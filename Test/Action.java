package Test;

public interface Action {

    void start() throws EngineRunningException;

    void stop() throws EngineRunningException;

    default void refuel() {
        System.out.println("Refueling...");
    }

}
