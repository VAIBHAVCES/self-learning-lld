package services.strategies;

import models.Expense;

public interface SplitStrategy {
    Expense expese = null;

    public void splitBetweenUsers(Expense e);

}
