@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    israelbgf.gastei.mobile.actvities.ExpenseManagementActivity activity = getExpenseManagementActivity();
    return new android.app.DatePickerDialog(activity, this, activity.chosenYear, activity.chosenMonth, 1);
}