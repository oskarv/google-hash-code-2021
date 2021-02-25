package model;

import java.util.List;

public class Car {
    int numOfStreets;
    List<String> streets;

    public int getNumOfStreets() {
        return numOfStreets;
    }

    public void setNumOfStreets(int numOfStreets) {
        this.numOfStreets = numOfStreets;
    }

    public List<String> getStreets() {
        return streets;
    }

    public void setStreets(List<String> streets) {
        this.streets = streets;
    }
}
