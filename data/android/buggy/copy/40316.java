@org.junit.Test
public void add_budget_should_save_budget() {
    budgets.addBudget(budget);
    org.mockito.Mockito.verify(mockBudgetRepo).save(budget);
}