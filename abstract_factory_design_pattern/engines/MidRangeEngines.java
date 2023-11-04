package abstract_factory_design_pattern.engines;

public class MidRangeEngines implements Engine {

     // Horse Power
     @Override
     public int getHorsePowers(){
         return 400;
     }
     // KmPH
     @Override
     public int maxSpeed(){
         return 300;
     }
    
}
