@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    getPreferences().setSetting("warn", "pager", true);
    getPreferences().setSetting("global", "pref_pagers", false);
    goHome();
    finish();
}