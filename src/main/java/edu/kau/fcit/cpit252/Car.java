package edu.kau.fcit.cpit252;
package edu.kau.fcit.cpit252;

import java.util.ArrayList;
import java.util.List;

public class Car implements Cloneable {
    private String make;
    private String model;
    private int year;
    List<Recall> recalls;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.recalls = fetchRecalls();  // Fetch recalls only once
    }

    private List<Recall> fetchRecalls() {
        System.out.println("********************************* Fetching recalls from NHTSA...");
        // Simulated API call (Replace with actual HTTP request)
        return new ArrayList<>(); // Assume the fetched recalls are stored here
    }

    // Implement prototype pattern with cloning
    @Override
    protected Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            // Deep copy the recalls list
            clonedCar.recalls = new ArrayList<>(this.recalls);
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning failed", e);
        }
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
}

