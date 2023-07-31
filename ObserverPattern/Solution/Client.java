package ObserverPattern.Solution;

import ObserverPattern.Solution.Observable.IphoneObservableImpl;
import ObserverPattern.Solution.Observable.StockObservable;
import ObserverPattern.Solution.Observer.EmailAlertObserverImpl;
import ObserverPattern.Solution.Observer.NotificationAlertObserver;
import ObserverPattern.Solution.Observer.TextAlertObserverImpl;

public class Client {
    
    public static void main(String[] args) throws Exception {
        
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver obsv1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver obsv2 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver obsv3 = new TextAlertObserverImpl("9191919191", iphoneStockObservable);

        iphoneStockObservable.add(obsv1);
        iphoneStockObservable.add(obsv2);
        iphoneStockObservable.add(obsv3);

        iphoneStockObservable.addStock(10);
        iphoneStockObservable.addStock(-10);
        iphoneStockObservable.addStock(10);
    }
}
