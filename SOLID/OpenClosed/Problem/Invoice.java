package SOLID.OpenClosed.Problem;

import SOLID.SingleResponsilbilty.Problem.Marker;

/** PROBLEM MENTIONED IN InvoiceDao.java */

public class Invoice {
    private Marker marker;
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
