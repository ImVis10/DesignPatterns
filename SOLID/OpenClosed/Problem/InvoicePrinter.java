package SOLID.OpenClosed.Problem;

public class InvoicePrinter { // this class a single responsibility -- print invoices
    Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print() {
        // print invoice
    }
}
