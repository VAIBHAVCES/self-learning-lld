package code_draft_2.services;

import java.util.HashMap;

public class UserBalanceService {

    HashMap<String, HashMap<String, Double> >balance;

    UserBalanceService(){
        this.balance = new HashMap<>();
    }

    public void userPayed(String u1, String u2, double amt){
        // Update u1 for the balance
        HashMap<String, Double> target;
        if(balance.containsKey(u1)){
            target = balance.get(u1);
        }else{
            target = new HashMap<>();

        }
        double prevBalance = target.getOrDefault(u2, 0D);
        target.put(u2, (prevBalance+amt) );
        balance.put(u1, target);
        // Update u2

        HashMap<String, Double> paidFor;
        if(balance.containsKey(u2)){
            paidFor = balance.get(u2);
        }else{
            paidFor = new HashMap<>();

        }
        prevBalance = paidFor.getOrDefault(u1, 0D);
        paidFor.put(u1, prevBalance-amt);
        balance.put(u2, paidFor);
    }

    public void showBalances(String uid){
        if(uid==null){
            for(String user: balance.keySet()){
                showUserBalance(user);
            }
        }else{
            showUserBalance(uid);
        }
    }

    private void showUserBalance(String uid){
        HashMap<String, Double> balances = balance.get(uid);
        for(String payees : balances.keySet()){
            double amt = balances.get(payees);
            if(amt<0){
                System.out.println(uid+ " owes: "+Math.abs(amt)+" to : "+payees);

            }
        }
    }
}
