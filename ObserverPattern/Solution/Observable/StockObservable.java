package ObserverPattern.Solution.Observable;

import ObserverPattern.Solution.Observer.NotificationAlertObserver;

/** Observer is a behavioral design pattern that lets you define a
subscription mechanism to notify multiple objects about any
events that happen to the object they’re observing.
*/

public interface StockObservable {
    
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void addStock(int quantity) throws Exception;

    public int getStockQuantity();
}
