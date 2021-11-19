public void stopAlarm(android.view.View view) {
    if ((sm) != null) {
        sm.close();
    }
    finish();
}