protected void startAddExpense() {
    android.content.Intent intent = new android.content.Intent(this, com.vish.cloudexpense.AddExpenseActivity.class);
    startActivity(intent);
}