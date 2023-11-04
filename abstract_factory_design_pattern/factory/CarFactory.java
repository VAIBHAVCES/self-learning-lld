package abstract_factory_design_pattern.factory;

import abstract_factory_design_pattern.engines.Engine;
import abstract_factory_design_pattern.interior.Interior;

public interface CarFactory {
    
    public Engine createEngine();

    public Interior createInterior();

    public Interior createInterior(String design);

}
