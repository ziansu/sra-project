@java.lang.Override
protected void onStart() {
    super.onStart();
    com.cmput301w15t15.travelclaimsapp.activitys.EditExpenseActivity.expenseNameInput.setText(expenseName);
    if ((expense.getDate()) != null) {
        com.cmput301w15t15.travelclaimsapp.activitys.EditExpenseActivity.date.setText(sdf.format(expense.getDate()));
    }
}