package factory_design_pattern.code.transport_factory;

import factory_design_pattern.code.transportation_way.AirTransport;
import factory_design_pattern.code.transportation_way.RoadTransport;
import factory_design_pattern.code.transportation_way.SeaTransport;
import factory_design_pattern.code.transportation_way.Transport;

public class MaldiveTransportFactory implements TransportFactory {

    // Note Maldive is an islandic nation with more than 1000 islands which are 
    // in the area of less than 5km^2 hence sea transport is most affordable 
    // and best mode of transport for small distances. And also road transport
    // concist of cycles as there is no such space of motor vehichles due to small islands

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
