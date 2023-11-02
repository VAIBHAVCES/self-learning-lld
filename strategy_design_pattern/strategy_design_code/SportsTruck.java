package strategy_design_pattern.strategy_design_code;

import strategy_design_pattern.strategy_design_code.driver_strategy.SportsDriverStrategy;

public class SportsTruck extends Vehichle {
    SportsTruck(){
        super(new SportsDriverStrategy());
    }
    
}
