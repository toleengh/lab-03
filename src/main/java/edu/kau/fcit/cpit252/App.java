package edu.kau.fcit.cpit252;

public class App {
    public static void main(String[] args) {
        Car c = new Car("Honda", "Accord", 2019);
        System.out.println(c);
        Car c2 = new Car("Honda", "Accord", 2019);
        RecallViewer rv = new RecallViewer(c2);
        rv.printTableView();
    }
}
