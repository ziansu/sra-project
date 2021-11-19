@java.lang.Override
public void onPause() {
    super.onPause();
    if (!(fullColorStarted)) {
        com.engstuff.coloriphornia.helpers.PrefsHelper.writeToPrefs(this, Cv.PREFS_RETAIN, Cv.LAST_COLOR, currentColorBox.getHexColorParams());
    }
    unlockInfo = false;
}