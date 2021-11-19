public static int readKeyboardColor(final android.content.SharedPreferences prefs, final android.content.Context context) {
    int color = prefs.getInt(rkr.simplekeyboard.inputmethod.latin.settings.Settings.PREF_KEYBOARD_COLOR, rkr.simplekeyboard.inputmethod.latin.settings.Settings.UNDEFINED_PREFERENCE_VALUE_INT);
    return color == (rkr.simplekeyboard.inputmethod.latin.settings.Settings.UNDEFINED_PREFERENCE_VALUE_INT) ? rkr.simplekeyboard.inputmethod.latin.settings.Settings.readKeyboardDefaultColor(context) : color;
}