public void doneExpenseItem(android.view.View v) throws java.text.ParseException {
    if (createExpenseItem(v)) {
        finish();
    }
}