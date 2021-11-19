@java.lang.Override
public boolean canSwipe() {
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    boolean ob = sp.getBoolean(getString(R.string.sp_omnibox_control), true);
    return (!(io.github.UltimateBrowserProject.Activity.BrowserActivity.switcherPanel.isKeyBoardShowing())) && ob;
}