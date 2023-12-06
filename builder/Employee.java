package builder;

import java.util.List;

public class Employee {

    private String name;
    private int salary;
    private int level;
    private String team;
    private List<Employee>temmates;
    private List<String>responsibilities;

    Employee(EmployeBuilder eb){
        this.name = eb.getName();
        this.salary = eb.getSalary();
        this.level = eb.getLevel();
        this.team = eb.getTeam();
        this.temmates = eb.getTemmates();
        this.responsibilities = eb.getResponsibilities();
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getLevel() {
        return level;
    }

    public String getTeam() {
        return team;
    }

    public List<Employee> getTemmates() {
        return temmates;
    }
}
