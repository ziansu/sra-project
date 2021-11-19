@java.lang.Override
public void reloadData() {
    android.util.Log.d(com.flingsoftware.personalbudget.app.budgets.BudgetDetailsData.TAG, "Fragment Data reload data");
    new com.flingsoftware.personalbudget.app.budgets.BudgetDetailsData.GetBudgetDetailsTask().execute(budget.getId());
}