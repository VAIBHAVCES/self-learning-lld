package abstract_factory_design_pattern.interior;

public class LuxuryInterior  implements Interior{
    
    @Override
    public void interior(){
        System.out.println("Luxury Interior with: Fine leather upholstery, wood or metal accents, advanced infotainment systems, premium sound systems.");
    }
}
