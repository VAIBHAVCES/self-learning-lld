package strategy_design_pattern.strategy_design_code;

import strategy_design_pattern.strategy_design_code.driver_strategy.NormalDrivingStrategy;

public class NormalCar extends Vehichle{
    NormalCar(){
        super(new NormalDrivingStrategy());
    }
    
}
