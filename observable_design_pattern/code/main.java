package observable_design_pattern.code;

import observable_design_pattern.code.observable.IphoneObservable;
import observable_design_pattern.code.observable.StockObservable;
import observable_design_pattern.code.observer.*;
import observable_design_pattern.code.observer.NotificationObserver;

public class main {
    public static void main(String[] args) {

         StockObservable iphoneObservable = new IphoneObservable();
        NotificationObserver u1= new EmailNotificationObserver("vaibhavces@gmail.com", iphoneObservable);

        NotificationObserver u2= new MobileNotificationObserver("8826421272", iphoneObservable);

        NotificationObserver u3= new AdvertisingAgencyObserver("AAJ TAK", iphoneObservable);

        iphoneObservable.add(u1);
        iphoneObservable.add(u3);
        iphoneObservable.add(u2);

        iphoneObservable.setData(10);
        
    }

}
