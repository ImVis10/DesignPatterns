package ObserverPattern.Solution.Observable;

import ObserverPattern.Solution.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int currentStockQuantity = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void addStock(int quantity) throws Exception {

        if (currentStockQuantity < 0) {
            throw new Exception("Stock can't go into negative.");
        } else if (currentStockQuantity == 0) {
            if (quantity > 0) {
                notifySubscribers();
            } else {
                throw new Exception("Stock can't go into negative.");
            }
        }
        currentStockQuantity += quantity;
    }

    @Override
    public int getStockQuantity() {
        return currentStockQuantity;
    }
}
