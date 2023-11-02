package observable_design_pattern.code.observer;

import observable_design_pattern.code.observable.StockObservable;

public class AdvertisingAgencyObserver implements NotificationObserver {
    String agencyName;
    StockObservable observable;
    public AdvertisingAgencyObserver(String agencyName, StockObservable o){
        this.agencyName = agencyName;
        this.observable = o;
    }

    @Override
    public void updateObserver(){
        System.out.println("Notifying advertising agencies about stock:" + agencyName);
    }

    
}
