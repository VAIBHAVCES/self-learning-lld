package factory_design_pattern.code.transportation_way;

public class AirTransport implements Transport {
    
    @Override
    public void transfer(){
        System.err.println("Transferring via the air transporation");
    }

}
