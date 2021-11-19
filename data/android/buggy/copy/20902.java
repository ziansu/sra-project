public java.lang.String getLocale() {
    java.lang.String value = getString(R.string.pref_locale, java.util.Locale.getDefault().getLanguage());
    return value;
}