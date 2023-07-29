package SOLID.SingleResponsilbilty.Solution;

public class InvoiceDao { // this class a single responsibility -- save invoices
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void save() {
        // save to DB
    }
}
