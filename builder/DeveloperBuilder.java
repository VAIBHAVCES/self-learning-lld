package builder;

import java.util.ArrayList;
import java.util.List;

public class DeveloperBuilder extends EmployeBuilder {


    DeveloperBuilder(){
        List<String>responsibilities = new ArrayList<>();
        responsibilities.add("Code Development");
        super.setResponsibilities(responsibilities);
    }
}
