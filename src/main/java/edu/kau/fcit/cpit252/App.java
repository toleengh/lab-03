package edu.kau.fcit.cpit252;

public class App {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", "Accord", 2019);
        System.out.println(c1);

        // Clone instead of creating a new Car object
        Car c2 = c1.clone();
        RecallViewer rv = new RecallViewer(c2);
        rv.printTableView();
    }
}
