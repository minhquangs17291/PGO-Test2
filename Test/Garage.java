package Test;

import java.util.*;

public class Garage {

    public int capacity;
    List<Carl> carlList = new ArrayList();

    public void addCar(Carl x) throws TooMuchCarException {
        if (carlList.size() == capacity)
            throw new TooMuchCarException() {};
        carlList.add(x);
    }
}
