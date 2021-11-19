@java.lang.Override
public void onBackPressed() {
    isBackPress = true;
    android.util.Log.d(Utils.TAG, "====================== onBackPress ======================");
    if ((fragment) == null) {
        changeToPauseFragment();
        gcs.sendGameEvent("game_pause", new java.lang.String[]{  });
    }
}