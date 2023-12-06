package builder;

import java.util.ArrayList;
import java.util.List;

public class HRBuilder extends EmployeBuilder {


    HRBuilder() {
        List<String> responsibilities = new ArrayList<>();
        responsibilities.add("People's Manager");
        super.setResponsibilities(responsibilities);
    }
}