package abstract_factory_design_pattern.engines;

// These are mostlty the v8 engines
public class PerformanceEngine implements Engine{

     // Horse Power
     @Override
     public int getHorsePowers(){
         return 700;
     }
     // KmPH
     @Override
     public int maxSpeed(){
         return 400;
     }
    
}
