//package code_try_1;
import models.User;
import services.ExpenseService;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) throws Exception {


        User u1 = new User();
        u1.setName("Vaibhav");
        u1.setEmailId("vaibhav@gmail.com");
        u1.setId("u1");
        u1.setMobileNumber("984902340");

        User u2 = new User();
        u2.setName("Ram");
        u2.setEmailId("ram@gmail.com");
        u2.setId("u2");
        u2.setMobileNumber("9483928423");

        User u3 = new User();
        u3.setName("Shyam");
        u3.setEmailId("shyam@gmail.com");
        u3.setId("u3");
        u3.setMobileNumber("932008408");

        User u4 = new User();
        u4.setName("Ali");
        u4.setEmailId("ali@gmail.com");
        u4.setId("u4");
        u4.setMobileNumber("98340328490");



        ExpenseService es = new ExpenseService();
        List<String> payees = new ArrayList<>();
        payees.add(u2.getId());
        payees.add(u3.getId());
        payees.add(u4.getId());

        List<Integer>share = new ArrayList<>();
        share.add(13);
        share.add(77);
        share.add(10);

        es.createExpense(u1.getId(),payees,1300,share, "PERCENTAGE");
        es.showExpense("u2");
        es.showExpense(null);
    }
}
