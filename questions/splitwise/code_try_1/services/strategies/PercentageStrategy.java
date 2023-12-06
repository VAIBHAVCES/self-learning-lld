package services.strategies;

import models.Expense;
import models.exceptions.InvalidSplitDataException;
import services.UserBalanceService;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class PercentageStrategy implements SplitStrategy{

    UserBalanceService userBalanceService;
    protected Expense expense;
    public PercentageStrategy(Expense e, UserBalanceService userBalanceService) throws Exception {
        this.expense = e;
        this.userBalanceService = userBalanceService;

        validateExpence(e);
    }

    private void validateExpence(Expense e) throws  Exception{
        List<Integer> data  = e.getSplitData();
        int sum = 0;
        for(int ele: data){
            sum+= ele;
        }
        if(sum!=100){
            throw new InvalidSplitDataException("Split sum in percentage should sum up to 100");
        }
    }

    public void splitBetweenUsers(Expense e){
        int len = e.getPayees().size();
        for(int i=0;i<e.getPayees().size();i++){
            double percentage = e.getSplitData().get(i);
            double amt = e.getAmount();
            double split = (amt * percentage)/100;
            int decimalPlaces = 2;

            // Create a BigDecimal from the double value
            BigDecimal originalBigDecimal = BigDecimal.valueOf(split);

            // Use setScale method to approximate to the specified number of decimal places
            BigDecimal roundedValue = originalBigDecimal.setScale(decimalPlaces, RoundingMode.HALF_UP);

            // Convert back to double if needed
            double approximatedDouble = roundedValue.doubleValue();
            userBalanceService.userPayed(e.getPayer(), e.getPayees().get(i), approximatedDouble);

        }
    }

}
