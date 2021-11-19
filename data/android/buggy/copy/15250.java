@java.lang.Override
public void run() {
    android.util.Log.d("RACEMANAGERY", "UPDATELISTVIEW RUNONUITHREAD");
    runOnUiThread(updateListView);
}