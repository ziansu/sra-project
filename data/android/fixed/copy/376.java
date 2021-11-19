@java.lang.Override
protected java.lang.Boolean doInBackground(com.harlie.radiotheater.radiomysterytheater.BaseActivity... params) {
    android.util.Log.v(com.harlie.radiotheater.radiomysterytheater.data_helper.LoadRadioTheaterTablesAsyncTask.TAG, "doInBackground");
    for (int i = 0; i < 10; ++i) {
        android.os.SystemClock.sleep(1000);
    }
    return false;
}