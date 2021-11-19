public void inactiveTimerReset() {
    if ((inactiveTimer) != null) {
        inactiveTimer.cancel();
        inactiveTimer = null;
        android.util.Log.i(com.givenhansco.keystonenavigation.Activities.MainMenuActivity.TAG, "Inactive Timer Reset");
    }
    inactiveTimerStart();
}