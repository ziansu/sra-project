@java.lang.Override
protected void onStart() {
    super.onStart();
    dataManager = com.lunokhod.java.android.cashflowapp.DataManager.getInstance(getApplicationContext());
    updateSpinnerData();
    selectedDate = java.util.Calendar.getInstance();
    setInitialDate(selectedDate);
}