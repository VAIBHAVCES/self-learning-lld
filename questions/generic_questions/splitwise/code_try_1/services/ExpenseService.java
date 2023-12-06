package services;//package code_draft_1.services;

import models.Expense;
import services.strategies.PercentageStrategy;
import services.strategies.SplitStrategy;

import java.util.List;

public class ExpenseService {


    UserBalanceService userBalanceService;

    public ExpenseService(){
        this.userBalanceService = new UserBalanceService();
    }

    public Expense createExpense(String payer,
                                 List<String> payee,
                                 int amount,
                                 List<Integer> splitData,
                                 String strategy) throws Exception {
        Expense e = new Expense();
        e.setPayer(payer);
        e.setPayees(payee);
        e.setAmount(amount);
        e.setSplitData(splitData);
        SplitStrategy strategy1 =getStrategy(strategy, e);
        e.setStrategy(strategy1);
        strategy1.splitBetweenUsers(e);
        return e;
    }

    private SplitStrategy getStrategy(String strategy, Expense e) throws Exception {
        if(strategy.equals("PERCENTAGE")){
            return new PercentageStrategy(e, userBalanceService);
        }else  return null;
    }

    public void showExpense(String id){
        userBalanceService.showBalances(id);
    }

}
