package factory_design_pattern.code.transport_factory;

import factory_design_pattern.code.transportation_way.Transport;

public interface TransportFactory {

    public Transport get_best_mode_of_transportation(int distance);
}
