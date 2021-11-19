public static void setEditedTransation(pradeet.expensemanager.Transaction newTrans) {
    newTrans.setDate(pradeet.expensemanager.ViewTransactionActivity.currentTrans.day, pradeet.expensemanager.ViewTransactionActivity.currentTrans.month, pradeet.expensemanager.ViewTransactionActivity.currentTrans.year);
    pradeet.expensemanager.ViewTransactionActivity.newTrans = newTrans;
}