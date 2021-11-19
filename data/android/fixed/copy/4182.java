public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    com.example.hasun.payattention.LockTimeDialog lockTimeDialog = new com.example.hasun.payattention.LockTimeDialog();
    lockTimeDialog.show(fm, "setLockTime");
}