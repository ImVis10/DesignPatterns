package SOLID.SingleResponsilbilty.Problem;

/** SINGLE RESPONSIBILITY PRINCIPLE: A  class should have only 1 reason to change */

public class Invoice {
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

    /** Suppose there is a change in the logic of calculating total price may be adding service tax or gst or something of that sort.
     * This becomes reason #1 for changing the class
     */

    public void printInvoice() {
        // print the Invoice
    }

    /** Suppose there is a change in the logic of printing the Invoice. 
    So this becomes reason #2 to change the class
    */

    public void save() {
        // save the data into DB
    }
    /** For now we're saving the data into DB. Maybe there comes a need that we gotta save the data into a file.
     * This might become the reason #3 to change the class
    */

    /** The class now has 3 reasons to change which doesn't abide by the SINGLE RESPONSIBILTY PRINCIPLE*/

    /** SO HOW DO WE RESOLVE THIS. CHECKOUT SOLUTION FOLDER */
}
