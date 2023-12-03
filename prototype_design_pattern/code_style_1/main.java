package prototype_design_pattern.code_style_1;

import prototype_design_pattern.code_style_1.EmployeModel;

public class main {
    
    public static void main(String[] args) {

        EmployeModel e = new EmployeModel("vaibhav", "jainva", "123");
        // String x = "hello";
        EmployeModel e2 = e.clone();


        System.out.println(
            "E1 - name: "+e.name+ " username: "+e.username
            +"E2 - name: "+e2.name+ " username: "+e2.username


        );

        // FUN PART IS if you check address of Pwd of e1 and e2 they will be difference
        // But more amzing this is you can never compare them without getters
        // So we clone objects without using pwd getter


        


    }
}
