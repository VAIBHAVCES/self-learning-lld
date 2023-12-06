package builder;

public class main {

    public static void main(String[] args) {

        Employee developer = new DeveloperBuilder()
                .setSalary(10000)
                .setName("Vaibhav Jain")
                .setLevel(0)
                .setTeam("Advertisement")
                .build();
        Employee hr = new HRBuilder()
                .setLevel(2)
                .setName("Reshma")
                .setTeam("HR Hiring")
                .setSalary(20000)
                .build();

    }
}
