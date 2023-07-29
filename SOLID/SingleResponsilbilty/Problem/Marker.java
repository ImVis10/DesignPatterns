package SOLID.SingleResponsilbilty.Problem;

/** SINGLE RESPONSIBILITY PRINCIPLE: A  class should have only 1 reason to change */

public class Marker {
    public String name; // changing to public just for the sake of solution
    public String color;
    public int year;
    public int price;

    public Marker(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }
}
