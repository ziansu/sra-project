public void stopAlarm(android.view.View view) {
    if ((sm) != null) {
        sm.close();
    }
    finish();
    jd.android.myfirstapp.utils.Utils.release();
}