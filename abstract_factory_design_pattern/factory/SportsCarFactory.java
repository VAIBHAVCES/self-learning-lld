package abstract_factory_design_pattern.factory;

import abstract_factory_design_pattern.engines.EconomyEngine;
import abstract_factory_design_pattern.engines.Engine;
import abstract_factory_design_pattern.engines.PerformanceEngine;
import abstract_factory_design_pattern.interior.Interior;
import abstract_factory_design_pattern.interior.LuxuryInterior;
import abstract_factory_design_pattern.interior.MinimalistInterior;
import abstract_factory_design_pattern.interior.SportyInterior;

public class SportsCarFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new PerformanceEngine();
    }

    // Luxury cars doesn't suport any mid range interiors it can supports only
    // luxury or sporty
    @Override
    public Interior createInterior(String design) {
        switch (design.toLowerCase()) {
            case "normal":
                return new MinimalistInterior();
            case "sporty":
                return new SportyInterior();
            case "luxury":
                return new LuxuryInterior();
            default:
                return new SportyInterior();
        }
    }

    @Override
    public Interior createInterior() {
        return new SportyInterior();
    }
    
}
