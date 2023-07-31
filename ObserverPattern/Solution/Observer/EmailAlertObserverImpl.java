package ObserverPattern.Solution.Observer;

import ObserverPattern.Solution.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "The product you requested is back in stock. Hurry up!!");
    }

    private void sendEmail(String emailId, String content) {
        System.out.println("Mail sent to: " + emailId +". Content: " + content);
    }
    
}
