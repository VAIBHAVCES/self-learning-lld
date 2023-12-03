package prototype_design_pattern.code_style_2;

public class EmployeModel implements Cloneable {
    
    public String name;
    public String username;
    EmployeModel(String n, String u){
        name = n;
        username = u;
    }
    // note very carefully I am not overriding clone here. I am just exposing
    // object's clone method here. I can override it too
    public EmployeModel clone() throws CloneNotSupportedException{
        return (EmployeModel)super.clone();
    }
    
}
