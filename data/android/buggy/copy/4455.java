public void setLocale(java.util.Locale l) {
    locale = l;
    java.lang.System.setProperty(AppOptions.LOCALE, l.getLanguage());
}