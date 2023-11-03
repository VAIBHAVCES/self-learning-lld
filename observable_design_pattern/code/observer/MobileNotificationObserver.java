package observable_design_pattern.code.observer;

import java.io.InputStream;

import observable_design_pattern.code.observable.StockObservable;

public class MobileNotificationObserver implements NotificationObserver {
    String contactNo;
    StockObservable observable;

    public MobileNotificationObserver(String contactNo, StockObservable o){
        this.contactNo = contactNo;
        this.observable = o;
    }

    @Override
    public void updateObserver(){
        System.out.println("Notifying user on his contact no:" + contactNo);
    }
    InputStream
}
