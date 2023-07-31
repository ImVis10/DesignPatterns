package ObserverPattern.Solution.Observer;

import ObserverPattern.Solution.Observable.StockObservable;

public class TextAlertObserverImpl implements NotificationAlertObserver {
    String mobileNumber;
    StockObservable observable;

    public TextAlertObserverImpl(String mobileNumber, StockObservable observable) {
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendText(mobileNumber, "The product you requested is back in stock. Hurry up!!");
    }

    private void sendText(String mobileNumber, String content) {
        System.out.println("Text sent to: " + mobileNumber + ". Content: " + content);
    }
}
