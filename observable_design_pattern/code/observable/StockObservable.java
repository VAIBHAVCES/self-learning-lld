package observable_design_pattern.code.observable;

import observable_design_pattern.code.observer.NotificationObserver;

public interface StockObservable {

    public void add(NotificationObserver o);
    public void remove(NotificationObserver o);
    public void notifyObservers();
    public void setData(int newData);

    
} 