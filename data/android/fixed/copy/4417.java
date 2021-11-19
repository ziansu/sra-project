public void setLocale(final java.util.Locale locale) {
    if (locale == null) {
        this.preferences.setLocaleLanguage(StringHelper.EMPTY);
    }else {
        this.preferences.setLocaleLanguage(locale.getLanguage());
    }
}