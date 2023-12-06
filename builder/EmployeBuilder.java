package builder;

import java.util.List;

public abstract class EmployeBuilder {


    private String name;
    private int salary;
    private int level;
    private String team;
    private List<Employee> temmates;
    private List<String> responsibilities;


    public List<String> getResponsibilities() {
        return responsibilities;
    }

    protected EmployeBuilder setResponsibilities(List<String> responsibilities){
        this.responsibilities = responsibilities;
        return this;
    }

    public List<Employee> getTemmates() {
        return temmates;
    }

    public EmployeBuilder setTemmates(List<Employee> temmates) {
        this.temmates = temmates;
        return this;
    }

    public String getTeam() {
        return team;
    }

    public EmployeBuilder setTeam(String team) {
        this.team = team;
        return this;
    }

    public int getLevel() {
        return level;
    }

    public EmployeBuilder setLevel(int level) {
        this.level = level;
        return this;
    }

    public int getSalary() {
        return salary;
    }

    public EmployeBuilder setSalary(int salary) {
        this.salary = salary;
        return this;
    }

    public String getName() {
        return name;
    }

    public EmployeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Employee build(){
        return new Employee(this);
    }
}
