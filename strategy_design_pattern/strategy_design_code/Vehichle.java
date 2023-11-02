package strategy_design_pattern.strategy_design_code;

import strategy_design_pattern.strategy_design_code.driver_strategy.DriverStrategy;

public class Vehichle {
    private DriverStrategy ds;
    
    Vehichle(DriverStrategy ds){
        this.ds = ds;
    }

    public void drive(){
        ds.drive();
    }
    
}
