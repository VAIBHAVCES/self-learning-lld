package abstract_factory_design_pattern.factory;

import abstract_factory_design_pattern.engines.Engine;
import abstract_factory_design_pattern.engines.MidRangeEngines;
import abstract_factory_design_pattern.interior.Interior;
import abstract_factory_design_pattern.interior.LuxuryInterior;
import abstract_factory_design_pattern.interior.SportyInterior;

public class LuxuryCarFactory implements CarFactory{

    @Override
    public Engine createEngine(){
        return new MidRangeEngines();
    }
    // Luxury cars doesn't suport any mid range interiors it can supports only luxury or sporty
    @Override
    public Interior createInterior(String design){
        switch (design.toLowerCase()) {
            case "luxury":
                return new LuxuryInterior();
            case "sporty":
                return new SportyInterior();
            default:
                return new LuxuryInterior();
        }
    }

     @Override
    public Interior createInterior(){
        return new LuxuryInterior();
    }
    
}
