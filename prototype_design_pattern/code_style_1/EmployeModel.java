package prototype_design_pattern.code_style_1;

public class EmployeModel implements CustomCloner<EmployeModel>{
    
    public String name;
    public String username;
    private String pwd;
    EmployeModel(String n, String u, String p){
        name = n;
        username = u;
        pwd = p;
    }
    

    @Override 
    public EmployeModel clone(){
        // I want to make sure pwd is deep copied not shallow copied
        // its like not just copying the address of array but storing the complete array
        // you can simplify deep copying this by using Cloneable too
        String newPwd = new String(this.pwd);
        return new EmployeModel(name, username, newPwd);
    }

  
}
