package abstract_factory_design_pattern.engines;

public class EconomyEngine implements Engine{
    
    // Horse Power
    @Override
    public int getHorsePowers(){
        return 150;
    }
    // KmPH
    @Override
    public int maxSpeed(){
        return 170;
    }
}
