package  code_try_1.models;

import code_try_1.services.strategies.SplitStrategy;

import java.util.List;

public class Expense {
    private String payer;
    private List<String> payees;
    private int amount;

    private List<Integer>splitData;
    private SplitStrategy strategy;

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public List<String> getPayees() {
        return payees;
    }

    public void setPayees(List<String> payees) {
        this.payees = payees;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public SplitStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(SplitStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Integer> getSplitData() {
        return splitData;
    }

    public void setSplitData(List<Integer> splitData) {
        this.splitData = splitData;
    }

//    List<Integer>splitData;



}
