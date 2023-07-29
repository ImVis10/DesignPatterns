package SOLID.OpenClosed.Solution;

import SOLID.OpenClosed.Problem.Invoice;

/** By making an interface out of the class, we'll be able to extend the functionality of the class  i.e. OPEN for EXTENSION but not modify the class i.e. CLOSED for MODIFICATION */
public interface InvoiceDao {
    public void save(Invoice invoice);
}
