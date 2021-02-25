package model;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    int id;
    List<Street> streetsThatStart = new ArrayList<>();
    List<Street> streetsThatEnd = new ArrayList<>();

    public int getId() {
        return id;
    }

    public List<Street> getStreetsThatStart() {
        return streetsThatStart;
    }

    public List<Street> getStreetsThatEnd() {
        return streetsThatEnd;
    }
}
