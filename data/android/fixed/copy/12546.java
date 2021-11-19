public static java.lang.String uiLanguage() {
    java.lang.String deviceLocale = java.util.Locale.getDefault().getLanguage();
    return Preferences.INSTANCE.getString(Preferences.KEY_LOCALE, deviceLocale);
}