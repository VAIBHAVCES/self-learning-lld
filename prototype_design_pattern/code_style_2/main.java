package prototype_design_pattern.code_style_2;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // EmployeModel e1 = new EmployeModel("vaibhav", "jaibnva");
        // EmployeModel e2 = e1.clone();
        // System.out.println(e1.name+ "  "+ e1.username);
        // System.out.println(e2.name+ "  "+ e2.username);

        String s = "jainva";
        String s2 = s;
        String s3 = new String("jainva");
        System.out.println(s2==s);

        System.out.println(s3==s);
        
    }
    
}
