@java.lang.Override
public void onResume() {
    super.onResume();
    if (ua.itstep.android11.moneyflow.utils.Prefs.DEBUG)
        android.util.Log.d(Prefs.LOG_TAG, "ExpensesFragment onResume ");
    
    getActivity().getContentResolver().registerContentObserver(Prefs.URI_EXPENSES, false, observerExpenses);
}