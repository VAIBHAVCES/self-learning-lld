package observable_design_pattern.code.observer;

import observable_design_pattern.code.observable.StockObservable;

public class EmailNotificationObserver implements NotificationObserver {

    String mailId;
    StockObservable observable;
    public EmailNotificationObserver(String mailId, StockObservable o){
        this.mailId = mailId;
        this.observable = o;
    }

    @Override
    public void updateObserver(){
        System.out.println("Notifying user on mail id :" + mailId);
    }
}

