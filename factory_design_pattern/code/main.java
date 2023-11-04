package factory_design_pattern.code;
import java.util.Calendar;

import factory_design_pattern.code.transport_factory.MaldiveTransportFactory;
import factory_design_pattern.code.transport_factory.TransportFactory;
import factory_design_pattern.code.transportation_way.Transport;
public class main {
    public static void main(String[] args) {
        TransportFactory tf = new MaldiveTransportFactory();
        Transport transport =  tf.get_best_mode_of_transportation(100);
        transport.transfer();
        
        System.out.println(transport);
        
    }

    
}
