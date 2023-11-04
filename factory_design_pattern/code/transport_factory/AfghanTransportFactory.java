package factory_design_pattern.code.transport_factory;

import factory_design_pattern.code.transportation_way.AirTransport;
import factory_design_pattern.code.transportation_way.RoadTransport;
import factory_design_pattern.code.transportation_way.SeaTransport;
import factory_design_pattern.code.transportation_way.Transport;

public class AfghanTransportFactory implements TransportFactory {

    // as the afghanistan is a landlocked nation so understand that
    // taking and packagaing product for transfer via is the most costly
    //  operation you will get and also 

    @Override
    public Transport get_best_mode_of_transportation( int dist){
        if(dist>0 && dist<3000){
            System.out.println("As afghan is landlocked with no airports road is followed: ");
            return new RoadTransport();
        }else if(dist>=3000 && dist<=5000){
            return new AirTransport();
        }else{
            return new SeaTransport();
        }
    }
    
}
