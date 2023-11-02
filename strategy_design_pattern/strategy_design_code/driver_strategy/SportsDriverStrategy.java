package strategy_design_pattern.strategy_design_code.driver_strategy;

public class SportsDriverStrategy implements DriverStrategy {
    
    @Override
    public void drive(){
        System.out.println("This is sports driver strategy ");
    }
}
