package observable_design_pattern.code.observable;
import java.util.*;
import observable_design_pattern.code.observer.NotificationObserver;

public class IphoneObservable implements StockObservable {

    List<NotificationObserver> observers = new ArrayList<>();
    int stockCount = 0;
    @Override
    public void add(NotificationObserver o){
        observers.add(o);
    }

    @Override
    public void remove(NotificationObserver o){
        observers.remove(o);
    }

    @Override
    public void notifyObservers(){
        for(NotificationObserver ele: observers){
            ele.updateObserver();;
        }
    }

    public void setData(int newStockAdded){
        if(stockCount==0 && newStockAdded > 0){
            notifyObservers();  
        }
        this.stockCount = this.stockCount + newStockAdded;
    }

}
