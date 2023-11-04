package abstract_factory_design_pattern.interior;

public class MinimalistInterior implements Interior {
    
    @Override
    public void interior(){
        System.out.println("Mid Range Interior with: clean design, reducing clutter and distractions.\n" + //
                "Features: Clean lines, uncluttered dashboards, touchscreen interfaces, simple color ");
    }
    
}
