package strategy_design_pattern.strategy_design_code;

import strategy_design_pattern.strategy_design_code.driver_strategy.SportsDriverStrategy;

public class SportsCar extends Vehichle {

    SportsCar(){
        super(new SportsDriverStrategy());
    }
}
