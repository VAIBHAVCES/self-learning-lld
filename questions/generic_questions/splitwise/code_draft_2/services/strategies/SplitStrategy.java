package code_draft_2.services.strategies;

import code_draft_2.models.Expense;

public interface SplitStrategy {
    Expense expese = null;

    public void splitBetweenUsers(Expense e);

}
