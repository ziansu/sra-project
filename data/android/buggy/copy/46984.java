public static void removeExpense(ca.ualberta.cs.team1travelexpenseapp.Expense expense) {
    java.util.ArrayList<ca.ualberta.cs.team1travelexpenseapp.Expense> expenseArray = ca.ualberta.cs.team1travelexpenseapp.ExpenseListController.getCurrentExpenseList().getExpenses();
    expenseArray.remove(expense);
    ca.ualberta.cs.team1travelexpenseapp.ExpenseListController.currentExpenseList.setExpenseList(expenseArray);
}