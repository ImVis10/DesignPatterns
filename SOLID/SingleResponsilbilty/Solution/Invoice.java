package SOLID.SingleResponsilbilty.Solution;

import SOLID.SingleResponsilbilty.Problem.Marker;

public class Invoice { // Now this class has only one responsibility -- calculating the total price
    private Marker marker; // Invoice has a marker
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        int price = ((marker.price) * this.quantity);
        return price;
    }
}
