@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    getPreferences().setSetting("global", "pref_pagers", true);
    getPreferences().setSetting("warn", "pager", true);
}