package SOLID.OpenClosed.Problem;

/** OPEN/CLOSED PRINCIPES states - A class must be OPEN for EXTENSION but CLOSED for MODIFICATION */
public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void save() {
        // save to DB
    }

    // No bugs until this point.

    /** suppose there comes a requirement to save the data to files as well */
    // WE ADD A METHOD TO ACCOMMODATE THAT REQUIREMENT

    public void saveToFile(String fileName) {
        // save invoice to a file
    }

    // Now the class is not following the OPEN/CLOSED principle as we modified the class.
    // Intuition: We are increasing the probability of occurrence of bugs with the addition of new code to the class. 

}
