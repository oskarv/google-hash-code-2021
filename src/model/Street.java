package model;

import java.util.ArrayList;
import java.util.List;

public class Street {
    int intersectionsAtStart;
    int intersectionsAtEnd;
    String name;
    int travelTime;
    List<Integer> numOfCarsEachTick;
    public int numOfCarsPassed = 0;

    public int getIntersectionsAtStart() {
        return intersectionsAtStart;
    }

    public void setIntersectionsAtStart(int intersectionsAtStart) {
        this.intersectionsAtStart = intersectionsAtStart;
    }

    public int getIntersectionsAtEnd() {
        return intersectionsAtEnd;
    }

    public void setIntersectionsAtEnd(int intersectionsAtEnd) {
        this.intersectionsAtEnd = intersectionsAtEnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public List<Integer> getNumOfCarsEachTick() {
        return numOfCarsEachTick;
    }

    public void setNumOfCarsEachTick(int duration) {
        numOfCarsEachTick = new ArrayList<>(duration);
        for(int i = 0; i < duration; i++) {
            numOfCarsEachTick.add(0);
        }
    }


}
