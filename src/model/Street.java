package model;

public class Street {
    int intersectionsAtStart;
    int intersectionsAtEnd;
    String name;
    int travelTime;

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
}
